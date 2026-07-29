<div align="center">

# 🏦 Banking Management System

### *A full-stack Java web application for secure, everyday digital banking*

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![Tomcat](https://img.shields.io/badge/Tomcat-10.x-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=black)](https://tomcat.apache.org/)
[![MySQL](https://img.shields.io/badge/MySQL-8.x-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![JSP](https://img.shields.io/badge/JSP-Servlets-orange?style=for-the-badge&logo=jsonwebtokens&logoColor=white)](#)
[![License](https://img.shields.io/badge/License-MIT-2ea44f?style=for-the-badge)](#-license)

*Login • Register • Deposit • Withdraw • Transfer • Track — all from one clean dashboard.*

</div>

---

## 📖 Overview

**Banking Management System** is a Java EE web application that simulates the core operations of a retail bank. Built with **Servlets, JSP, JDBC, and MySQL**, and packaged with **Maven**, it lets users register an account, log in, check their balance, deposit and withdraw funds, transfer money to other users, and review a full transaction history — all through a lightweight web interface deployable on Apache Tomcat.

> 💡 Think of it as a teaching-grade "digital bank branch" — great for learning Java EE architecture, JDBC, and MVC-style servlet design.

---

## ✨ Features

<table>
<tr>
<td width="50%" valign="top">

### 👤 Account Management
- 📝 **User Registration** with Aadhaar, phone & auto-generated account number
- 🔐 **Secure Login** using username & password
- 📊 **Dashboard** showing account overview

</td>
<td width="50%" valign="top">

### 💰 Money Operations
- 💵 **Deposit** funds to your account
- 🏧 **Withdraw** cash with balance validation
- 💸 **Send Money** to another registered user
- 📜 **Transaction History** for every credit & debit

</td>
</tr>
</table>

---

## 🧱 Tech Stack

| Layer                | Technology                                   |
|----------------------|-----------------------------------------------|
| 🖥️ **Frontend**       | HTML, JSP                                     |
| ⚙️ **Backend**        | Java Servlets (Jakarta EE)                    |
| 🗄️ **Database**       | MySQL 8.x                                     |
| 🔌 **DB Connectivity** | JDBC (MySQL Connector/J)                     |
| 📦 **Build Tool**     | Apache Maven                                  |
| 🚀 **Server**         | Apache Tomcat 10.x                            |

---

## 🗂️ Project Structure

```text
BankingManagementSystem/
├── 📄 pom.xml                                ← Maven build configuration
├── 🗃️ database_setup.sql                     ← Run this in MySQL first
└── 📁 src/main/
    ├── ☕ java/
    │   ├── Beans/
    │   │   ├── BankUserBean.java             ← User data model
    │   │   └── TransactionBean.java          ← Transaction data model
    │   ├── DAO/
    │   │   └── BankDAO.java                  ← Core database operations
    │   ├── DbDetails/
    │   │   ├── DbInfo.java                   ← 🔑 DB credentials (edit here)
    │   │   └── CreateConnection.java         ← JDBC connection handler
    │   └── BankServlets/
    │       ├── UserLoginServlet.java
    │       ├── UserRegistrationServlet.java
    │       ├── DepositServlet.java
    │       ├── WithdrawlServlet.java
    │       ├── SendMoneyServlet.java
    │       └── TransactionHistoryServlet.java
    └── 🌐 webapp/
        ├── WEB-INF/web.xml
        ├── userLogin.html                    ← Entry page
        ├── userRegistration.html
        ├── withdrawl.html
        ├── sendmoney.html
        ├── home.jsp                          ← Dashboard
        ├── balance.jsp
        ├── deposit.jsp
        ├── transactionHistory.jsp
        └── msg.jsp
```

---

## ✅ Prerequisites

| 🛠️ Tool         | 📌 Version Required   |
|------------------|------------------------|
| Java JDK         | 17 or higher           |
| Apache Maven     | 3.6+                   |
| Apache Tomcat    | 10.x *(Jakarta EE)*    |
| MySQL            | 8.x                    |

> ⚠️ **Heads up:** This project uses `jakarta.servlet.*` packages, so **Tomcat 9 and below will NOT work**. Tomcat 10.x is mandatory.

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Karthie-2811/Banking-Management-System-.git
cd Banking-Management-System-
```

### 2️⃣ Set Up the Database

Open MySQL Workbench or the MySQL CLI and run:

```sql
source path/to/database_setup.sql
```

Or simply copy-paste the contents of `database_setup.sql` into your MySQL client.

This creates:
- 🏦 Database: `advjavamorning2`
- 👥 Table: `bankuser`
- 📜 Table: `transactionhistory`

### 3️⃣ Configure Database Credentials

Open `src/main/java/DbDetails/DbInfo.java` and update the values to match your local MySQL setup:

```java
String uname    = "root";       // 👉 your MySQL username
String password = "system";     // 👉 your MySQL password
String url      = "jdbc:mysql://localhost:3306/advjavamorning2";
```

### 4️⃣ Build the Project

```bash
mvn clean package
```

This generates `target/BankingManagementSystem.war` 📦

### 5️⃣ Deploy to Tomcat

1. Copy `target/BankingManagementSystem.war` into Tomcat's `webapps/` folder.
2. Start the server:

   | OS               | Command                     |
   |------------------|------------------------------|
   | 🪟 Windows       | `bin/startup.bat`            |
   | 🐧 Linux / 🍎 macOS | `bin/startup.sh`         |

### 6️⃣ Launch in Your Browser

```
http://localhost:8080/BankingManagementSystem/
```

🎉 You'll land on the **Login Page** — register a new account or sign in to get started!

---

## 🧭 Application Routes

| 🚦 Feature          | 🔗 Page                     |
|---------------------|------------------------------|
| 🔑 Login            | `userLogin.html`             |
| 🆕 Register         | `userRegistration.html`      |
| 🏠 Dashboard        | `home.jsp` *(post-login)*    |
| 💵 Deposit Money    | `deposit.jsp`                |
| 🏧 Withdraw Money   | `withdrawl.html`             |
| 💸 Send Money       | `sendmoney.html`             |
| 📊 Check Balance    | `balance.jsp`                |
| 📜 Transaction History | `transactionHistory.jsp` |

---

## 🗄️ Database Schema

<details>
<summary>📋 <strong>Click to view schema details</strong></summary>

**`bankuser`**

| Column           | Type          | Notes                  |
|------------------|---------------|-------------------------|
| `uname`          | VARCHAR(50)   | 🔑 Primary key          |
| `ufullname`      | VARCHAR(100)  | Full name               |
| `upassword`      | VARCHAR(50)   | Login password          |
| `adhar`          | BIGINT        | Aadhaar number          |
| `phoneno`        | BIGINT        | Phone number            |
| `accountno`      | BIGINT        | 🔒 Unique account number |
| `accountbalance` | DOUBLE        | Current balance         |

**`transactionhistory`**

| Column          | Type         | Notes                              |
|-----------------|--------------|-------------------------------------|
| `txnid`         | BIGINT       | 🔑 Auto-increment primary key       |
| `uname`         | VARCHAR(50)  | 🔗 Foreign key → `bankuser.uname`   |
| `txntype`       | VARCHAR(20)  | e.g. Deposit / Withdraw / Transfer  |
| `amount`        | DOUBLE       | Transaction amount                  |
| `balanceafter`  | DOUBLE       | Balance after transaction           |
| `description`   | VARCHAR(150) | Optional note                       |
| `txndate`       | DATETIME     | Timestamp (defaults to now)         |

</details>

---

## ⚠️ Important Notes

- ✅ Make sure **MySQL is running** *before* starting Tomcat.
- 🔐 The default DB password in `DbInfo.java` is a placeholder — **update it** to match your environment.
- 🧩 Any schema change should be reflected in both `database_setup.sql` and the corresponding Bean/DAO classes.
- 🚫 This project is for **educational purposes** — it is not production-hardened (e.g., passwords are stored in plain text).

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

1. 🍴 Fork the project
2. 🌿 Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push to the branch (`git push origin feature/AmazingFeature`)
5. 🔁 Open a Pull Request

---

## 📜 License

This project is available under the **MIT License**. Feel free to use, modify, and distribute it for learning purposes.

---

<div align="center">

### 💙 Built with Java, JSP & a passion for clean banking UX

⭐ **If you found this project useful, consider giving it a star!** ⭐

</div>
