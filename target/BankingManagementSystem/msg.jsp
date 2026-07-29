<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String msg = (String) request.getAttribute("Msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Message</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body { background: linear-gradient(135deg, #0d47a1, #001f54); height: 100vh; display: flex; justify-content: center; align-items: center; font-family: 'Segoe UI', sans-serif; }
  .msg-card { background: white; border-radius: 15px; padding: 40px; text-align: center; box-shadow: 0 10px 30px rgba(0,0,0,0.3); }
</style>
</head>
<body>
<div class="msg-card">
  <h3 class="text-primary mb-4"><%=msg%></h3>
  <a href="userLogin.html" class="btn btn-primary">Go to Login</a>
</div>
</body>
</html>
