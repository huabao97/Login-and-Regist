<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
        <title>注册界面</title>
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
<body style="background:url(images/regist.jpg);
                 background-size:cover;">
 <div class="center">
<center>
 <h3 style="color:red">新用户注册！</h3>
        <form action="/Login/Register" method="post">
     <table >
                <tr>
                    <td class="alignRight">
                                                                   账号: 
                    </td>
                    <td>
                        <input type="text" name="usersname" style="width:150px;height:20px"/>
                    </td>
                </tr>
                <tr>
                    <td class="alignRight">
                                                                    密码: 
                    </td>
                    <td>
                        <input type="password" name="password" style="width:150px;height:20px"/>
                    </td>
                </tr>
                             
            </table>
<input type="submit" value="提交" class="submit">
<input type="reset" value="重置" class="reset">
</form>
</center>
</div>
</body>
</html>
