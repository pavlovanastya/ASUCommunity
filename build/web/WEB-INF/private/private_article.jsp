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
                    <li><a href="forum" accesskey="2" title="">Форум</a></li>
                    <li><a href="/ASUCommunity/" accesskey="3" title="">Новини</a></li>                    
                    <li><a href="fnsearch" accesskey="3" title="">Розширений пошук</a></li>
                    <li><a href="#" accesskey="4" title="">Вакансії</a></li>
                    <li><a href="registration" accesskey="5" title="">Реєстрація</a></li>
                    <li><a href="logout" accesskey="6" title="">Вихід</a></li>
		</ul>
            </div>
            <div class="boxed">
		<h2 class="title">Персональний кабінет,${name}</h2>
                    <div class="content">
			<ul>
                            <li><a href="project" accesskey="1" title="">Виконані роботи</a></li>
                            <li><a href="#" accesskey="2" title="">Оцінки</a></li>
                            <li><a href="#" accesskey="3" title="">Календар</a></li>
                            <li><a href="#" accesskey="4" title="">Траєкторія</a></li>
                            <li><a href="#" accesskey="6" title="">Олімпіади</a></li>
                        </ul>
                    </div>
			<h2 class="title">Можливості Новин</h2>
			<div class="content">
				<ul>
					<li><a href="addnews">Додавання новини</a></li>
					<li><a href="#">Редагування новини</a></li>
					<li><a href="#">Видалення новини</a></li>
				</ul>
			</div>
            </div>
	</div>
	<div style="clear: both; height: 1px;"></div>
    </div>        
</html>        
