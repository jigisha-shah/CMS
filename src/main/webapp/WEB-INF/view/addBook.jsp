<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style> .error {color:red}</style>
</head>
<body>



		<form:form action="processBook" modelAttribute="b">
		isbn	<form:input path="isbn" /> <form:errors path="isbn" cssClass="error"/></br> </br>
		author	<form:input path="author"/><form:errors path="author" cssClass="error"/></br> </br>
		copies	<form:input path="copies"/><form:errors path="copies" cssClass="error"/></br> </br>
		code	<form:input path="code" /> <form:errors path="code" cssClass="error"/></br> </br>
		
		country	<form:select path="country">
				<form:options items="${countryOptions}"/>
				</form:select></br> </br>
			<form:checkbox path="gen" value="Math" Label="Math" />    Math
			<form:checkbox path="gen" value="Language" Label="Language" />	Language		
			<form:checkbox path="gen" value="Science" Label="Science" />   Science
			<form:checkbox path="gen" value="BioTech" Label="BioTech" />   BioTech
			</br> </br>
			<form:radiobutton path="type" value="MRW" Label="MRW"/>MRW
			<form:radiobutton path="type" value="Book" Label="Book"/>Book
			
			</br> </br>
			<input type="submit" value="Submit"/>
		</form:form>
</body>
</html>