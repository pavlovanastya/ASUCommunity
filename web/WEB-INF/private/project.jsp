<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div id="page">
	<div id="content">
            <div id="welcome">
                <p>
                    <section>
                    <article>
                    <h2>${project.get(0)[1]}</h2>
                        <p>1.${project.get(0)[2]} балів</p>
                        <p>2.${project.get(0)[3]}</p>                    
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
                    <li><a href="#" accesskey="2" title="">Форум</a></li>
                    <li><a href="/ASUCommunity/" accesskey="3" title="">Новини</a></li>
                    <li><a href="#" accesskey="4" title="">Вакансії</a></li>
                    <li><a href="private" accesskey="6" title="">Вихід</a></li>
		</ul>
            </div>
            <div class="boxed">
		<h2 class="title">Персональний кабінет</h2>
                    <div class="content">
			<ul>
                            <li><a href="project" accesskey="1" title="">Виконані роботи</a></li>
                            <li><a href="#" accesskey="2" title="">Оцінки</a></li>
                            <li><a href="#" accesskey="3" title="">Календар</a></li>
                            <li><a href="#" accesskey="4" title="">Траєкторія</a></li>
                            <li><a href="#" accesskey="6" title="">Олімпіади</a></li>
                        </ul>
                    </div>
            </div>
	</div>
	<div style="clear: both; height: 1px;"></div>
    </div>        
</html>        
