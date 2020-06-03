# Product Rating 

## Assumptions

1) User can Rate from 1 to 5
2) User's rating will be as input PUT request for system
3) Avg Rating can be up to 2 decimal
4) Moment User Adds a product , User with product added values goes to DB
5) if User already Present in DB , Product Purchased will be added to User's Product List



## Execution

1) Run mongod
2) Run project on IDE or cmd java -jar "fileName".

## API

### Create User

curl --location --request POST 'http://localhost:8080/user' \
--header 'Content-Type: application/json' \
--data-raw '{
	"username":"userOne",
	"listOfProduct":"chair"
}'

### Add One Product to User

curl --location --request PUT 'http://localhost:8080/user/userOne/table_round'

### User Rates One Item

curl --location --request PUT 'http://localhost:8080/user/userOne/table/3'

### Create A Product

curl --location --request POST 'http://localhost:8080/product' \
--header 'Content-Type: application/json' \
--data-raw '{
	"productId":"bean_bag",
	"productName":"bean_bag",
	"price":10.45,
	"productDescription":"Comfy",
	"numberOfUsersRetedOne":0,
	"numberOfUsersRetedTwo":0,
	"numberOfUsersRetedThree":5,
	"numberOfUsersRetedFour":4,
	"numberOfUsersRetedFive":4
	
}'

### Get All Product Details

curl --location --request GET 'http://localhost:8080/product'


### GET 1 Product Details [This has Rating and individually rated data]

curl --location --request GET 'http://localhost:8080/product/plastic_chair'

