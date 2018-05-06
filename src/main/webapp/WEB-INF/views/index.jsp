<%--
  Created by IntelliJ IDEA.
  User: 007
  Date: 2018/5/4
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <%application.setAttribute("APP_PATH",request.getContextPath());%>
    <script type="text/javascript"
            src="${APP_PATH}/static/js/jquery-3.3.1.js"></script>
    <!--引入样式  -->
    <link
            href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script  src="${APP_PATH}/static/js/tool.js"></script>
</head>
<body background="${APP_PATH}/static/jpg/LoginBackdrop.jpg">
<h1><span class="label label-default" style="position: relative;left: 550px;top: 130px;" >销进存管理系统</span></h1>
<div class="col-xs-3"  style=";display:block;position:relative;top:180px;left:500px;">
    <form id ="userLogin" action = "${APP_PATH}/login" method="POST" >
        <div class="form-group" id="account_input">
            <label for="exampleInputUser">帐号</label>
            <input type="text" class="form-control" id="exampleInputUser"  name="userName" placeholder="userName" >
        </div>
        <div class="form-group" id="password_input">
            <label for="exampleInputPassword1">密码</label>
            <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="password">
        </div>
        <c:if test="${not empty requestScope.msg}">
            ${requestScope.msg}<br>
        </c:if>

        <button type="submit" class="btn btn-default" id="loginSubmit">登录</button>
    </form>
</div>

</body>


   <script  type="text/javascript" >
       $("#loginSubmit").click(function(){
           deleteStrusClass(new Array("#account_input","#password_input"))
           $(".msg-block").remove();
           var userName = $("#exampleInputUser").val();
           var password = $("#exampleInputPassword1").val();
           var temp = chkUser(userName,password)
           if(temp.flag){

           }else{
                if(temp.pos==1){
                    $("#account_input").addClass("has-error");
                    $("#account_input").append("<span id=\"block1\" class=\"msg-block\">"+temp.msg+"</span>")
                }else{
                    $("#account_input").addClass("has-success");
                    $("#password_input").append("<span id=\"block1\" class=\"msg-block\">"+temp.msg+"</span>")
                    $("#password_input").addClass("has-error");
                }

               return false;
           }
       })
   </script>

</html>
