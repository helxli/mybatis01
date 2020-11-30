<%--
  Created by IntelliJ IDEA.
  User: Helx-PC
  Date: 2020/11/29
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script crossorigin="anonymous" integrity="sha512-WNLxfP/8cVYL9sj8Jnp6et0BkubLP31jhTG9vhL/F5uEZmg5wEzKoXp1kJslzPQWwPT1eyMiSxlKCgzHLOTOTQ==" src="http://lib.baomitu.com/jquery/3.5.1/jquery.js"></script>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
<h2>${hello}</h2>
<p>click me!</p>
<script>
    $(document).ready(function(){
        $("p").click(function(){
            $(this).load("index/getHelloStr");
        });
    });
</script>
</body>
</html>
