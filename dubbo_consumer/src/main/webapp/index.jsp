<%@page language="java" pageEncoding="utf-8" contentType="text/html; utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="2">
    <tr>
        <td>编号</td><td>区域</td><td>操作</td>
    </tr>
    <c:forEach items="${districtList}" var="district">
        <tr>
            <td>${district.id}</td><td>${district.name}</td><td>删除 修改  查看</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>