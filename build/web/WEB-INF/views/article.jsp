<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div id="page">
	<div id="content">
            <div id="welcome">
                <p>
                    <section>
                    <article>
                    <h2>${article.title}</h2>
                        ${article.text}
                        <h2>Комментарии:</h2>
                        ${messages.get(0)[1]}
                        <p>Дата комментария: ${messages.get(0)[2]}</p>
                        <p>Автор: ${messages.get(0)[3]}</p>                        
                        <span class="date-article">Дата статьи: ${article.date}</span>
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
		</ul>
            </div>            
	</div>
	<div style="clear: both; height: 1px;"></div>
    </div>        
</html>        
