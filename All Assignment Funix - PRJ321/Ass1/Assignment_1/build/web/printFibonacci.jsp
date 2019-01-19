<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : printFibonanci
    Created on : Dec 18, 2018, 9:49:24 PM
    Author     : demonslight998
--%>

<jsp:include page="fragment/header.jsp" />

<div class="container justLike">
  <%
    int n1 = 0, n2 = 1, fib = 0, fib_count = 0;
    while (fib < 10946) {
      fib = n1 + n2;
      n1 = n2;
      n2 = fib;
      fib_count += 1;
      out.println("<h2>" + fib + "</h2>");
    };
  %>
</div>

<jsp:include page="fragment/footer.jsp" />
