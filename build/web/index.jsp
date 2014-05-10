<%-- 
    Document   : index
    Created on : May 4, 2014, 6:27:02 PM
    Author     : mazafaka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <div id="main">
            <aside class="leftAside">
                <h2>Форум</h2>
                <ul>
                    <li><a href="#">Программирование</a></li>
                    <li><a href="#">Администрирование</a></li>
                    <li><a href="#">Железо</a></li>
                    <li><a href="#">Сетевые технологии</a></li>
                    
                </ul>
            </aside>
            <section>
                 <c:forEach var="article" items="${article}">
                        <article>
                        <h1>${article.title}</h1>
                        <div class="text-article">
                        ${fn:substring(article.text,0,300)} ...
                        </div>
                        <div class="fotter-article">
                        <span class="read"><a href="article?id=${article.id}">
                                     Читать...</a></span>
                        <span class="date-article">Дата статьи: ${article.date}</span>
                        </div>
                        </article>
            </c:forEach>
            </section>
        </div>
</html>        
