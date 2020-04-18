<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<body>
The list of students returned the query based on the entered First Name
<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <c:forEach var="s" items="${lstudents}">
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