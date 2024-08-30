<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listPerson</title>
</head>
<body>
<c:forEach var="person" items="${personList}">
이름 : ${person.name}, 나이 : ${person.age}<br />
</c:forEach>
<a href="/springmvc2/person/writePersonForm.do">등록</a><br />
<a href="/springmvc2/person/getPerson.do">getPerson</a>
</body>
</html>



























