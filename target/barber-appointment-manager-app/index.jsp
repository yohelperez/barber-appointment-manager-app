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
        <div class="modal-header">
            <h1 class="modal-title fs-5" id="exampleModalLabel">Barber Appointment Setter</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
            <form>

                <div class="mb-3">
                    <label  class="form-label">Barber</label>
                    <select id="form-select" class="form-select">
                        <option>Select Barber</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Date</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label  class="form-label">Name</label>
                    <input type="password" class="form-control" >
                </div>

                <div class="mb-3">
                    <label  class="form-label">Phone</label>
                    <input type="password" class="form-control"">
                </div>

                <div class="mb-3">
                    <label  class="form-label">Gender</label>
                    <select  class="form-select">
                        <option>Select Gender</option>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>


            </form>
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            <button type="button" class="btn btn-primary">Save changes</button>
        </div>
    </div>
</div>

</body>
</html>
