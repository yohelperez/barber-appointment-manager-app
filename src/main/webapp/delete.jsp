<%@ page import="com.barberAppointment.model.Appointment" %>
<%@ page import="com.barberAppointment.dao.AppointmentDao" %><%--
  Created by IntelliJ IDEA.
  User: yohel
  Date: 6/15/2023
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete appointment</title>
</head>
<body>
<%

  //pulls id from the hyperlink
  String id = request.getParameter("id");
  Appointment appointment = new Appointment(id);
  AppointmentDao appointmentDao = new AppointmentDao();
  appointmentDao.delete(appointment);
  request.getRequestDispatcher("index.jsp").forward(request, response); //once deleted sends back to index

%>

</body>
</html>
