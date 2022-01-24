<#import "parts/userPart.ftlh" as u>

<@u.pageUser>

    <div class="text-center">
        <h2>Смотрите скоро</h2>
    </div>
    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list soonFilmsPosterSoon as soonFilm>
            <div class="col">
                <div class="card text-center">
                    <#if soonFilm.mainSoonPicture??>
                        <img src="/img/${soonFilm.mainSoonPicture}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <a href="/soonFilms/edit/${soonFilm.id}">
                        <h4 class="card-text"><span>${soonFilm.nameSoonCinema}</span></h4>
                        </a>
                        <#--                    </div>-->
                        <#--                        <div class="card-body">-->
                        <div class="card-text">
                            <h3>С 1 января</h3>
                        </div>


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