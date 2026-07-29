<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="Beans.BankUserBean" %>
<%@ page import="Beans.TransactionBean" %>
<%@ page import="java.util.List" %>
<%
    BankUserBean bub = (BankUserBean) session.getAttribute("BankUserBean");
    if (bub == null) { response.sendRedirect("userLogin.html"); return; }
    List<TransactionBean> history = (List<TransactionBean>) request.getAttribute("TransactionHistory");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Transaction History</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">
<style>
body { background: linear-gradient(135deg, #0d47a1, #001f54); font-family: 'Segoe UI', sans-serif; color: white; min-height: 100vh; }
.topbar { padding: 15px 25px; display: flex; justify-content: space-between; align-items: center; }
.logout-btn { background: white; color: #0d47a1; border-radius: 20px; padding: 5px 15px; text-decoration: none; font-size: 14px; }
.history-card { background: white; color: #212529; border-radius: 20px; padding: 25px; margin: 20px 0 40px; box-shadow: 0 10px 25px rgba(0,0,0,0.4); }
.table thead th { border-bottom: 2px solid #dee2e6; color: #0d47a1; }
.badge-deposit { background: #2e7d32; }
.badge-withdrawal { background: #c62828; }
.badge-sent { background: #ad1457; }
.badge-received { background: #1565c0; }
.amount-credit { color: #2e7d32; font-weight: 600; }
.amount-debit { color: #c62828; font-weight: 600; }
.back-btn { color: white; text-decoration: none; }
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

<div class="container">
  <a href="home.jsp" class="back-btn"><i class="bi bi-arrow-left"></i> Back to Dashboard</a>

  <div class="history-card">
    <h4 class="mb-1" style="color:#0d47a1;">Transaction History</h4>
    <p class="text-muted">Account No: <%=bub.getAccountno()%></p>

    <% if (history == null || history.isEmpty()) { %>
      <p class="text-muted text-center py-4">No transactions yet.</p>
    <% } else { %>
      <div class="table-responsive">
        <table class="table table-hover align-middle">
          <thead>
            <tr>
              <th>Date &amp; Time</th>
              <th>Type</th>
              <th>Description</th>
              <th class="text-end">Amount</th>
              <th class="text-end">Balance After</th>
            </tr>
          </thead>
          <tbody>
            <% for (TransactionBean tb : history) {
                 String type = tb.getTxntype();
                 boolean credit = type.equals("DEPOSIT") || type.equals("RECEIVED");
                 String badgeClass = "badge-deposit";
                 if (type.equals("WITHDRAWAL")) badgeClass = "badge-withdrawal";
                 else if (type.equals("SENT")) badgeClass = "badge-sent";
                 else if (type.equals("RECEIVED")) badgeClass = "badge-received";
            %>
            <tr>
              <td><%=tb.getTxndate()%></td>
              <td><span class="badge <%=badgeClass%>"><%=type%></span></td>
              <td><%=tb.getDescription()%></td>
              <td class="text-end <%=credit ? "amount-credit" : "amount-debit"%>">
                <%=credit ? "+" : "-"%> ₹ <%=tb.getAmount()%>
              </td>
              <td class="text-end">₹ <%=tb.getBalanceafter()%></td>
            </tr>
            <% } %>
          </tbody>
        </table>
      </div>
    <% } %>
  </div>
</div>
</body>
</html>
