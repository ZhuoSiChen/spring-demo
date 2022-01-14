CREATE TABLE tb_user (
   id bigint auto_increment,
   name VARCHAR(50) NOT NULL,
   age VARCHAR(20) ,
   submission_date DATE
);

CREATE TABLE tb_order (
   id bigint auto_increment,
   user_id VARCHAR(50) NOT NULL,
   order_time DATE
);