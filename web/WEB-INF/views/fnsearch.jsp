<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div id="page">
	<div id="content">
            <div id="welcome">
                <form method="POST" action="fnsearch">
                <p>
                <label for="сsearch">Пошук по категорії</label>
                <input type="text" name="сsearch" id="сsearch"/>
                <button type="submit">Знайти</button>
                </p>
                <p>
                <label for="dsearch">Пошук по даті</label>
                <input type="text" name="dsearch" id="dsearch"/>
                <button type="submit">Знайти</button>
                </p>
                </form>
                <p>
                    
                    <c:forEach var="articles" items="${article}">
                    <article>
                        <h2>${articles.title}</h2>
                        ${fn:substring(articles.text,0,300)} ...
                        <a href="article?id=${articles.id}">Читать...</a>
                        <p>Дата статьи: ${articles.date} 
                        Категория:${articles.categoriesList.get(0).name}</p>
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
                    <li><a href="/ASUCommunity/" accesskey="3" title="">Новини</a></li>
                    <li><a href="registration" accesskey="5" title="">Реєстрація</a></li>
                    <li><a href="private" accesskey="6" title="">Вхід</a></li>
		</ul>
            </div>
	</div>
	<div style="clear: both; height: 1px;"></div>
    </div>        
</html>        
