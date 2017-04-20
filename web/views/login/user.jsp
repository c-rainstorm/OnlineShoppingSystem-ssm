<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 4/17/17
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
</head>
<body>

<form role="form" action="${pageContext.request.contextPath}/user/checkLogin" method="post">
    username: <input type="text" class="username" name="username" placeholder="username..."><br>
    password: <input type="password" class="password" name="password" placeholder="password..."><br>
    <input type="submit" value="submit">
</form>
<script src="${pageContext.request.contextPath}/style/js/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/style/js/md5.min.js"></script>
<script src="${pageContext.request.contextPath}/style/js/userLogin.js"></script>
</body>
</html>
