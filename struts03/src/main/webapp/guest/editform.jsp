<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style></style>
    <!-- jQuery (자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <title></title>
</head>
<body>
<div>
    <a href="/index.jsp">HOME</a>
    <a href="list.action">LIST</a>
    <a href="add.action">ADD</a>
    <a href="/struts/user/login.action">LOGIN</a>
</div>
<div>
    <h1>수정페이지</h1>
    <form action="update.action" method="post">
        <table>
            <tr>
                <td><label for="sabun">사번</label></td>
                <td><input type="text" name="sabun" id="sabun" value="${bean.sabun}"></td>
            </tr>
            <tr>
                <td><label for="name">이름</label></td>
                <td><input type="text" name="name" id="name" value="${bean.name}"></td>
            </tr>
            <tr>
                <td><label for="pay">금액</label></td>
                <td><input type="text" name="pay" id="pay" value="${bean.pay}"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit">수 정</button>
                    <button type="reset">취 소</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
