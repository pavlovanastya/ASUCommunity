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
                <h2>Персональний кабінет</h2>
                <ul>
                    <li><a href="project">Кореляція проектів</a></li>
                    <li><a href="#">Навчальна программа</a></li>
                    <li><a href="#">Траєкторія навчання</a></li>
                    <li><a href="#">Власний календар</a></li>
                    <li><a href="#">Олімпіадна робота</a></li>
                    <li><a href="logout">Вихід</a></li>
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

