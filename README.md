# store-management-system


The end user of the Store Management System should be able to: 

  a.	Launch the application and be presented with a list of stores (no paging is necessary).
  b.	Insert a new store.  
  c.	Update an existing store selected from the list. 
  d.	Delete a store from the list after providing a confirmation dialog. 

# Spring boot application 
Build and deploy using bellow cammands
  
  mvn clean innsll
  java -jar <jar file name>

# In Mermory Database H2
  Access Using below URL 
  http://localhost:9797/console
  user: admin
  pass: admin
# APP Endipoints

  
  # GET - All Stores
    http://localhost:9797/store/get-stores
  # GET - Store by ID
    http://localhost:9797/store/get-stores/{id}
  # POST - Add Store
    http://localhost:9797/store/add-store
    Body Example:
      {
        "id": 2,
        "type": "TestType1",
        "name": "TestName1",
        "address": "1006 Blueberry CT",
        "address2": null,
        "city": "Edison",
        "state": "NJ",
        "zip": "08817",
        "location": {
            "lat": 44.85466,
            "lon": -93.24565
        },
        "hours": "Mon: 10-9:30; Tue: 10-9:30; Wed: 10-9:30; Thurs: 10-9:30; Fri: 10-9:30; Sat: 10-9:30; Sun: 11-7",
        "services": [
            "Geek Squad Services",
            "Best Buy Mobile",
            "Best Buy For Business",
            "Apple Shop",
            "Hablamos Español",
            "Camera Experience Shop ",
            "Electronics Recycling",
            "Magnolia Home Theater",
            "Samsung Experience Shop",
            "Windows Store"
        ]
      }
      
  # PUT - Update Store
    http://localhost:9797/store/update-store
    Body Example:
      {
        "id": 2,
        "type": "TestType1",
        "name": "TestName1",
        "address": "1006 Blueberry CT",
        "address2": null,
        "city": "Edison",
        "state": "NJ",
        "zip": "08817",
        "location": {
            "lat": 44.85466,
            "lon": -93.24565
        },
        "hours": "Mon: 10-9:30; Tue: 10-9:30; Wed: 10-9:30; Thurs: 10-9:30; Fri: 10-9:30; Sat: 10-9:30; Sun: 11-7",
        "services": [
            "Geek Squad Services",
            "Best Buy Mobile",
            "Best Buy For Business",
            "Apple Shop",
            "Hablamos Español",
            "Camera Experience Shop ",
            "Electronics Recycling",
            "Magnolia Home Theater",
            "Samsung Experience Shop",
            "Windows Store"
        ]
      }  
   
   # DELETE - Update Store
    http://localhost:9797/store/delete-store/{id}
 
 
