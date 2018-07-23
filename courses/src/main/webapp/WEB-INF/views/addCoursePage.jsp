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
<div align="center">
		<h2>Enroll Associate Details Here</h2>
		<table>
		
			<form:form action="addcourse" method="post"  modelAttribute="course">
			 
	                <tr>
					<td>CourseName:</td>
					<td><form>
					<select path="courseName" size="30">
					<option value="Spring">Spring</option>
					<option value="java">Java</option>
					<option value="c++">C++</option>
					<option value="c">C</option>
					</select>
					</form></td>
					<td><form:errors path="courseName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Duration:</td>
					<td><form:input path="duration" size="30" /></td>
					<td><form:errors path="duration" cssClass="error" /></td>
				</tr>
				<tr>
					<td>faculty:</td>
					<td><form:input path="faculty" size="30" /></td>
					<td><form:errors path="faculty" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>