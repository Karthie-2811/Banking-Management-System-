# 🏦 Banking Management System — Setup & Run Guide

---

## 📁 Project Structure

```
BankingManagementSystem/
├── pom.xml                              ← Maven build file
├── database_setup.sql                   ← Run this in MySQL first
└── src/
    └── main/
        ├── java/
        │   ├── Beans/
        │   │   └── BankUserBean.java    ← User data model
        │   ├── DAO/
        │   │   └── BankDAO.java         ← Database operations
        │   ├── DbDetails/
        │   │   ├── DbInfo.java          ← DB credentials (edit here)
        │   │   └── CreateConnection.java← JDBC connection
        │   └── BankServlets/
        │       ├── UserLoginServlet.java
        │       ├── UserRegistrationServlet.java
        │       ├── WithdrawlServlet.java
        │       └── SendMoneyServlet.java
        └── webapp/
            ├── WEB-INF/
            │   └── web.xml
            ├── userLogin.html           ← Entry page
            ├── userRegistration.html
            ├── withdrawl.html
            ├── sendmoney.html
            ├── home.jsp                 ← Dashboard
            ├── balance.jsp
            ├── deposit.jsp
            └── msg.jsp
```

---

## ✅ Prerequisites

| Tool         | Version Required     |
|--------------|----------------------|
| Java JDK     | 17 or higher         |
| Apache Maven | 3.6+                 |
| Apache Tomcat| 10.x (Jakarta EE)    |
| MySQL        | 8.x                  |

---

## 🛠️ Step-by-Step Setup

### Step 1 — Setup the Database

Open MySQL Workbench or MySQL command line and run:

```sql
source path/to/database_setup.sql
```

Or copy-paste the contents of `database_setup.sql` manually.

---

### Step 2 — Update DB Credentials (if needed)

Open `src/main/java/DbDetails/DbInfo.java` and update:

```java
String uname    = "root";       // your MySQL username
String password = "system";     // your MySQL password
String url      = "jdbc:mysql://localhost:3306/advjavamorning2";
```

---

### Step 3 — Build the Project

Open a terminal in the `BankingManagementSystem/` folder and run:

```bash
mvn clean package
```

This creates: `target/BankingManagementSystem.war`

---

### Step 4 — Deploy to Tomcat

1. Copy `target/BankingManagementSystem.war` to Tomcat's `webapps/` folder.
2. Start Tomcat:
   - **Windows:** Double-click `bin/startup.bat`
   - **Linux/Mac:** Run `bin/startup.sh`

---

### Step 5 — Open in Browser

```
http://localhost:8080/BankingManagementSystem/
```

You will see the **SBI Login Page**.

---

## 🚀 Features

| Feature        | URL / Action              |
|----------------|---------------------------|
| Login          | `userLogin.html`          |
| Register       | `userRegistration.html`   |
| Dashboard      | `home.jsp` (after login)  |
| Withdraw Money | `withdrawl.html`          |
| Check Balance  | `balance.jsp`             |
| Send Money     | `sendmoney.html`          |
| Deposit Money  | `deposit.jsp`             |

---

## ⚠️ Important Notes

- **Tomcat 10.x is required** — the code uses `jakarta.servlet.*` (not `javax.servlet.*`). Tomcat 9 will NOT work.
- Make sure MySQL is running before starting Tomcat.
- Default DB password in code is `system` — change it in `DbInfo.java` if yours is different.
