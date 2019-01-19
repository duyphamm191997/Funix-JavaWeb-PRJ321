<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : PostDetail
    Created on : Jan 10, 2019, 10:55:53 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../fragment/header.jsp" />

<div class="container" style="margin-top: 2rem;">
  <form>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label">Title</label>
      <div class="col-sm-10">
        <p class="form-control-static">${thisArt.getTitle()}</p>
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label">Topic</label>
      <div class="col-sm-10">
        <p class="form-control-static">${thisArt.getTopic()}</p>
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label">Contents</label>
      <div class="col-sm-10">
        <p class="form-control-static">${thisArt.getContents()}</p>
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label">Author</label>
      <div class="col-sm-10">
        <p class="form-control-static">${thisArt.getAuthor()}</p>
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label">Created At</label>
      <div class="col-sm-10">
        <p class="form-control-static">${thisArt.getCreatedAt()}</p>
      </div>
    </div>
  </form>
</div>


<jsp:include page="../fragment/footer.jsp" />

