# AD2 CW Supermarket Microservice

Welcome to the **AD2 CW Supermarket Microservice** project! This project is designed to provide a scalable, modular architecture for managing a supermarket's core operations. It includes microservices for handling inventory, orders, employees, and product data. Each service is built as a separate microservice with its own API, following modern microservice architecture principles, and is integrated using Spring Boot.

# Microservices Project

This project demonstrates a microservices architecture using Spring Boot, Node.js, and Python.

## Services
1. **Eureka Server**: Service discovery server.
2. **Product Service**: Manages product data.
3. **Order Service**: Manages orders.
4. **Inventory Service**: Manages inventory (Node.js).
5. **Customer Service**: Manages customer data (Python).

## Running the Project
1. Start the Eureka server.
2. Start the product, order, inventory, and customer services.
3. Access the Eureka dashboard at `http://localhost:8761`.

## Technologies
- Spring Boot
- Node.js
- Python (Flask)
- MongoDB

## Table of Contents
<details>
  <summary><strong>Table of Contents</strong></summary>
  <ol>
    <li><a href="#project-overview">Project Overview</a></li>
    <li><a href="#services">Microservices</a></li>
    <li><a href="#api-endpoints">API Endpoints</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#license">License</a></li>
  </ol>
</details>

## Project Overview

This project simulates a supermarket system by implementing the following microservices:

- **Inventory Service** – Manages the inventory of products in the supermarket, including adding, removing, and updating product quantities.
- **Order Service** – Handles the order creation, order status tracking, and order history.
- **Employee Service** – Manages the employees working in the supermarket, including employee details, roles, and tasks.
- **Product API Service** – Exposes the product details, such as name, price, and description, and allows the system to fetch product information.

The microservices are designed to be independent but communicate with each other via RESTful APIs. 


### Prerequisites

- Java 17 or later
- Maven and gradle
- Spring Boot (for backend services)
- python
- notJs

### Cloning the Repository
```
https://github.com/ApsaraWitharana/AD2-CW-Supermarket-Microservices.git
```

### API Document
```
https://documenter.getpostman.com/view/35385905/2sAYdbPtSH
```

## 💜License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For inquiries or collaboration:
- **Author:** [Sachini Apsara](https://github.com/ApsaraWitharana)
  
<div align="center">
    © 2025 All Rights Reserved, Designed By Sachini Apsara
</div>


⭐ **Feel free to contribute, star the repo, and explore more!**
