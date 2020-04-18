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
        </tr>
    </c:forEach>
</table>
</body>
</html>