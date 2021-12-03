<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>
<@c.page>
<div>
    <@l.logout />
    <span><a href="/user">User list</a> </span>
</div>
<div>
    <form method="post" enctype="multipart/form-data">

        <label for="nameCinema">
            <input type="text" name="nameCinema" id="nameCinema" placeholder="Введите название фильма" />
        </label>
        <input type="text" name="description" placeholder="Введите описание" />
        <input type="text" name="trailerLink" placeholder="Вставить ссылку на трейлер" />
        <input type="text" name="typeCinema" placeholder="Введите тип фильма" />
        <input type="file" name="mainPicture" placeholder="Вставить главную картинку">
        <input type="file" name="pictureGallery" placeholder="Вставить галерею картинок">

        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit">Добавить</button>
    </form>

</div>
    <div>Список фильмов</div>
<form method="get" action="/main">
    <input type="text" name="filter" value="${filter?ifExists}">
    <button type="submit">Найти</button>
</form>
    <#list films as film>
    <div>
            <b>${film.id}</b>
            <span>${film.nameCinema}</span>
            <span>${film.description}</span>
            <div>
                <#if film.mainPicture??>
                    <img src="/img/${film.mainPicture}">
                </#if>
            </div>
            <div>
                <#if film.pictureGallery??>
                    <img src="/img/${film.pictureGallery}">
                </#if>
            </div>
            <span>${film.trailerLink}</span>
            <span>${film.typeCinema}</span>
            <strong>${film.authorName}</strong>
            <br/>
        </div>
        <#else>
        No films
    </#list>
</@c.page>