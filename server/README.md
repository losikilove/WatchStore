# REST API
- The current port of server is **8080**

## **ENVIRONEMNT FILE**
- The .env file locates in the "resources" folder with the path: .\WatchStore_SpringBoot_ReactJS\WatchStore\server\src\main\resources
- That file includes:
    - SERVER_PORT="8080"
    - JDBC_DATABASE_URL="jdbc:mysql://localhost:3306/watchstore"
    - JDBC_DATABASE_USERNAME=
    - JDBC_DATABASE_PASSWORD=
    - JDBC_DATABASE_DRIVER="com.mysql.cj.jdbc.Driver"  

## **PRODUCT**

### Get all products: **GET** /api/product/all
- **For instance**: .get("http://localhost:8080/api/product/all")

### Get a product by id (its type is integer): **GET** /api/product/:id 
- **For instance**: .get("http://localhost:8080/api/product/1")

### Add a new product: **POST** /api/product/add
- **For instance**: .post("http://localhost:8080/api/product/add",<br />
    body: {<br />
    "title": "MOVADO 0607012",<br />
    "brand_name": "MOVADO",<br />
    "chain": "Metal",<br />
    "face_material": "Shapphire",<br />
    "dial": "Analog",<br />
    "face_shape": "Circle",<br />
    "machine": "Automatic",<br />
    "for_object": "Male",<br />
    "current_price": 2007,<br />
    "has_left": 7,<br />
    "linkImages": [<br />
    &nbsp;&nbsp;&nbsp;&nbsp;{"link_image": "http://localhost:3000"}<br />
    ]})
- **"linkImages"** can be ignored

### Update a product: **PATCH** /api/product/update/{id}
- **For instance**: .patch("http://localhost:8080/api/product/update/1",<br />
    body: {<br />
    "title": "MOVADO 0607012",<br />
    "brand_name": "HUBLOX",<br />
    "chain": "Metal",<br />
    "dial": "Analog",<br />
    "machine": "Automatic",<br />
    "for_object": "Male",<br />
    "current_price": 2007,<br />
    "has_left": 0})

- Can update **a resource partially**
