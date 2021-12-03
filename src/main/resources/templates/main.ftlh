<#import "parts/common.ftlh" as c>

<@c.page>

<form method="get" action="/main" class="row g-3">
    <div class="col-auto">
<#--        <label for="inputText" class="visually-hidden">Search by name</label>-->
        <input type="text" name="filter" class="form-control" value="${filter?ifExists}" id="inputText" placeholder="Search by name film">
    </div>
    <div class="col-auto">
        <button type="submit" class="btn btn-primary mb-3">Search</button>
    </div>
</form>

    <a href="/filmAdd"><button type="submit" class="btn btn-primary">Add new film</button></a>

    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
    <#list films as film>
        <div class="col">
            <div class="card">
            <#if film.mainPicture??>
                <img src="/img/${film.mainPicture}" class="card-img-top">
            </#if>
                <div class="card-body">
                    <h5 class="card-title"><span>${film.nameCinema}</span></h5>
                    <a href="/deleteFilm/${film.id}"><button type="submit" class="btn btn-primary">Delete</button></a>
<#--            <span>${film.description}</span>-->


<#--            <div>-->
<#--                <#if film.pictureGallery??>-->
<#--                    <img src="/img/${film.pictureGallery}">-->
<#--                </#if>-->
<#--            </div>-->
<#--            <span>${film.trailerLink}</span>-->
<#--            <span>${film.typeCinema}</span>-->
            </div>
<#--            <div class="card-footer text-muted">-->
<#--            ${film.authorName?ifExists}-->
<#--            </div>-->
        </div>
        </div>
        <#else>
        No films
    </#list>
    </div>

    <form method="get" action="/main" class="row g-3">
        <div class="col-auto">
            <#--        <label for="inputText" class="visually-hidden">Search by name</label>-->
            <input type="text" name="filter" class="form-control" value="${filter?ifExists}" id="inputText" placeholder="Search by name film">
        </div>
        <div class="col-auto">
            <button type="submit" class="btn btn-primary mb-3">Search</button>
        </div>
    </form>

    <a href="/soonFilmAdd"><button type="submit" class="btn btn-primary">Add new soon film</button></a>

    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list soonFilms as soonFilm>
            <div class="col">
                <div class="card">
                    <#if soonFilm.mainSoonPicture??>
                        <img src="/img/${soonFilm.mainSoonPicture}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <h5 class="card-title"><span>${soonFilm.nameSoonCinema}</span></h5>
                        <a href="/deleteSoonFilm/${soonFilm.id}"><button type="submit" class="btn btn-primary">Delete</button></a>
                        <#--            <span>${film.description}</span>-->


                        <#--            <div>-->
                        <#--                <#if film.pictureGallery??>-->
                        <#--                    <img src="/img/${film.pictureGallery}">-->
                        <#--                </#if>-->
                        <#--            </div>-->
                        <#--            <span>${film.trailerLink}</span>-->
                        <#--            <span>${film.typeCinema}</span>-->
                    </div>
                    <#--            <div class="card-footer text-muted">-->
                    <#--            ${film.authorName?ifExists}-->
                    <#--            </div>-->
                </div>
            </div>
        <#else>
            No films
        </#list>
    </div>
</@c.page>

