 # PROJECT FEATURES
   
## PROJECT TITLE : STOCK MANAGEMENT APPLICATION
   
### STOCK_DETAILS TABLE
    
```sql 
CREATE TABLE STOCK_DETAILS                          
(
PRODUCT_ID NUMBER,
PRODUCT_NAME VARCHAR(30),
ORDERED_DAY DATE,
PRODUCT_QUANTITY NUMBER,
CONSTRAINTS STK_1 PRIMARY KEY(PRODUCT_ID)
);
```

#### DATA INSERTION OF STOCKS

```sql 
INSERT INTO STOCK_DETAILS (PRODUCT_ID, PRODUCT_NAME, ORDERED_DAY, PRODUCT_QUANTITY) VALUES (12345,'Asian Paints', '02-05-21', 100)
INSERT ALL
INTO STOCK_DETAILS VALUES (12346, 'Britannia Inds', '28-04-21', 140)
INTO STOCK_DETAILS VALUES (12347, 'Wipro', '30-04-21', 340)
INTO STOCK_DETAILS VALUES (12348, 'Trends', '05-06-21', 358)
INTO STOCK_DETAILS VALUES (12349, 'Nippon', '10-06-21', 180)
;
```

### SELECTION AND PROJECTION 

#### DISPLAY THE ENTIRE STOCK_DETAILS INFORMATION

``` sql
SELECT * FROM STOCK_DETAILS;
```

### PRODUCT_DETAILS TABLE

```sql
CREATE TABLE PRODUCT_DETAILS
(
PRODUCT_ID NUMBER,
PRODUCT_NAME VARCHAR (30),
PRODUCT_COST NUMBER,
CONSTRAINTS STK_14 PRIMARY KEY (PRODUCT_ID),
CONSTRAINTS STK_15 FOREIGN KEY (PRODUCT_ID) REFERENCES STOCK_DETAILS (PRODUCT_ID)
);
```

#### DATA INSERTION OF PRODUCTS

```sql
INSERT INTO PRODUCT_DETAILS (PRODUCT_ID, PRODUCT_NAME, PRODUCT_COST) VALUES (12345, 'Asian Paints', 340674);
INSERT ALL
INTO PRODUCT_DETAILS VALUES (12346, 'Britannia Inds', 243200)
INTO PRODUCT_DETAILS VALUES (12347, 'wipro', 543200)
INTO PRODUCT_DETAILS VALUES (12348, 'Trends', 376670)
INTO PRODUCT_DETAILS VALUES (12349, 'Nippon', 450670)
;
```
#### SELECTION AND PROJECTION

DISPLAY THE INFORMATION OF PARTICULAR PRODUCT DETAIL

```sql 
SELECT * FROM PRODUCT_DETAILS WHERE PRODUCT_ID = 12348;
```

### SUPPLIER_DETAILS TABLE

``` sql 
CREATE TABLE SUPPLIER_DETAILS                       
(
PRODUCT_ID NUMBER,
SUPPLIER_ID NUMBER,
SUPPLIER_NAME VARCHAR(30),
SUPPLIER_COMPANY VARCHAR(30),
SUPPLIER_CITY VARCHAR(30),
SUPPLIER_AREA VARCHAR(2000),
SUPPLIER_EMAIL VARCHAR(50),
SUPPLIER_PH_NO NUMBER,
CONSTRAINTS STK_2 PRIMARY KEY (PRODUCT_ID),
CONSTRAINTS STK_3 FOREIGN KEY (PRODUCT_ID) REFERENCES STOCK_DETAILS (PRODUCT_ID),
CONSTRAINTS STK_4 UNIQUE (SUPPLIER_PH_NO),
CONSTRAINTS STK_5 CHECK (LENGTH (SUPPLIER_PH_NO) = 10)
);
```

#### DATA INSERTION OF SUPPLIER_DETAILS

```sql 
INSERT INTO SUPPLIER_DETAILS (PRODUCT_ID, SUPPLIER_ID, SUPPLIER_NAME, SUPPLIER_COMPANY, SUPPLIER_CITY, SUPPLIER_AREA, SUPPLIER_EMAIL, SUPPLIER_PH_NO)
VALUES (12345, 001, 'Venkat', 'SAP', 'Chennai', 'Ambattur', 'venkatrmns@gmail.com', 3457823456);
INSERT ALL
INTO SUPPLIER_DETAILS VALUES (12346, 002, 'Saran', 'Parle', 'Coimbatore', 'MKV', 'saranravi@gmail.com', 8785643290)
INTO SUPPLIER_DETAILS VALUES (12347, 003, 'Sanjeev', 'Vimco', 'Bangalore', 'tend_IT_park', 'sanjeevprasad@gmail.com', 7384562918)
INTO SUPPLIER_DETAILS VALUES(12348, 004, 'Poornima', 'Plintron', 'Kochin', 'Kaloor', 'dpoorni.d@gmail.com', 9873452613)
INTO SUPPLIER_DETAILS VALUES (12349, 005, 'Martin', 'Nippon', 'Kochin', 'Edapally', 'martinrobert@gmail.com', 6345789274)
```

#### SELECT AND PROJECTION

DISPLAY THE DETAILS OF REQUIRED SUPPLIERS

```sql
SELECT * FROM SUPPLIER_DETAILS WHERE SUPPLIER_ID IN (001, 003, 004);
```

### CONSUMER_DETAILS TABLE

```sql 
CREATE TABLE CONSUMER_DETAILS                  
(
PRODUCT_ID NUMBER,
CONSUMER_ID NUMBER,
CONSUMER_NAME VARCHAR(30),
CONSUMER_CITY VARCHAR(30),
CONSUMER_PRODUCT VARCHAR(30),
CONSUMER_PRICE NUMBER,
CONSUMER_QUANTITY NUMBER,
CONSTRAINTS STK_6 PRIMARY KEY (PRODUCT_ID),
CONSTRAINTS STK_7 FOREIGN KEY (PRODUCT_ID) REFERENCES STOCK_DETAILS (PRODUCT_ID)
);
```

#### DATA INSERTION OF CONSUMER_DETAILS TABLE

```sql
INSERT INTO CONSUMER_DETAILS (PRODUCT_ID, CONSUMER_ID, CONSUMER_NAME, CONSUMER_CITY, CONSUMER_PRODUCT, CONSUMER_PRICE, CONSUMER_QUANTITY) 
VALUES (12345, 201, 'Arun', 'TrichY', 'Asian Paints', 54362, 151);
INSERT ALL
INTO CONSUMER_DETAILS VALUES (12346, 202, 'Avinash', 'Chennai', 'Britannia Inds', 63540, 100)
INTO CONSUMER_DETAILS VALUES (12347, 203, 'Manoj', 'Kanniyakumari', 'Wipro', 73645, 250)
INTO CONSUMER_DETAILS VALUES (12348, 204, 'Raja', 'Pondicherry', 'Trends', 45637, 190)
INTO CONSUMER_DETAILS VALUES (12349, 205, 'Chandru', 'Villupuram', 'Nippon', 76453, 176);
```


#### SELECTION AND PROJECTION

DISPLAY THE CONSUMER CITY DETAILS

```sql 
SELECT CONSUMER_CITY FROM CONSUMER_DETAILS;
```

### IMPORT_DETAILS TABLE

```sql 
CREATE TABLE IMPORT_DETAILS                   
(
PRODUCT_ID NUMBER,
IMPORT_ID NUMBER,
IMPORT_DAY DATE,
IMPORT_ORIGIN VARCHAR(30),
IMPORT_COST NUMBER,
CONSTRAINTS STK_8 PRIMARY KEY (PRODUCT_ID),
CONSTRAINTS STK_9 FOREIGN KEY (PRODUCT_ID) REFERENCES STOCK_DETAILS (PRODUCT_ID));
```

#### DATA INSERTION OF IMPORT_DETAILS TABLE

```sql
INSERT INTO IMPORT_DETAILS (PRODUCT_ID, IMPORT_ID, IMPORT_DAY, IMPORT_ORIGIN, IMPORT_COST) VALUES (12345, 01032, '02-05-21', 'Chennai', 14609);
INSERT ALL 
INTO IMPORT_DETAILS VALUES (12346, 02432, '28-04-21', 'Coimbatore', 34260)
INTO IMPORT_DETAILS VALUES (12347, 01005, '30-04-21', 'Bangalore', 32089)
INTO IMPORT_DETAILS VALUES (12348, 03120, '05-06-21', 'Chennai', 12830)
INTO IMPORT_DETAILS VALUES (12349, 04560, '10-06-21', 'Thiruvallur', 20683);
```

#### SELECTION AND PROJECTION

DISPLAY THE SUM AND AVERAGE OF IMPORT COST

```sql
SELECT SUM (IMPORT_COST), AVG (IMPORT_COST) FROM IMPORT_DETAILS; 
```

### EXPORT_DETAILS TABLE

```sql 
CREATE TABLE EXPORT_DETAILS             
(
PRODUCT_ID NUMBER,
EXPORT_ID NUMBER,
EXPORT_DAY DATE,
EXPORT_DESTINATION VARCHAR(30),
EXPORT_COST NUMBER,
CONSTRAINTS STK_10 PRIMARY KEY (PRODUCT_ID),
CONSTRAINTS STK_11 FOREIGN KEY (PRODUCT_ID) REFERENCES STOCK_DETAILS (PRODUCT_ID));
```

#### DATA INSERTION OF EXPORT_DETAILS TABLE

```sql
INSERT INTO EXPORT_DETAILS (PRODUCT_ID, EXPORT_ID, EXPORT_DAY, EXPORT_DESTINATION, EXPORT_COST) VALUES (12345, 2437, '05-06-21', 'Trichy', 25490);
INSERT ALL 
INTO EXPORT_DETAILS VALUES (12346, 1267, '12-06-21', 'Pondicherry', 34890)
INTO EXPORT_DETAILS VALUES (12347, 3645, '07-06-21', 'Chennai', 15870)
INTO EXPORT_DETAILS VALUES (12348, 3645, '07-06-21', 'Chennai', 15870);
```

#### SELECTION AND PROJECTION

FIND THE EXPORT DESTINATION TO THE EXPORT_ID NUMBERED 1267

```sql 
SELECT EXPORT_DESTINATION FROM EXPORT_DETAILS WHERE EXPORT_ID = 1267;
```

### TRACKING_DETAILS TABLE

```sql
CREATE TABLE TRACKING_DETAILS                  
(
PRODUCT_ID NUMBER,
PRODUCT_NAME VARCHAR(30),
TRACKING_ID NUMBER,
DELIVERY_DAY DATE,
HANDLER_NAME VARCHAR(30),
HANDLER_PH_NO NUMBER,
CONSTRAINTS STK_12 PRIMARY KEY (PRODUCT_ID),
CONSTRAINTS STK_13 FOREIGN KEY (PRODUCT_ID) REFERENCES STOCK_DETAILS (PRODUCT_ID)
);
```

#### DATA INSERTION OF TRACKING_DETAILS TABLE

```sql
INSERT INTO TRACKING_DETAILS (PRODUCT_ID, PRODUCT_NAME, TRACKING_ID, DELIVERY_DAY, HANDLER_NAME, HANDLER_PH_NO) VALUES (12345, 'Asian Paints', 87645, '15-06-21', 'Ajay', 7895431270);
INSERT ALL
INTO TRACKING_DETAILS VALUES (12346, 'Britannia Inds', 54378, '10-06-21', 'Raj', 6345789231)
INTO TRACKING_DETAILS VALUES (12347, 'Wipro', 76548, '13-06-21', 'Prasad', 9867543290);
```

#### SELECTION AND PROJECTION

DISPLAYED OUTPUT USING MULTIPLE ROW SUB QUERY CONCEPT

```sql
SELECT PRODUCT_ID, HANDLER_NAME, HANDLER_PH_NO FROM TRACKING_DETAILS WHERE PRODUCT_ID IN (SELECT PRODUCT_ID FROM TRACKING_DETAILS WHERE PRODUCT_ID IN (12345, 12347));
```


