<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div id="page">
	<div id="content">
            <div id="welcome">
                <p>
                    <section>
                    <article>
                    <h2>Реєстрація</h2>
                        <c:if test="${notif ne null}">
                                <span>${notif}</span> 
                        </c:if>
                         <form method="POST" action="registration">
                        <p>
                        <label for="firstname">Имя</label>
                        <input type="text" name="firstname" id="firstname"/>
                        </p>
                        <p>
                        <label for="lastname">Фамилия</label>
                        <input type="text" name="lastname" id="lastname"/>
                        </p>
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
                    </article>
                    </section>
                </p>
            </div>		
	</div>
	<div id="sidebar">
            <div id="menu">
                <h2>Меню</h2>
		<ul>
                    <li class="first"><a href="/ASUCommunity/" accesskey="1" title="">Головна</a></li>
                    <li><a href="/ASUCommunity/" accesskey="3" title="">Новини</a></li>                    
                    <li><a href="fnsearch" accesskey="3" title="">Розширений пошук</a></li>
                    <li><a href="registration" accesskey="5" title="">Реєстрація</a></li>
                    <li><a href="private" accesskey="6" title="">Вхід</a></li>
		</ul>
            </div>            
	</div>
	<div style="clear: both; height: 1px;"></div>
    </div>        
</html>        


