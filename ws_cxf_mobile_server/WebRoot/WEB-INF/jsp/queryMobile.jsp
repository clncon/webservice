<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>手机号查询页面</title>
   
  </head>
  
  <body>
  
      <form action="queryMobile.action" method="post">
                            手机号：<input type="text" name="code"/><br/>
                            查询结果:${message}  
        <br/>
        
        <input type="submit" value="查询" >
        </form>
                         
           
  </body>
</html>
