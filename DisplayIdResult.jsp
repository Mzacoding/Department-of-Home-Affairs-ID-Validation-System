 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Identification Document (ID) </title>
    </head>
    <body>
        <h1>Identification Document (ID) Result</h1>

        <%

            String idStatus = (String) request.getAttribute("idStatus");
            String idNo = (String) request.getAttribute("IdNo");


        %>


        <div>


            <p>
                This Id Number :  <%=idNo%> 
                is  <%=idStatus%>
            </p> 


            <p>Click To Go <a href="Information.html"> Home </a></p>

        </div>
    </body>
</html>
