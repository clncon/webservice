<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
   
     <script type="text/javascript">
     
        function rest(){
           
        	 $.ajax({
                 
                 type:'get',
                 url:'http://localhost:8080/ws_cxf_spring_rest_server/ws/rest/student/queryList/001?_type=json',
                  success:function(data){
                    alert(data.student[0].name);
                  }
         });
         
        }
     </script>
     <title>rest测试</title>
  </head>
  
  <body>
       <input type="button" value="rest请求" onclick="rest()">
  </body>
</html>
