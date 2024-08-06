<%@page import="com.hrms.model.RegisterModel"%>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>User List</title>
</head>
<body>
    <h1>User List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Email</th>
            <th>Address</th>
            <th>Mobile No</th>
            <th>Register Date</th>
            <th>Pmail ID</th>
        </tr>
        <%
        List<RegisterModel> alluser = (List<RegisterModel>) request.getAttribute("alluser");
            if (alluser != null) {
                for (RegisterModel model : alluser) {
        %>
        <tr>
            <td><%= model.getUserId() %></td>
            <td><%= model.getUserName() %></td>
            <td><%= model.getEmail() %></td>
            <td><%= model.getAddress() %></td>
            <td><%= model.getMobileNo() %></td>
            <td><%= model.getRegisterDate() %></td>
            <td><%= model.getPmailId() %></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</body>
</html>
