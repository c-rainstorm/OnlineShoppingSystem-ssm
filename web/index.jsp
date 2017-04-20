<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <link rel="stylesheet" href="style/css/bootstrap.min.css">
    <link rel="stylesheet" href="style/css/font-awesome.min.css">
    <link rel="stylesheet" href="style/css/mdb.min.css">
</head>
<body>
<ul>
    <li><a href="${pageContext.request.contextPath}/views/user-signup.jsp" target="_blank">用户注册</a></li>
    <li><a href="${pageContext.request.contextPath}/views/login/user.jsp" target="_blank">用户登陆</a></li>
    <li><a href="${pageContext.request.contextPath}/user/testTransaction">测试事务</a></li>
</ul>

<script src="style/js/jquery-3.1.1.min.js"></script>
<script src="style/js/bootstrap.min.js"></script>
<script src="style/js/mdb.min.js"></script>
</body>
</html>
