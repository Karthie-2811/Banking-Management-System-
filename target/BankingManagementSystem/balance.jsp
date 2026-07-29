<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="Beans.BankUserBean" %>
<%
    BankUserBean bub = (BankUserBean) session.getAttribute("BankUserBean");
    if (bub == null) { response.sendRedirect("userLogin.html"); return; }
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Check Balance</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body { background: linear-gradient(135deg, #0d47a1, #001f54); height: 100vh; display: flex; justify-content: center; align-items: center; font-family: 'Segoe UI', sans-serif; }
  .card-box { width: 400px; border-radius: 20px; padding: 35px; background: white; box-shadow: 0 10px 30px rgba(0,0,0,0.3); text-align: center; }
  .title { color: #1565c0; font-weight: bold; margin-bottom: 20px; }
  .balance-amount { font-size: 36px; font-weight: bold; color: #2e7d32; margin: 15px 0; }
</style>
</head>
<body>
<div class="card-box">
  <h4 class="title">🏦 Account Balance</h4>
  <p class="text-muted">Hello, <strong><%=bub.getUfullname()%></strong></p>
  <p class="text-muted">Account No: <strong><%=bub.getAccountno()%></strong></p>
  <div class="balance-amount">₹ <%=bub.getAccountbalance()%></div>
  <a href="home.jsp" class="btn btn-primary mt-3">Back to Dashboard</a>
</div>
</body>
</html>
