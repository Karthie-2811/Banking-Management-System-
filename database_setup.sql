-- Run this in MySQL before starting the application

CREATE DATABASE IF NOT EXISTS advjavamorning2;
USE advjavamorning2;

CREATE TABLE IF NOT EXISTS bankuser (
    uname        VARCHAR(50)  PRIMARY KEY,
    ufullname    VARCHAR(100) NOT NULL,
    upassword    VARCHAR(50)  NOT NULL,
    adhar        BIGINT       NOT NULL,
    phoneno      BIGINT       NOT NULL,
    accountno    BIGINT       NOT NULL UNIQUE,
    accountbalance DOUBLE     NOT NULL
);

CREATE TABLE IF NOT EXISTS transactionhistory (
    txnid          BIGINT AUTO_INCREMENT PRIMARY KEY,
    uname          VARCHAR(50)   NOT NULL,
    txntype        VARCHAR(20)   NOT NULL,
    amount         DOUBLE        NOT NULL,
    balanceafter   DOUBLE        NOT NULL,
    description    VARCHAR(150),
    txndate        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_transactionhistory_uname FOREIGN KEY (uname) REFERENCES bankuser(uname)
);
