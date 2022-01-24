<#import "parts/userPart.ftlh" as u>

<@u.pageUser>

    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
        </ol>
        <div class="carousel-inner">
            <#list topSliders as topSlider>
            <#if !(topSlider?has_next)>
            <div class="carousel-item active">
                <#if topSlider.firstTopImage??>
                    <img src="/img/${topSlider.firstTopImage}" class="d-block w-100" alt="...">
                </#if>
            </div>
            <div class="carousel-item">
                <#if topSlider.secondTopImage??>
                    <img src="/img/${topSlider.secondTopImage}" class="d-block w-100" alt="...">
                </#if>
            </div>
            <div class="carousel-item">

                <#if topSlider.thirdTopImage??>
                    <img src="/img/${topSlider.thirdTopImage}" class="d-block w-100" alt="...">
                </#if>
            </div>
            <div class="carousel-item">
                <#if topSlider.fourthTopImage??>
                    <img src="/img/${topSlider.fourthTopImage}" class="d-block w-100" alt="...">
                </#if>
            </div>
            <div class="carousel-item">
                <#if topSlider.fifthTopImage??>
                    <img src="/img/${topSlider.fifthTopImage}" class="d-block w-100"  alt="...">
                </#if>

                </#if>
                </#list>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-target="#carouselExampleIndicators" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-target="#carouselExampleIndicators" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </button>
    </div>
    <div class="text-center">
    <h2>Смотрите сегодня</h2>
    </div>
    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list userFilms as film>
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
    <div class="text-center">
    <h2>Смотрите скоро</h2>
    </div>
    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list soonFilmsUser as soonFilm>
            <div class="col">
                <div class="card text-center">
                    <#if soonFilm.mainSoonPicture??>
                        <img src="/img/${soonFilm.mainSoonPicture}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <a href="/soonFilms/edit/${soonFilm.id}">
                        <h4 class="card-text"><span>${soonFilm.nameSoonCinema}</span></h4>
                        </a>
                        <div class="card-text">
                        <h3>С 1 января</h3>
                        </div>
                    </div>
                </div>
            </div>
        <#else>
            No films
        </#list>
    </div>
    <div class="text-center">
        <h2>Новости и акции</h2>
    </div>
    <div id="carouselExampleIndicators" class="carousel slide mt-1" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
        </ol>
        <div class="carousel-inner">
            <#list bottomSliders as bottomSlider>
            <#if !(bottomSlider?has_next)>
            <div class="carousel-item active">
                <#if bottomSlider.firstImage??>
                    <img src="/img/${bottomSlider.firstImage}" class="d-block w-100" alt="...">
                </#if>
            </div>
            <div class="carousel-item">
                <#if bottomSlider.secondImage??>
                    <img src="/img/${bottomSlider.secondImage}" class="d-block w-100" alt="...">
                </#if>
            </div>
            <div class="carousel-item">

                <#if bottomSlider.thirdImage??>
                    <img src="/img/${bottomSlider.thirdImage}" class="d-block w-100" alt="...">
                </#if>
            </div>
            <div class="carousel-item">
                <#if bottomSlider.fourthImage??>
                    <img src="/img/${bottomSlider.fourthImage}" class="d-block w-100" alt="...">
                </#if>
            </div>
            <div class="carousel-item">
                <#if bottomSlider.fifthImage??>
                    <img src="/img/${bottomSlider.fifthImage}" class="d-block w-100"  alt="...">
                </#if>

                </#if>
                </#list>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-target="#carouselExampleIndicators" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-target="#carouselExampleIndicators" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </button>
    </div>

    <div class="text-center mt-3">
        <h3>SEO TEXT</h3>
    </div>
    <div class="content">
    <#list mainPage as mainPage>
        <#if !(mainPage?has_next)>
            <p>${mainPage.seoText}</p>
        </#if>
    </#list>
    </div>


</@u.pageUser>