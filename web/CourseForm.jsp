<%--
    Document   : CourseForm
    Created on : Dec 26, 2018, 9:02:58 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="fragment/header.jsp" />

<h4 style="color: red">${error}</h4>
<div class="container form-display">
  <h3 style="color: red">${error}</h3>
  <form action="/CourseValidation" method="POST">
    <div class="form-group">
      <label>Full Name</label>
      <input type="text" class="form-control" name="fullName" placeholder="Enter Full Name">
    </div>
    <div class="form-group">
      <label>Age</label>
      <input type="number" class="form-control" name="age" placeholder="Enter age">
    </div>
    <div class="form-group">
      <label>Country</label> <br>
      <select class="form-control">
        <option value="Vietnamese">Vietnamese</option>
        <option value="American" >American</option>
        <option value="English">English</option>
        <option value="Chinese">Chinese</option>
        <option value="French">French</option>
      </select>
    </div>
    <div class="form-group">
      <label>Course</label>
      <select multiple class="form-control">
        <option value="C#">C#</option>
        <option value="Java">Java</option>
        <option value="C++">C++</option>
        <option value="Python">Python</option>
        <option value="Ruby on Rail">Ruby on Rail</option>
      </select>
    </div>
    <div class="form-group row">
      <div class="col-sm-6">Desired Language</div>
      <div class="col-sm-4">
        <div class="form-check">
          <input checked="true" class="form-check-input" type="checkbox">
          <label class="form-check-label">
            Vietnamese
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="checkbox">
          <label class="form-check-label">
            English
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="checkbox">
          <label class="form-check-label">
            French
          </label>
        </div>
      </div>
    </div>
    <br><button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

<script>
  const

</script>

<jsp:include page="fragment/footer.jsp" />