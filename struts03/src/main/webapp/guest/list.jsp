<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style></style>
    <!-- jQuery (자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <title>LIST PAGE</title>
</head>
<body>
<div>
    <a href="/index.jsp">HOME</a>
    <a href="list.action">LIST</a>
    <a href="add.action">ADD</a>
    <a href="/struts/user/login.action">LOGIN</a>
</div>
<div>
    <h1>리스트 페이지</h1>
    <table>
        <tr>
            <th>사번</th>
            <th>이름</th>
            <th>날짜</th>
            <th>금액</th>
        </tr>
        <c:forEach items="${list}" var="bean">
            <tr>
                <td>${bean.sabun }</td>
                <td><a href="detail.action?idx=${bean.sabun}">${bean.name }</a></td>
                <td>${bean.nalja }</td>
                <td>${bean.pay }</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
