<%-- 
    Document   : project
    Created on : May 17, 2014, 5:40:37 PM
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
                    <h1>${project.get(0)[1]}</h1>
                    <div class="text-article">
                        <p>1.${project.get(0)[2]} балів</p>
                        <p>2.${project.get(0)[3]}</p>
                    </div>
                    
                </article>
            </section>
        </div>
   
</html>
