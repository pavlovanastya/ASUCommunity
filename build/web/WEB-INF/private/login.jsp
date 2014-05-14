<%-- 
    Document   : login
    Created on : May 14, 2014, 9:45:49 PM
    Author     : mazafaka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <h1>Авторизация</h1>
    <form action="j_security_check" method="POST">
    <div id="loginBox">
        <p><strong>Ваш логин:</strong>
            <input placeholder="Введите логин" type="text" size="20" name="j_username"></p>
        <p><strong>Пароль:</strong>
            <input placeholder="Введите пароль" type="password" size="20" name="j_password"></p>
        <p><input type="submit" value="Авторизоваться"></p>
    </div>
    </form>
</html>
