<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div id="page">
	<div id="content">
            <div id="welcome">
                <p>
                    <h2>Вхід</h2>
                    <form action="j_security_check" method="POST">
                    <p><strong>Ваш логин:</strong>
                    <input placeholder="Введите логин" type="text" size="20" name="j_username"></p>
                    <p><strong>Пароль:</strong>
                    <input placeholder="Введите пароль" type="password" size="20" name="j_password"></p>
                    <p><input type="submit" value="Авторизоваться"></p>
                    </form>
                </p>
            </div>		
	</div>
	<div id="sidebar">
            <div id="menu">
                <h2>Меню</h2>
		<ul>
                    <li class="first"><a href="/ASUCommunity/" accesskey="1" title="">Головна</a></li>
                    <li><a href="#" accesskey="2" title="">Форум</a></li>
                    <li><a href="/ASUCommunity/" accesskey="3" title="">Новини</a></li>
                    <li><a href="#" accesskey="4" title="">Вакансії</a></li>
                    <li><a href="registration" accesskey="5" title="">Реєстрація</a></li>
                    <li><a href="private" accesskey="6" title="">Вхід</a></li>
		</ul>
            </div>            
	</div>
	<div style="clear: both; height: 1px;"></div>
    </div>        
</html>        

