from flask import Flask, jsonify
import py_eureka_client.eureka_client as eureka_client

#pip install flask py_eureka_client


app = Flask (__name__)

CONTEXT_PATH = "/customer-service"
SERVICE_PORT = 5000
EUREKA_SERVICE = "http://localhost:8761/eureka/"


eureka_client.init(
    eureka_server="http://localhost:8761/eureka",
    app_name="CUSTOMER_SERVICE",
    instance_port=5000
)


@app.route(f'{CONTEXT_PATH}/customer',methods = ["GET"])
def get_customer():
    customers = [
        {"id":1,"name":"sachini"},
        {"id":2,"name":"apsara"}
    ]

    return jsonify(customers)

app.run(port = SERVICE_PORT)

#http://localhost:5000/customer-service/customer
#firstly run eureka server
#api gateway run
#you can server run

