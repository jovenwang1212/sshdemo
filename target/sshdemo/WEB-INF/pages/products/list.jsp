<%--
  Created by IntelliJ IDEA.
  User: leo
  Date: 21/02/2016
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    ${name}
    <form action="info" method="post">
        <input name="pid"/><br>
        <input name="pname"/><br>
        <input type="submit"/>
    </form>

<hr>
<button id="putBtn">Put</button>
<button id="delBtn">Delete</button>

    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script>
        $("#putBtn").click(function(){
            var saveData={"pid":"qq"};
            $.ajax({
                type:"PUT",
                url:"info",
                data:JSON.stringify(saveData),
                contentType:"application/json",
                dataType:"json",
                success:function(data){
                    alert(data);
                }
            });
        });
    </script>
</body>
</html>
