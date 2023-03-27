<%--
  Created by IntelliJ IDEA.
  User: yohel
  Date: 1/24/2023
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
        <form action="index.jsp" method="post">
            <div class="modal-header">
                <h1 class="modal-title fs-5">Barber Appointment Setter</h1>
            </div>
            <div class="modal-body">


                <div class="mb-3">
                    <label class="form-label">Barber</label>
                    <select id="form-select" class="form-select" name="barber">
                        <option>Select Barber</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label class="form-label">Date</label>
                    <input type="text" class="form-control" name="date">
                </div>
                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" class="form-control" name="name">
                </div>

                <div class="mb-3">
                    <label class="form-label">Phone</label>
                    <input type="text" class="form-control" name="phone">
                </div>

                <div class="mb-3">
                    <label class="form-label">Gender</label>
                    <select class="form-select" name="gender">
                        <option>Select Gender</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label class="form-label">Notes</label>
                    <textarea class="form-control" name="notes"></textarea>
                </div>


            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary" name="send">Submit</button>
                <!-- <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button> -->
            </div>

        </form>
    </div>

    <% String date = request.getParameter("date");
    String name = request.getParameter("name");
    String notes = request.getParameter("notes");

%>

    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5">Appointments</h1>
            </div>
            <div class="modal-body">
                <form>
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title"> <%=date%> </h5>
                            <h6 class="card-subtitle mb-2 text-muted"><%=name%></h6>
                            <p class="card-text"><%=notes%></p>
                            <p class="blackquote-footer"></p>
                            <a href="#" class="card-link">Edit</a>
                            <a href="#" class="card-link">Delete</a>

                        </div>
                    </div>


                </form>
            </div>

        </div>


    </div>

</body>
</html>
