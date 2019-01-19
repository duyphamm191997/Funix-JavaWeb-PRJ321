<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : Result-SubjectRegistration
    Created on : Dec 18, 2018, 11:15:58 PM
    Author     : demonslight998
--%>

<jsp:include page="fragment/header.jsp" />

<div class="container getForm">
  Name: <label>${name}</label> <br>
  Surname: <label>${surname}</label> <br>
  Phone Number: <label>${phoneNumber}</label> <br>
  Email: <label>${email}</label> <br>
  Subjects Name:
  <c:forEach var="value" items="${chbxValues}">
    <label>${value}</label> <br>
  </c:forEach>

</div>

<jsp:include page="fragment/footer.jsp" />
