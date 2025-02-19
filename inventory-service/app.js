const  express = require("express")
const  {Eureka} = require("eureka-js-client");
const app = express();
const port = 3000;

const router = express.Router();

router.get('/inventory',(req,res)=>{
    res.json({
        item:["Milk","Egg","Bread"],
        message: "This is inventory service"
    })
})

app.use("/inventory-service",router)
const eurekaClient = new Eureka({
    instance: {
        instanceId: "inventory-service",
        app: "INVENTORY-SERVICE",
        hostName: "localhost",
        ipAddr: "127.0.0.1",
        port: {
            $: port,
            "@enabled": true,
        },
        vipAddress: "inventory-service",
        dataCenterInfo: {
            "@class": "com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo",
            name: "MyOwn",
        },
    },
    eureka: {
        host: "localhost",
        port: 8761,
         //servicePath: "/eureka/app/",
        // or
        // servicePath: "/eureka/",
        // or
        // empty
    },
});
app.listen(port,() => {
    console.log(`Inventory service running on port :${port}`)

    eurekaClient.start((err) =>{
        if (err) {
            console.error(err)
        } else  {
            console.log("Successfully registered")
        }
    })
})