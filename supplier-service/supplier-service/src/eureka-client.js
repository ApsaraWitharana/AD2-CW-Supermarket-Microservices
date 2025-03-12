const Eureka = require('eureka-js-client').Eureka;
const dotenv = require('dotenv');
dotenv.config();

const client = new Eureka({
    instance: {
        app: 'supplier-service',
        instanceId: 'supplier-service:${process.env.PORT}',
        hostName: 'localhost',
        ipAddr: '127.0.0.1',
        statusPageUrl: `http://localhost:${process.env.PORT}/health`,
        healthCheckUrl: `http://localhost:${process.env.PORT}/health`,
        port: {
            '$': parseInt(process.env.PORT),
            '@enabled': 'true',
        },
        vipAddress: 'supplier-service',
        dataCenterInfo: {
            '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
            name: 'MyOwn',
        },
    },
    eureka: {
        host: process.env.EUREKA_HOST || 'localhost',
        port: process.env.EUREKA_PORT || 8761,
        servicePath: '/eureka/apps/',
        maxRetries: 3,
        requestRetryDelay: 500,
    },
});

module.exports = client;


/**
 #* @author : sachini apsara
 #* @date : 2024-03-12
 #**/