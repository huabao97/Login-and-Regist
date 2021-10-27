<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>
 <style type="text/css" media="screen">
                .center{
                        position:absolute;
                        width: 250px;
                        height: 120px;
                        left: 50%;
                        top: 50%;
                        margin: -100px 0px 0px -100px;
                        
                }
        </style>
</head>
<body style="background:url(images/back.jpg);
                 background-size:cover;">
                  <div class="center">
 
<center>
<form action="/Login/Login" method="post">
<h3>欢迎登录!</h3>
账号：<input name="usersname" type="text" style="width:150px"><br>
密码：<input name="password" type="password" style="width:150px"><br>
<input type="submit" value="登录" >
<input type="reset" value="重置">
</form>
 
</center>
 
</body>
</html>
