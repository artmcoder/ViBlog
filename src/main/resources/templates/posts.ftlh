<!DOCTYPE html>
<html>
<head>
    <title>ViBlog</title>
</head>
<body>
<h1>ViBlog</h1>
<hr>
<h3>All posts on this website</h3>
<#list posts as post>
    <p>
        <strong>${post.title}: </strong>
        <i>${post.text}</i>
    </p>
    <#else>
    <h4>No messages</h4>
</#list>
<hr>


</body>
</html>