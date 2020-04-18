<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Students' Database</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>
    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.getId()}</td>
            <td>${s.getFname()}</td>
            <td>${s.getLname()}</td>
            <td>${s.getAge()}</td>
            <td><a href="/edit/${s.getId()}">Edit</a></td>
            <td>&nbsp;<a href="/delete/${s.getId()}"> <img src="${pageContext.request.contextPath}/img/del.png" width="20", height="20"/> </a></td>
            td>&nbsp;<a href="/delete/${s.getId()}"> <img src="${pageContext.request.contextPath}/img/del.png" width="20", height="20"/> </a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>