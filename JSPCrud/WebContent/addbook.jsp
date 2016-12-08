<%@page import="com.javatpoint.dao.BookDao"%>

<jsp:useBean id="students"   class="com.javatpoint.bean.Book"> </jsp:useBean>
   <jsp:setProperty name="students" property="*" />  
<%

int i = BookDao.saveBook(students);
if(i>0){
	System.out.println("success");
}else{
	System.out.println("Error");
}
%>

