<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : CourseForm
    Created on : Dec 26, 2018, 9:02:58 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="fragment/header.jsp"/>

<div class="container" style="padding-top: 3rem;">
  <h4 style="color: red">${error}</h4>
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
      <select name="country" class="form-control">
        <option value="Vietnamese">Vietnamese</option>
        <option value="American" >American</option>
        <option value="English">English</option>
        <option value="Chinese">Chinese</option>
        <option value="French">French</option>
      </select>
    </div>
    <div class="form-group">
      <label>Course</label>
      <select name="course" multiple class="form-control">
        <option value="C#">C#</option>
        <option selected="true" value="Java">Java</option>
        <option value="C++">C++</option>
        <option value="Python">Python</option>
        <option value="Ruby on Rail">Ruby on Rail</option>
      </select>
    </div>
    <div class="form-group row">
      <div class="col-sm-6">Desired Language</div>
      <div class="col-sm-4">
        <div class="form-check">
          <input name="language1" value="Vietnamese" checked="true" class="form-check-input" type="checkbox">
          <label class="form-check-label">
            Vietnamese
          </label>
        </div>
        <div class="form-check">
          <input name="language2" value="English" class="form-check-input" type="checkbox">
          <label class="form-check-label">
            English
          </label>
        </div>
        <div class="form-check">
          <input name="language3" value="French" class="form-check-input" type="checkbox">
          <label class="form-check-label">
            French
          </label>
        </div>
      </div>
    </div>
    <br><button type="submit" class="btn btn-primary">Submit</button>
    <a href="/page.jsp" id="cancel" name="cancel" class="btn btn-success">Cancel</a>
  </form>
  <hr>
  <p><a class="resultCourse">Full Name: </a> ${fullName}</p>
  <p><a class="resultCourse">Age: </a>${ageString}</p>
  <p><a class="resultCourse">Country: </a>${country}</p>
  <p><a class="resultCourse">Courses: </a></p>
  <c:forEach var="course" items="${courses}">
    <p class="resultCourse">${course}</p>
  </c:forEach>
  <p><a class="resultCourse">Language: </a></p>
  <p>${language1}</p>
  <p>${language2}</p>
  <p>${language3}</p>

</div>

<script>

</script>

<jsp:include page="fragment/footer.jsp" />