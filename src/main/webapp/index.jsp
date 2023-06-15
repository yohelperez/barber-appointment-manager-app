<%@ page import="com.barberAppointment.dao.AppointmentDao" %>
<%@ page import="com.barberAppointment.model.Appointment" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: yohel
  Date: 1/24/2023
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Appointments</title>
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
        <form action="index.jsp" method="POST">
            <div class="modal-header">
                <h1 class="modal-title fs-5">Barber Appointment Setter</h1>
            </div>
            <div class="modal-body">


                <div class="mb-3">
                    <label class="form-label">Barber</label>

                    <select id="form-select" class="form-select" name="barber">
                        <!--to do: pull list of barbers to show-->
                        <option>Select Barber</option>
                        <option>barberEmail1@gmail.com</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="text" class="form-control" name="email">
                </div>

                <div class="mb-3">
                    <label class="form-label">Date</label>
                    <input type="text" class="form-control" name="date">
                </div>

                <div class="mb-3">
                    <label class="form-label">Time</label>
                    <input type="text" class="form-control" name="time">
                </div>


                <div class="mb-3">
                    <label class="form-label">Gender</label>
                    <select class="form-select" name="gender">
                        <option>Select Gender</option>
                        <option>M</option>
                        <option>F</option>
                    </select>
                </div>

                <div class="mb-3">
                    <!--to do: pull notes from appointment-->
                    <label class="form-label">Notes</label>
                    <textarea class="form-control" name="notes"></textarea>
                </div>


            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary" name="submit">Submit</button>
                <!-- <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button> -->
            </div>

        </form>
    </div>

        <%
    //Instructions to insert a new appointment

    AppointmentDao appointmentDao = new AppointmentDao();
    //if to validate fields are filled
    if(request.getParameter("submit")!=null){
        //request.getparameter pulls information from tags
        Appointment appointment = new Appointment(
                request.getParameter("barber"),
                request.getParameter("email"),
                request.getParameter("date"),
                request.getParameter("time")
                );
        appointmentDao.insert(appointment);
    }

    /*
    //request.getparameter pulls information from tags
    String date = request.getParameter("date");
    String name = request.getParameter("name");
    String notes = request.getParameter("notes");
     */


%>

    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5">Appointments</h1>
            </div>
            <%

                List<Appointment> appointments = appointmentDao.select();
                //Collections.reverse(appointments); //If i want to reverse the order of items in the list

                //Lists all appointments
                for (Appointment appointment : appointments) {
            %>
            <div class="modal-body">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title"><%=appointment.getTime()%>
                        </h5>
                        <p class="blackquote-footer"><cite><%= appointment.getDate()%>
                        </cite></p>
                        <h6 class="card-subtitle mb-2 text-muted"><%=appointment.getCustomerEmail()%>
                        </h6>
                        <p class="card-text">test notes: <%=appointment.getId()%>
                        </p> <!-- text for notes -->

                        <!--Edit link sends appointment attributes on the link-->
                        <a href="edit.jsp?id=<%=appointment.getId()%>
                            &&barber=<%=appointment.getBarberEmail()%>
                            &&email=<%=appointment.getCustomerEmail()%>
                            &&date=<%=appointment.getDate()%>
                            &&time=<%=appointment.getTime()%>
                            &&price=<%=appointment.getPrice()%>"
                           class="card-link">Edit</a>

                        <!--Delete link sends appointment id on the link-->
                        <a href="delete.jsp?id=<%=appointment.getId()%>" class="card-link">Delete</a>

                    </div>
                </div>
            </div>
            <%}%>
        </div>
    </div>
</body>
</html>
