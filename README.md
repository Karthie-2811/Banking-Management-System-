
<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0D47A1,100:42A5F5&height=200&section=header&text=Banking%20Management%20System&fontSize=42&fontColor=ffffff&animation=fadeIn&fontAlignY=38&desc=A%20Full-Stack%20Java%20Banking%20Web%20Application&descAlignY=58&descSize=18" width="100%"/>

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&duration=3000&pause=1000&color=1976D2&center=true&vCenter=true&width=650&lines=Register+%E2%80%A2+Login+%E2%80%A2+Deposit+%E2%80%A2+Withdraw;Send+Money+%E2%80%A2+Track+Transactions;Built+with+Java+%2B+JSP+%2B+MySQL+%2B+Tomcat" alt="Typing SVG" />

<br/>

[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Jakarta](https://img.shields.io/badge/Jakarta-Servlets%20%26%20JSP-D91A21?style=for-the-badge&logo=eclipseide&logoColor=white)](https://jakarta.ee/)
[![MySQL](https://img.shields.io/badge/MySQL-8.x-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Tomcat](https://img.shields.io/badge/Tomcat-10.x-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=black)](https://tomcat.apache.org/)
[![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![Bootstrap](https://img.shields.io/badge/Bootstrap-5.3-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)](https://getbootstrap.com/)

<br/>

![Stars](https://img.shields.io/github/stars/manojkumarr12121-jpg/BankingManagementSystem?style=social)
![Forks](https://img.shields.io/github/forks/manojkumarr12121-jpg/BankingManagementSystem?style=social)
![Repo Size](https://img.shields.io/github/repo-size/manojkumarr12121-jpg/BankingManagementSystem?color=blueviolet&style=flat-square)
![Last Commit](https://img.shields.io/github/last-commit/manojkumarr12121-jpg/BankingManagementSystem?color=orange&style=flat-square)
![License](https://img.shields.io/badge/License-MIT-brightgreen?style=flat-square)
![Status](https://img.shields.io/badge/Status-Active-success?style=flat-square)

</div>

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 📋 Table of Contents

<table>
<tr>
<td>

- [✨ Features](#-features)
- [🧰 Tech Stack](#-tech-stack)
- [📁 Project Structure](#-project-structure)
- [✅ Prerequisites](#-prerequisites)

</td>
<td>

- [🚀 Getting Started](#-getting-started)
- [🌐 Application Routes](#-application-routes)
- [🗄️ Database Schema](#️-database-schema)
- [🏗️ Architecture](#️-architecture)

</td>
<td>

- [🖼️ Screenshots](#️-screenshots)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [👤 Author](#-author)

</td>
</tr>
</table>

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## ✨ Features

<div align="center">

| 🔐 | 🔑 | 🏠 | 💰 |
|:---:|:---:|:---:|:---:|
| **User Registration** | **Secure Login** | **Dashboard** | **Check Balance** |
| Auto-generated 7-digit account number | Username & password authentication | Quick access to every operation | Real-time balance lookup |

| 💵 | 💸 | 🔄 | 📜 |
|:---:|:---:|:---:|:---:|
| **Deposit Money** | **Withdraw Money** | **Send Money** | **Transaction History** |
| Add funds instantly | Withdraw from account | Transfer to another user | Full log with timestamps |

</div>

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 🧰 Tech Stack

<div align="center">

![Java](https://skillicons.dev/icons?i=java)
![MySQL](https://skillicons.dev/icons?i=mysql)
![Maven](https://skillicons.dev/icons?i=maven)
![Bootstrap](https://skillicons.dev/icons?i=bootstrap)
![HTML5](https://skillicons.dev/icons?i=html)
![Eclipse](https://skillicons.dev/icons?i=eclipse)

| Layer | Technology |
|:--|:--|
| 🎨 **Frontend** | HTML5, JSP, Bootstrap 5 |
| ⚙️ **Backend** | Java, Jakarta Servlets |
| 🔗 **Data Access** | JDBC, DAO Design Pattern |
| 🗄️ **Database** | MySQL 8.x |
| 📦 **Build Tool** | Maven |
| 🖥️ **Server** | Apache Tomcat 10.x (Jakarta EE) |

</div>

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 📁 Project Structure

```
BankingManagementSystem/
├── 📄 pom.xml                          # Maven build configuration
├── 🗄️ database_setup.sql               # Database & table creation script
├── 📘 README.md
└── 📂 src/main/
    ├── ☕ java/
    │   ├── Beans/               → BankUserBean, TransactionBean
    │   ├── DAO/                 → BankDAO (all DB operations)
    │   ├── DbDetails/           → DbInfo, CreateConnection
    │   └── BankServlets/        → 6 servlets (Login, Register, Deposit,
    │                              Withdraw, SendMoney, TransactionHistory)
    └── 🌐 webapp/
        ├── WEB-INF/web.xml
        ├── userLogin.html · userRegistration.html
        ├── home.jsp · balance.jsp · deposit.jsp
        ├── withdrawl.html · sendmoney.html
        └── transactionHistory.jsp · msg.jsp
```

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## ✅ Prerequisites

<div align="center">

| Tool | Badge | Required Version |
|:--|:--:|:--|
| ☕ Java JDK | ![Java](https://img.shields.io/badge/-17+-ED8B00?logo=openjdk&logoColor=white) | 17 or higher |
| 📦 Apache Maven | ![Maven](https://img.shields.io/badge/-3.6+-C71A36?logo=apachemaven&logoColor=white) | 3.6+ |
| 🐱 Apache Tomcat | ![Tomcat](https://img.shields.io/badge/-10.x-F8DC75?logo=apachetomcat&logoColor=black) | 10.x *(Tomcat 9 will NOT work)* |
| 🐬 MySQL | ![MySQL](https://img.shields.io/badge/-8.x-4479A1?logo=mysql&logoColor=white) | 8.x |

</div>

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 🚀 Getting Started

### 1️⃣ Clone the repository
```bash
git clone https://github.com/manojkumarr12121-jpg/BankingManagementSystem.git
cd BankingManagementSystem
```

### 2️⃣ Set up the database
```sql
source database_setup.sql;
```
> Creates the `advjavamorning2` database with `bankuser` and `transactionhistory` tables.

### 3️⃣ Configure database credentials
Edit `src/main/java/DbDetails/DbInfo.java`:
```java
String uname    = "root";
String password = "your_mysql_password";
String url      = "jdbc:mysql://localhost:3306/advjavamorning2";
```

### 4️⃣ Build the project
```bash
mvn clean package
```

### 5️⃣ Deploy to Tomcat
```bash
# Windows
bin\startup.bat

# Linux/Mac
bin/startup.sh
```

### 6️⃣ Launch 🎉
```
http://localhost:8080/BankingManagementSystem/
```

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 🌐 Application Routes

<div align="center">

| Page | Route |
|:--|:--|
| 🔑 Login | `/userLogin.html` |
| 📝 Register | `/userRegistration.html` |
| 🏠 Dashboard | `/home.jsp` |
| 💰 Balance | `/balance.jsp` |
| 💵 Deposit | `/deposit.jsp` |
| 💸 Withdraw | `/withdrawl.html` |
| 🔄 Send Money | `/sendmoney.html` |
| 📜 Transaction History | `/transactionHistory.jsp` |

</div>

> 💡 **Tip:** Always start at `userLogin.html` and navigate through the app's own links — several pages depend on an active login session.

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 🗄️ Database Schema

<details>
<summary>🧾 <b>bankuser table</b> — click to expand</summary>
<br/>

| Column | Type | Description |
|:--|:--|:--|
| `uname` | VARCHAR(50) 🔑 PK | Username |
| `ufullname` | VARCHAR(100) | Full name |
| `upassword` | VARCHAR(50) | Password |
| `adhar` | BIGINT | Aadhaar number |
| `phoneno` | BIGINT | Phone number |
| `accountno` | BIGINT 🔒 UNIQUE | Auto-generated account number |
| `accountbalance` | DOUBLE | Current balance |

</details>

<details>
<summary>🧾 <b>transactionhistory table</b> — click to expand</summary>
<br/>

| Column | Type | Description |
|:--|:--|:--|
| `txnid` | BIGINT 🔑 PK, AUTO_INCREMENT | Transaction ID |
| `uname` | VARCHAR(50) 🔗 FK | Linked user |
| `txntype` | VARCHAR(20) | Deposit / Withdraw / Transfer |
| `amount` | DOUBLE | Transaction amount |
| `balanceafter` | DOUBLE | Balance after transaction |
| `description` | VARCHAR(150) | Extra details |
| `txndate` | DATETIME | Timestamp (auto-set) |

</details>

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 🏗️ Architecture

<div align="center">

```mermaid
graph LR
    A[🖥️ HTML / JSP<br/>View Layer] -->|HTTP Request| B[⚙️ Servlets<br/>Controller Layer]
    B -->|Calls| C[🗂️ DAO<br/>Data Access Layer]
    C -->|JDBC| D[(🐬 MySQL<br/>Database)]
    D -->|Result Set| C
    C -->|Data| B
    B -->|Response| A

    style A fill:#42A5F5,stroke:#0D47A1,color:#fff
    style B fill:#1976D2,stroke:#0D47A1,color:#fff
    style C fill:#0D47A1,stroke:#08306B,color:#fff
    style D fill:#4479A1,stroke:#08306B,color:#fff
```

</div>

A clean, layered MVC-style architecture — presentation, business logic, and data access are fully separated.

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 🖼️ Screenshots

<div align="center">

| Login Page | Registration Page |
|:--:|:--:|
| *Add screenshot here* | *Add screenshot here* |

| Dashboard | Transaction History |
|:--:|:--:|
| *Add screenshot here* | *Add screenshot here* |

</div>

> 📸 Replace the placeholders above with real screenshots — drag & drop images into the GitHub README editor and it auto-generates the image links.

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

```bash
1. Fork the project
2. Create your feature branch   → git checkout -b feature/amazing-feature
3. Commit your changes          → git commit -m "Add amazing feature"
4. Push to the branch           → git push origin feature/amazing-feature
5. Open a Pull Request
```

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 📄 License

Licensed under the **MIT License** — free to use, modify, and distribute.

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:42A5F5,100:0D47A1&height=4&width=100%"/>

## 👤 Author

<div align="center">

### Manoj Kumar

[![GitHub](https://img.shields.io/badge/GitHub-manojkumarr12121--jpg-181717?style=for-the-badge&logo=github)](https://github.com/manojkumarr12121-jpg)
[![LinkedIn](www.linkedin.com/in/manojkumarr-dev)](#)

⭐ **If you found this project useful, consider giving it a star!** ⭐

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0D47A1,100:42A5F5&height=100&section=footer" width="100%"/>

</div>






