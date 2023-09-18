<h1>Challenge 1 - week IV</h1>

> Status: finished ✅
>
> + Description :
> This project is done with two endponts, a post that only receives 4 brands, they are: FORD, CHEVROLET, BMW, VOLVO and get that can capture cars directly from the database, by chassis ID.
>

> ### The fields used in the Entity class are:
> + chassisId (automatically incremented as cars are added)
> + model
> + color
> + fabricationYear
> + brand (Enum, receives only four marks in the database: FORD, CHEVROLET, BMW, VOLVO)
>
> ### To add a car you need to fill in the following fields:
> + model
> + color
> + fabricationYear
> + brand
>
> ### Example of how to add cars to the database using POST:
> 
> #### curl --location 'http://localhost:8080/cars' \
> #### --header 'Content-Type: application/json' \
> #### --data '{
> ####   "model": "Onix Plus",
> ####   "brand":"CHEVROLET",
> ####   "color": "red",
> ####   "fabricationYear": "2023"
> #### }
> 
> + The fields are allocated in a table in the MySQL
> 
> ### Example of how to pick up cars from Database using GET:
> 
> #### curl --location --request GET 'http://localhost:8080/cars/2' \
> 
> after "cars/" is used the id to capture, the car with that specific id
> 
>
> ### The technologies used to develop this project were:
> 
> + Java 17
> + SpringBoot
> + MySQL version 8.0.34.0

  
