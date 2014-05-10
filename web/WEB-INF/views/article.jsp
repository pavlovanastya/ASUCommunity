<%-- 
    Document   : page
    Created on : May 4, 2014, 6:30:00 PM
    Author     : mazafaka
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <div id="main">
            <aside class="leftAside">
                <h2>Темы статей</h2>
                <ul>
                    <li><a href="#">Тема 1</a></li>
                    <li><a href="#">Тема 2</a></li>
                    <li><a href="#">Тема 3</a></li>
                    <li><a href="#">Тема 3</a></li>
                    
                </ul>
            </aside>
            <section>
                <article>
                    <h1>${article.title}</h1>
                    <div class="text-article">
                        ${article.text}
                    </div>
                    <div class="fotter-article">
                        <span class="date-article">Дата статьи: ${article.date}</span>
                    </div>
                </article>
            </section>
        </div>
       
    </body>
</html>

