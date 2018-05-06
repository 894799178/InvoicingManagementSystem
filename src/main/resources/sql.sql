
#供应商信息表
CREATE TABLE supplier_Info(
    id INT  PRIMARY KEY AUTO_INCREMENT,
    supplier_name VARCHAR(255),
    companyName VARCHAR (255),
    tel VARCHAR(11),
    mail VARCHAR(20)
);
#客户信息表
CREATE TABLE customer_Info(
    id INT PRIMARY KEY AUTO_INCREMENT,
    customentName VARCHAR(255),
    tel VARCHAR(11),
    mail VARCHAR(20)
);
#商品信息表
CREATE TABLE commodity_Info(
   id INT PRIMARY KEY AUTO_INCREMENT,
   itemName VARCHAR(255),
   supplierName VARCHAR(255),
   price DOUBLE,
   amount INT
);
#进货主表
CREATE TABLE stock_main(
   id INT PRIMARY KEY AUTO_INCREMENT,
   item_Id INT,
   operator VARCHAR(255),
   item_amount INT,
   price_amount DOUBLE,
   item_price DOUBLE
);
#销售主表
CREATE TABLE sell_main(
    id INT PRIMARY KEY AUTO_INCREMENT,
    item_id INT,
    sell_item_amount INT,
    sell_money DOUBLE
);