<%-- 
    Document   : index
    Created on : May 3, 2014, 11:24:38 PM
    Author     : mazafaka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN" "http://www.w3.org/TR/REC-html40/loose.dtd">
<html>
        <div id="main">
            <aside class="leftAside">
                <h2>Что нужно для регистрации</h2>
                <p>Что бы регистрация прошла успешно, заполните все поля и нажмите на
                кнопку "Зарегистрироваться"
                </p>
            </aside>
            <section>
                <article>
                    <h1>Регистрация</h1>
                    <div class="text-article">
                        <form method="POST" action="registration">
                        <p>
                            <label for="login">Логин</label>
                            <input type="text" name="login" id="login"/>
                        </p>
                        <p>
                        <label for="email">E-Mail</label>
                        <input type="email" name="email" id="email"/>
                        </p>
                        <p>
                        <label for="password">Пароль</label>
                        <input type="password" name="password" id="password"/>
                        
                        <label for="password2">Повторите пароль</label>
                        <input type="password" name="password2" id="password2"/>
                        </p>
                        <p>
                            <button type="submit">Зарегистрироваться</button>
                        </p>
                        </form>
                    </div>
                </article>
            </section>
        </div>
</html>        
