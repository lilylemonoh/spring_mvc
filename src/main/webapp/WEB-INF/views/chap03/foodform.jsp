<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${title}</h1>

    <form action="http://localhost:8181/chap03/foodorder" method="POST">
        주문자명 : <input type="text" name="customerName" placeholder="주문자명"><br/>
        주문테이블번호 : <input type="number" name="tableNumber" placeholder="테이블번호"><br/>
        주문할 수 있는 음식 : <input type="text" name="orderedFood" placeholder="주문할 음식"><br/>
        <input type="submit" value="주문하기">
    </form>
</body>
</html>