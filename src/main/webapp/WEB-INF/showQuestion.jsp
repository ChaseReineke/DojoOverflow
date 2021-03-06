<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Questions</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body style="background-color: gray">
	<div class="container">
		<div class="col mx-auto text-center">
			<h1>${question.question}</h1>
			<p><b>Tags</b></p>
			<c:forEach items="${question.tags}" var="tag">
				<p>${tag.tag}</p>
			</c:forEach>
			<h2>Answers</h2>
				<c:forEach items="${question.answers}" var="answer">
					<h3>${answer.answer}</h3>
				</c:forEach>
			<form:form action="/answer/new" method="post"
				modelAttribute="newAnswer" style="margin-top: 50px">
				<div class="form-group">
					<form:input path="answer" class="form-control text-center" placeholder="Answer" />
					<form:errors path="answer" class="text-danger" />
				</div>
				<div class="form-group">
					<form:input  type="hidden" path="question" class="form-control text-center" value="${question.id}" />
					<input type="hidden" name="questionId" value="${questionId}"/>
				</div>
				<input type="submit" value="Add Answer"
					class="btn btn-sm btn-dark" />
			</form:form>
				
		</div>
	</div>
</body>