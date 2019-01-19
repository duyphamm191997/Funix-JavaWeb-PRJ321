<%--
    Document   : EditPost
    Created on : Jan 10, 2019, 10:56:23 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../fragment/header.jsp" />

<body id="page-top">

  <jsp:include page="../fragment/navIndex.jsp" />

  <div class="container" style="margin-top: 2rem;">
    <h5 style="color: red">${error}</h5>
    <form action="/SendMail" method="POST">
      <input type="hidden" class="form-control" name="id" value="${thisArt.getId()}">
      <div class="form-group">
        <label for="">Title</label>
        <input type="text" class="form-control" name="title" value="${thisArt.getTitle()}">
      </div>
      <div class="form-group">
        <label for="">Author</label>
        <input type="text" class="form-control" name="author" value="${thisArt.getAuthor()}">
      </div>
      <div class="form-group">
        <label for="">Topic</label>
        <textarea class="form-control" name="topic" rows="=2">${thisArt.getTopic()}</textarea>
      </div>
      <div class="form-group">
        <label for="">Content</label>
        <textarea class="form-control" name="contents" rows="4">${thisArt.getContents()}</textarea>
      </div>
      <div class="form-check">
        <input type="checkbox" class="form-check-input" name="status" ${(thisArt.getStatus() == 0) ? "" : "checked"} value="Published">
        <label class="form-check-label" for="">Published</label>
      </div>
      <br>
      <button type="submit" class="btn btn-lg btn-info">Submit</button>
    </form>
  </div>

  <jsp:include page="../fragment/footer.jsp" />
