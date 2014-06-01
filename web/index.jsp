<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div id="page">
	<div id="content">
            <div id="welcome">
                <p>
                    <c:forEach var="article" items="${article}">
                    <article>
                        <h2>${article.title}</h2>
                        ${fn:substring(article.text,0,300)} ...
                        <span class="read"><a href="article?id=${article.id}">
                                     Читать...</a></span>
                        <span class="date-article">Дата статьи: ${article.date}</span>
                        
                    </article>
                    </c:forEach>
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
