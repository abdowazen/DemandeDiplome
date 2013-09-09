
<!--Import jstl library for tags -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import = "java.util.List" %>
<%@page import = "org.*" %> 
<%@page import = "DAL.*"%>
<%@page import = "ObjectBusiness.*"%>
<%-- create an instance of AccessDB --%> 
<%--    create an instance of List, then retrieve SubjectNames --%> 
<%-- make list accessible to page --%>
<% 
   AccessDB accessDB = new AccessDB();
   List subjNames = accessDB.getSubjectName();   
   request.setAttribute("subjNames",subjNames );
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
        <link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
        <link href="default.css" rel="stylesheet" type="text/css" media="all" />
        <title> JSP Page</title>
    </head>
    <body>
    <div id="header-wrapper">
            <div id="header">
                    <div id="logo">
                            <h1><a href="#"> Demande De Diplome </a></h1>
                    </div>
                    <div id="menu">
                            <ul>
                                    <li class="current_page_item"><a href="HomePage.html" accesskey="1" title="">Homepage</a></li>
                                    <li><a href="index.jsp" accesskey="2" title="">Our Clients</a></li>
                                    <li><a href="#" accesskey="3" title="">About Us</a></li>
                                    <li><a href="#" accesskey="4" title="">Careers</a></li>
                                    <li><a href="#" accesskey="5" title="">Contact Us</a></li>
                                    <li><a href="#" accesskey="6" title="">Login</a></li>


                            </ul>
                    </div>
            </div>
    </div>
      
      <div>
      <br> 
      <div id="wrapper">
      <div id="page-wrapper">
      <div id="page">
      <div id="wide-content">
     
      <h2 align="center"> Welcome to IFPWAFCAD, the International Former Professional 
          <br> Wrestlers' Association for Counseling and Development!</h2> 
      <br><br> 
      
      <table width="55%" align="center"> 
          <div id="sidebar">
          <tr>
              <td>
                  <strong>IFPWAFCAD offers expert counseling in 
                      a wide range of fields.</strong>
              </td>
          </tr> 
          <tr>
          <td><br>To view the contact details of an IFPWAFCAD certified former 
              <br>professional wrestler in your area, select a subject below:</td>
          </tr> 
          <tr><td>
            <form action="response.jsp" method="post"> <br>
            <strong>Select a subject:</strong>
               <%-- <select name="subject_id" size="1" >
                    <option value="1">Marriage Guidance</option> 
                    <option value="2">Financial Consultancy</option>
               </select> --%>
                <select name="subject_id" size="1" >  
                <c:forEach var="subName" items="${requestScope.subjNames}" >  
                    <option value="${subName.id}">${subName.name}</option> 
                </c:forEach> 
                </select>
                <div id ="button-style">
                <input type="submit" name="submit" value="submit">
                </div>
            </form>  
            </td></tr>
      </table>
      </div>
      </div>
      </div>
      </div>
      </div>
      <div id="footer" class="container">
	<p>Copyright (c) 2013 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/" rel="nofollow">FreeCSSTemplates.org</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
      </div>  
    </body>
 

</html>
