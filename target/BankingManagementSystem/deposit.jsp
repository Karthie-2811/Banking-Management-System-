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
<title>Deposit Money</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body { background: linear-gradient(135deg, #0d47a1, #001f54); height: 100vh; display: flex; justify-content: center; align-items: center; font-family: 'Segoe UI', sans-serif; }
  .card-box { width: 350px; border-radius: 20px; padding: 30px; background: white; box-shadow: 0 10px 30px rgba(0,0,0,0.3); }
  .title { color: #2e7d32; font-weight: bold; text-align: center; margin-bottom: 20px; }
  .btn-deposit { background: #2e7d32; color: white; }
  .btn-deposit:hover { background: #1b5e20; }
  .btn-back { border: 1px solid #0d47a1; color: #0d47a1; }
  .btn-back:hover { background: #0d47a1; color: white; }
</style>
</head>
<body>
<div class="card-box">
  <h4 class="title">Deposit Money</h4>
  <form action="DepositServlet" method="post">
    <div class="mb-3">
      <label class="form-label">Enter Amount</label>
      <input type="number" class="form-control" placeholder="₹ Enter amount" required name="amount">
    </div>
    <div class="d-grid gap-2">
      <button type="submit" class="btn btn-deposit">Deposit</button>
      <a href="home.jsp" class="btn btn-back">Back</a>
    </div>
  </form>
</div>
</body>
</html>
