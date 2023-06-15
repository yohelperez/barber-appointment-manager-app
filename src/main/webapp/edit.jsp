<%@ page import="com.barberAppointment.dao.AppointmentDao" %>
<%@ page import="com.barberAppointment.model.Appointment" %><%--
  Created by IntelliJ IDEA.
  User: yohel
  Date: 6/14/2023
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Appointment</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
        rel="stylesheet">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
<!-- Modal -->

<div class="modal-dialog">
  <div class="modal-content">
    <form action="edit.jsp" method="POST">
      <div class="modal-header">
        <h1 class="modal-title fs-5">Edit Appointment</h1>
      </div>
      <div class="modal-body">

        <!--hidden inputs that holds id and price
        request.getParameter pulls appointment attribute values from the link-->

        <input type="hidden" name="id" value=<%=request.getParameter("id")%>>
        <input type="hidden" name="price" value=<%=request.getParameter("price")%>>

        <div class="mb-3">
          <label class="form-label">Barber</label>

          <select id="form-select" class="form-select" name="barber">
            <option><%=request.getParameter("barber")%></option>
          </select>
        </div>

        <div class="mb-3">
          <label class="form-label">Email</label>
          <input type="text" class="form-control" name="email" value=<%=request.getParameter("email")%>>
        </div>

        <div class="mb-3">
          <label class="form-label">Date</label>
          <input type="text" class="form-control" name="date" value=<%=request.getParameter("date")%>>
        </div>

        <div class="mb-3">
          <label class="form-label">Time</label>
          <input type="text" class="form-control" name="time" value=<%=request.getParameter("time")%>>
        </div>


        <div class="mb-3">
          <label class="form-label">Notes</label>
          <textarea class="form-control" name="notes"></textarea>
        </div>


      </div>
      <div class="modal-footer">
        <a href="index.jsp" type="submit" class="btn btn-danger">Back</a>
        <button type="submit" class="btn btn-primary" name="submit">Submit</button>
        <!-- <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button> -->
      </div>

    </form>
  </div>
</div>
<%
  //Instructions to edit an appointment

  AppointmentDao appointmentDao = new AppointmentDao();
  String id = request.getParameter("id");

  //if to validate fields are filled
  if(request.getParameter("submit")!=null){
    //request.getparameter pulls information from tags
    Appointment appointment = new Appointment(
            request.getParameter("barber"),
            request.getParameter("email"),
            request.getParameter("date"),
            request.getParameter("time"),
            request.getParameter("price"),
            id
    );
    appointmentDao.edit(appointment);

  }


%>


</body>
</html>
