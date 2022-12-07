<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta charset="UTF-8">
    <title>Shopping Website</title>
</head>
<body>
<h2>Товары со всей России</h2>
<form action="/" method="get">
    <label for="title">Search: </label>
    <input type="text" name="title" id="title">
    <input type="submit" value="Поиск">
</form>
<#list products as product>
    <div>
        <p><b>${product.title} ${product.price} руб. | <a href="/product/${product.id}">Подробнее..</a></b></p>
    </div>
    <#else>
    <h1>Товаров нет</h1>
</#list>
</body>
</html>

