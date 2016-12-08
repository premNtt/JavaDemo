<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<section>
Welcome ${requestScope['lbl_user'].username} (<%= session.getAttribute("username") %>)
</section>
</div>

<jsp:include page="footer.jsp"></jsp:include>