<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<body>
<form action="/save" method="post">
    <label>ID</label><br>
    <input type="number" name="id" > <br>
    <label> First Name</label><br>
    <input type="text" name="fname"><br>
    <label>Last Name</label><br>
    <input type="text" name="lname"><br>
    <label>Age</label><br>
    <input type="text" name="age"><br>
    <input type="submit" value="Save"><br>
</form>
</body>
</html>