<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/mdb.min.css">
</head>
<body>

<div class="container" style="margin-top: 10rem">
    <%--<div class="row">--%>
        <%--<div class="col-md-6 offset-md-3">--%>

            <%--<!--Form with header-->--%>
            <%--<div class="card">--%>
                <%--<div class="card-block">--%>

                    <%--<!--Header-->--%>
                    <%--<div class="form-header blue-gradient">--%>
                        <%--<h3><i class="fa fa-user"></i> Register:</h3>--%>
                    <%--</div>--%>

                    <%--<!--Body-->--%>
                    <%--<div class="md-form">--%>
                        <%--<i class="fa fa-user prefix"></i>--%>
                        <%--<input type="text" id="form3" class="form-control">--%>
                        <%--<label for="form3">Your name</label>--%>
                    <%--</div>--%>
                    <%--<div class="md-form">--%>
                        <%--<i class="fa fa-envelope prefix"></i>--%>
                        <%--<input type="text" id="form2" class="form-control">--%>
                        <%--<label for="form2">Your email</label>--%>
                    <%--</div>--%>

                    <%--<div class="md-form">--%>
                        <%--<i class="fa fa-lock prefix"></i>--%>
                        <%--<input type="password" id="form4" class="form-control">--%>
                        <%--<label for="form4">Your password</label>--%>
                    <%--</div>--%>

                    <%--<div class="text-center">--%>
                        <%--<button class="btn btn-indigo">Sign up</button>--%>
                        <%--<hr>--%>
                        <%--<fieldset class="form-group">--%>
                            <%--<input type="checkbox" id="checkbox1">--%>
                            <%--<label for="checkbox1">Subscribe me to the newsletter</label>--%>
                        <%--</fieldset>--%>
                    <%--</div>--%>

                <%--</div>--%>
            <%--</div>--%>
            <%--<!--/Form with header-->--%>
        <%--</div>--%>
    <%--</div>--%>
    <form action="../user/signup" method="post">
        <input type="text" name="username" placeholder="username..."><br>
        <input type="password" name="password" placeholder="password..."><br>
        <input type="submit" value="submit">
    </form>
</div>


<script src="${pageContext.request.contextPath}/style/js/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/style/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/style/js/mdb.min.js"></script>
</body>
</html>
