<%--
    Document   : SubjectRegistration
    Created on : Dec 18, 2018, 10:53:54 PM
    Author     : demonslight998
--%>

<jsp:include page="fragment/header.jsp" />

<div class="container form-display">
  <form action="SubjectRegistration" method="POST">
    <div class="form-group">
      <label for="inputName">Name</label>
      <input type="text" class="form-control" id="inputName" name="name" aria-describedby="emailHelp" placeholder="Enter Name">
    </div>
    <div class="form-group">
      <label for="inputSurname">Surname</label>
      <input type="text" class="form-control" id="inputSurname" name="surname" placeholder="Enter Surname">
    </div>
    <div class="form-group">
      <label for="inputPhone">Phone Number</label>
      <input type="text" class="form-control" id="inputPhone" name="phoneNumber" placeholder="Enter Phone Number">
    </div>
    <div class="form-group">
      <label for="inputEmailAddress">Email Address</label>
      <input type="email" class="form-control" id="inputEmailAddress" name="email" placeholder="Enter Email Address">
    </div>

    <label>Subjects Name</label> <br>
    <div class="form-group form-check">
      <input type="checkbox" class="form-check-input" name="chbxDb" >
      <label class="form-check-label" for="exampleCheck1">Database: Prisma & GraphQL</label> <br>
      <input type="checkbox" class="form-check-input" name="chbxBack" >
      <label class="form-check-label" for="exampleCheck1">Back-end: NodeJs</label> <br>
      <input type="checkbox" class="form-check-input" name="chbxFront" >
      <label class="form-check-label" for="exampleCheck1">Front-end: VueJs</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

<jsp:include page="fragment/footer.jsp" />
