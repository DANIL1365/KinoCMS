<#import "parts/userPart.ftlh" as u>
//
<@u.pageUser>
    <div class="text-center">
        <h2>Смотрите сегодня</h2>
    </div>
    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list posterFilms as film>
            <div class="col">
                <div class="card text-center">
                    <#if film.mainPicture??>
                        <img src="/img/${film.mainPicture}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <a href="/currentFilms/edit/${film.id}">
                        <h5 class="card-text"><span>${film.nameCinema}</span></h5>
                        </a>
                        <div class="card-text">
                            <a href="/currentFilms/editBuy/${film.id}"><button type="submit" class="btn btn-primary">Купить билет</button></a>
                        </div>
                    </div>
                </div>
            </div>
        <#else>
            No films
        </#list>
    </div>


</@u.pageUser>