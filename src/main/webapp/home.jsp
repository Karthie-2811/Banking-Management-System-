<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="Beans.BankUserBean" %>
<%
    BankUserBean bub = (BankUserBean) session.getAttribute("BankUserBean");
    if (bub == null) {
        response.sendRedirect("userLogin.html");
        return;
    }
    String msg = (String) request.getAttribute("Msg");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">
<script>
  let visible = false;
  function toggleBalance() {
    const balance = document.getElementById("balanceText");
    const icon = document.getElementById("eyeIcon");
    if (visible) {
      balance.innerText = "₹ XX,XXX";
      icon.classList.remove("bi-eye-slash");
      icon.classList.add("bi-eye");
    } else {
      balance.innerText = "₹ " + <%=bub.getAccountbalance()%>;
      icon.classList.remove("bi-eye");
      icon.classList.add("bi-eye-slash");
    }
    visible = !visible;
  }
</script>
<style>
body { background: linear-gradient(135deg, #0d47a1, #001f54); font-family: 'Segoe UI', sans-serif; color: white; }
.topbar { padding: 15px 25px; display: flex; justify-content: space-between; align-items: center; }
.logout-btn { background: white; color: #0d47a1; border-radius: 20px; padding: 5px 15px; text-decoration: none; font-size: 14px; }
.balance-card { background: linear-gradient(135deg, #1e88e5, #42a5f5); border-radius: 20px; padding: 25px; margin: 20px 0; box-shadow: 0 10px 25px rgba(0,0,0,0.4); }
.balance-amount { font-size: 32px; font-weight: bold; }
.action-card { border-radius: 20px; padding: 30px; text-align: center; transition: 0.3s; box-shadow: 0 8px 20px rgba(0,0,0,0.4); color: white; }
.action-card:hover { transform: translateY(-8px) scale(1.03); }
.icon { font-size: 40px; margin-bottom: 10px; }
.withdraw { background: linear-gradient(135deg, #c62828, #ff5252); }
.deposit { background: linear-gradient(135deg, #2e7d32, #66bb6a); }
.balance { background: linear-gradient(135deg, #1565c0, #42a5f5); }
.send { background: linear-gradient(135deg, #ad1457, #ff4081); }
.history { background: linear-gradient(135deg, #4527a0, #7e57c2); }
.card-title { font-weight: 600; font-size: 18px; }
.alert-msg { background: rgba(255,255,255,0.15); border-radius: 10px; padding: 10px 20px; margin: 10px 25px; text-align: center; font-weight: bold; }
</style>
</head>
<body>
<div class="topbar">
  <h5>🏦 State Bank of India</h5>
  <div>
    Welcome, <span><%=bub.getUfullname()%></span>
    <a href="userLogin.html" class="logout-btn ms-3">Logout</a>
  </div>
</div>

<% if (msg != null && !msg.isEmpty()) { %>
  <div class="alert-msg"><%=msg%></div>
<% } %>

<div class="container">
  <div class="balance-card d-flex justify-content-between align-items-center">
    <div>
      <div>Available Balance</div>
      <div class="balance-amount" id="balanceText">₹ XX,XXX</div>
    </div>
    <button class="btn btn-light btn-sm" onclick="toggleBalance()">
      <i class="bi bi-eye" id="eyeIcon"></i>
    </button>
  </div>

  <div class="row g-4">
    <div class="col-md-3">
      <a href="withdrawl.html" class="text-decoration-none">
        <div class="action-card withdraw">
          <div class="icon"><i class="bi bi-cash-stack"></i></div>
          <div class="card-title">Withdraw</div>
        </div>
      </a>
    </div>
    <div class="col-md-3">
      <a href="deposit.jsp" class="text-decoration-none">
        <div class="action-card deposit">
          <div class="icon"><i class="bi bi-wallet2"></i></div>
          <div class="card-title">Deposit</div>
        </div>
      </a>
    </div>
    <div class="col-md-3">
      <a href="balance.jsp" class="text-decoration-none">
        <div class="action-card balance">
          <div class="icon"><i class="bi bi-bar-chart-line"></i></div>
          <div class="card-title">Check Balance</div>
        </div>
      </a>
    </div>
    <div class="col-md-3">
      <a href="sendmoney.html" class="text-decoration-none">
        <div class="action-card send">
          <div class="icon"><i class="bi bi-send"></i></div>
          <div class="card-title">Send Money</div>
        </div>
      </a>
    </div>
    <div class="col-md-3">
      <a href="TransactionHistoryServlet" class="text-decoration-none">
        <div class="action-card history">
          <div class="icon"><i class="bi bi-clock-history"></i></div>
          <div class="card-title">Transaction History</div>
        </div>
      </a>
    </div>
  </div>
</div>
</body>
</html>
