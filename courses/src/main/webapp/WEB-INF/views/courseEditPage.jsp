<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Course</h1>  
       <form:form method="POST" action="/editcourse">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>Course Name : </td>   
          <td><form:input path="courseName"  /></td>  
         </tr>    
         <tr>    
          <td>Duration :</td>    
          <td><form:input path="duration" /></td>  
         </tr>    
         <tr> 
         <tr>    
          <td>Faculty :</td>    
          <td><form:input path="faculty" /></td>  
         </tr>    
         <tr>     
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>  
</body>
</html>