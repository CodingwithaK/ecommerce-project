
# fullstack-ecommerce-project

This is a fullstack single page project
---

---

## Table of Contents

1. Technologies Used
2. Setup
3. Package Layout and Descriptions
4. Future Implementations
---

---

# I. Technologies Used / I will use

## Frontend

- node.js
- angular/react
- bootstrap
- html
- css
- vscode

## Backend

- java
- lombok
- spring boot
- mysql
- postman
- intellij

## Security

- ssl
- JWT
- spring boot security

## Payment System

- stripe

---

---

# II. Setup

At the moment no setup is necessary. However, after stripe is implemented, Required keys and certificates will intentionally stripped from the application and so you will need to provide your own. This can be achieved through creating Stripe and Okta developer accounts. Otherwise the configuration files are left intact to help serve as a template. Notations for these requirements will be made in the code.

---

---

# III. Layout and Descriptions

## Frontend

The frontend of this application will be built in VSCode as an Angular project or React project and will utilize node.js in building our server connection. Boot strap will be utilized in table stylizing.

Adjustments will be made in angular.json, package.json, and tsconfig.json.


[//]: # (### src Package and File Layout:)

[//]: # ()
[//]: # (| Package/File          | Description                                                                                                                                             |)

[//]: # (| --------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |)

[//]: # (| package: app          | Contains the majority of packages and files critical to the application. Will expand on this package below.                                             |)

[//]: # (| package: assets       | contains logo and product images                                                                                                                        |)

[//]: # (| package: environments | contains our information for development, q&a, and production environments. Your publishable Stripe key will be needed for the development environment. |)

[//]: # (| file: typings.d.ts    | Declares variables for use with Stripe.                                                                                                                 |)

[//]: # (|                       |)
[//]: # ()
[//]: # (### app Package and File Layout:)

[//]: # ()
[//]: # (| Package/File        | Description                                                                                                   |)

[//]: # (| ------------------- | ------------------------------------------------------------------------------------------------------------- |)

[//]: # (| package: common     | Contains all our files for object constructors referenced on the frontend.                                    |)

[//]: # (| package: components | Contains all packages and files to create components and enact their logic in the application.                |)

[//]: # (| package: config     | Contains information for Okta oidc configuration. You will need to insert your values from Okta account here. |)

[//]: # (| package: services   | Contains files linking logic from backend methods to frontend and handling logic for front end components. .  |)

[//]: # (| package: validators | Contains means for custom validation of customer input.                                                       |)

[//]: # (| file: app.module.ts | Defines our routes.                                                                                           |)

[//]: # ()
[//]: # (---)

[//]: # ()
[//]: # (---)

## Backend

The backend of this application is comprised of a sql database built in MySql. The API is created utilizing Spring Boot and Lombok which removes a bit of boiler-plate code. Backend Application was built in intellij as a maven and spring boot project. Postman was occasionally used in testing the API.

---

### Initial Layout:

| Package/File       | Description                                                                                                                                                                                                                                                 |
| ------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| package: java      | Holds the projects main code.                                                                                                                                                                                                                               |
| package: resources | Contains the project's key store and application properties files. These files hold values for use across the application in regards to ports, paths, authentication. This will be an area where you will need to spend some time entering your own values. |

---

### Java Package Layout:

| Package/File        | Description                                                                                                                                                                                                           |
| ------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| package: config     | Classes established here are used in limiting HTTP methods, handling cors, and protecting and exposing endpoints.                                                                                                     |
| package: controller | Provides mapping for the checkout service.                                                                                                                                                                            |
| package: dao        | Files in our Data Access Object package create endpoints for our api which provides data to be used in business logic.                                                                                                |
| file: ecommerceapp  | Contains our main method and launches the application.                                                                                                                                                                |
| package: entity     | Files found in this package map our database for transfer to our front end displays of the data found there.                                                                                                          |
---
[//]: # (| package: dto        | Contains our Data Transfer Objects pertaining to purchases.                                                                                                                                                           |)
[//]: # (| package: service    | The checkout service found here handles our business logic in regards to creating a payment intent to send to Stripe for processing, generating a tracking number for the customer and providing a purchase response. |)



---

# IV. Future Implementations

Next plans for the current application include a front-end implementation fleshed out in Angular or react AWS implementation for hosting the application and making it easily accessible.

---
