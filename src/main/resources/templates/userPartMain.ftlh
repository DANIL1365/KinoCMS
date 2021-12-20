<#import "parts/userPart.ftlh" as u>

<@u.pageUser>

<#--    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">-->
<#--        <ol class="carousel-indicators">-->
<#--            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>-->
<#--            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>-->
<#--            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>-->
<#--        </ol>-->
<#--        <div class="carousel-inner">-->
<#--            <div class="carousel-item active">-->
<#--&lt;#&ndash;                <#if soonFilm.mainSoonPicture??>&ndash;&gt;-->
<#--&lt;#&ndash;                    <img src="/img/${soonFilm.mainSoonPicture}" class="d-block w-100" alt="...">&ndash;&gt;-->
<#--&lt;#&ndash;                </#if>&ndash;&gt;-->
<#--            </div>-->
<#--            <div class="carousel-item">-->
<#--                <img src="..." class="d-block w-100" alt="...">-->
<#--            </div>-->
<#--            <div class="carousel-item">-->
<#--                <img src="..." class="d-block w-100" alt="...">-->
<#--            </div>-->
<#--        </div>-->
<#--        <button class="carousel-control-prev" type="button" data-target="#carouselExampleIndicators" data-slide="prev">-->
<#--            <span class="carousel-control-prev-icon" aria-hidden="true"></span>-->
<#--            <span class="sr-only">Previous</span>-->
<#--        </button>-->
<#--        <button class="carousel-control-next" type="button" data-target="#carouselExampleIndicators" data-slide="next">-->
<#--            <span class="carousel-control-next-icon" aria-hidden="true"></span>-->
<#--            <span class="sr-only">Next</span>-->
<#--        </button>-->
<#--    </div>-->

    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list userFilms as film>
            <div class="col">
                <div class="card">
                    <#if film.mainPicture??>
                        <img src="/img/${film.mainPicture}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <h5 class="card-title"><span>${film.nameCinema}</span></h5>
                        <a href="/currentFilms/${film.id}"><button type="submit" class="btn btn-primary">Update</button></a>
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

    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list soonFilmsUser as soonFilm>
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

</@u.pageUser>