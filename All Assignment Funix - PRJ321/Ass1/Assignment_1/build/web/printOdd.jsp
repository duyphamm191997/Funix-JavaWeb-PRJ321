<%--
    Document   : printOdd
    Created on : Dec 18, 2018, 9:09:15 PM
    Author     : demonslight998
--%>

<jsp:include page="fragment/header.jsp" />

<div class="container justLike">
  <%
    for (int i = 0; i < 500; i++) {
      if (i % 2 != 0 && i % 5 == 0) {
        out.println("<h2 class=\"special\">" + i + "</h2>");
      } else if (i % 2 != 0) {
        out.println("<h2>" + i + "</h2>");
      }
    }
  %>
</div>

<jsp:include page="fragment/footer.jsp" />
