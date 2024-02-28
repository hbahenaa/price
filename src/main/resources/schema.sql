CREATE TABLE PRICE (
                       ID INT NOT NULL,
                       BRAND_ID INT NOT NULL,
                       START_DATE TIMESTAMP NOT NULL,
                       END_DATE TIMESTAMP NOT NULL,
                       PRICE_LIST INT NOT NULL,
                       PRODUCT_ID INT NOT NULL,
                       PRIORITY INT NOT NULL,
                       PRICE NUMERIC(20, 2) NOT NULL,
                       CURRENCY VARCHAR(4) NOT NULL,
                       LAST_UPDATE TIMESTAMP NOT NULL,
                       LAST_UPDATE_BY VARCHAR(50) NOT NULL,
                       PRIMARY KEY (ID)
);