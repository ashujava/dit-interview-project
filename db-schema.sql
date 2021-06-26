CREATE SCHEMA dit_schema ;

use dit_schema;

CREATE TABLE users (
                       id int NOT NULL AUTO_INCREMENT,
                       lastname varchar(255) NOT NULL,
                       firstname varchar(255),
                       username varchar(255) UNIQUE,
                       password varchar(255),
                       last_login_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                       PRIMARY KEY (id)
);