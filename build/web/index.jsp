<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div id="page">
	<div id="content">
            <div id="welcome">
                <form method="POST" action="nsearch">
                <p>
                <label for="search">Пошук</label>
                <input type="text" name="search" id="search"/>
                <button type="submit">Знайти</button>
                </p>
                </form>
                
                <p>
                    <c:forEach var="article" items="${article}">
                    <article>
                        <h2>${article.title}</h2>
                        ${fn:substring(article.text,0,300)} ...
                        <a href="article?id=${article.id}">Читать...</a>
                        <p>Дата статьи: ${article.date} 
                        Категория:${article.categoriesList.get(0).name}</p>
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
                    <li><a href="/ASUCommunity/" accesskey="2" title="">Новини</a></li>
                    <li><a href="fnsearch" accesskey="3" title="">Розширений пошук</a></li>
                    <li><a href="registration" accesskey="4" title="">Реєстрація</a></li>
                    <li><a href="private" accesskey="5" title="">Вхід</a></li>
		</ul>
            </div>
	</div>
        
	<div style="clear: both; height: 1px;"></div>
    </div>        
</html>        
