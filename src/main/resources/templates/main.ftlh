<#import "parts/common.ftlh" as c>
//
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
    <#list films as currentFilms>
        <div class="col">
            <div class="card">
            <#if currentFilms.mainPicture??>
                <img src="/img/${currentFilms.mainPicture}" class="card-img-top">
            </#if>
                <div class="card-body">
                    <h5 class="card-title"><span>${currentFilms.nameCinema}</span></h5>
                    <a href="/currentFilms/${currentFilms.id}"><button type="submit" class="btn btn-primary">Update</button></a>
                    <a href="/deleteFilm/${currentFilms.id}"><button type="submit" class="btn btn-primary">Delete</button></a>
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
                <div class="card text-center">
                    <#if soonFilm.mainSoonPicture??>
                        <img src="/img/${soonFilm.mainSoonPicture}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <h5 class="card-title"><span>${soonFilm.nameSoonCinema}</span></h5>
<#--                    </div>-->
<#--                        <div class="card-body">-->
                        <a href="/soonFilms/${soonFilm.id}" class="btn btn-primary">Update</a>
                        <a href="/deleteSoonFilm/${soonFilm.id}" class="btn btn-primary">Delete</a>
                        </div>
                        <#--            <span>${film.description}</span>-->


                        <#--            <div>-->
                        <#--                <#if film.pictureGallery??>-->
                        <#--                    <img src="/img/${film.pictureGallery}">-->
                        <#--                </#if>-->
                        <#--            </div>-->
                        <#--            <span>${film.trailerLink}</span>-->
                        <#--            <span>${film.typeCinema}</span>-->

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

