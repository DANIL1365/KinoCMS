<#import "parts/userPart.ftlh" as u>
//
<@u.pageUser>
    <div class="container pb50">
        <div class="row">
            <div class="col-md-9 mb40">
                <article>
                    <#if cinemasUser.logo??>
                        <img src="/img/${cinemasUser.logo}" alt="" class="img-fluid mb30">
                    </#if>
                    <div class="post-content">
                        <h3><span>${cinemasUser.nameCinema}</span></h3>
                        <ul class="post-meta list-inline">
                            <li class="list-inline-item">
                                <i class="fa fa-user-circle-o"></i> <a href="#">John Doe</a>
                            </li>
                            <li class="list-inline-item">
                                <i class="fa fa-calendar-o"></i> <a href="#">29 June 2017</a>
                            </li>
                            <li class="list-inline-item">
                                <i class="fa fa-tags"></i> <a href="#">Bootstrap4</a>
                            </li>
                        </ul>
                        <p>${cinemasUser.descriptionCinema}</p>

                        <hr class="mb40">
                        <h4 class="mb40 text-uppercase font500">Условия</h4>
                        <p>${cinemasUser.conditionsCinema}</p>

                        <hr class="mb40">
                        <h4 class="mb40 text-uppercase font500">Галерея</h4>
                        <div class="media mb40">
                            <div class="cssSlider">
                                <ul class="slides">
                                    <#if cinemasUser.pictureGalleryOne??>
                                        <li id="slide1"><img src="/img/${cinemasUser.pictureGalleryOne}" alt="" /></li>
                                    <#else>

                                    </#if>
                                    <#if cinemasUser.pictureGalleryTwo??>
                                        <li id="slide2"><img src="/img/${cinemasUser.pictureGalleryTwo}" alt="" /></li>
                                    <#else>

                                    </#if>
                                    <#if cinemasUser.pictureGalleryThree??>
                                        <li id="slide3"><img src="/img/${cinemasUser.pictureGalleryThree}" alt="" /></li>
                                    <#else>

                                    </#if>
                                    <#if cinemasUser.pictureGalleryFour??>
                                        <li id="slide4"><img src="/img/${cinemasUser.pictureGalleryFour}" alt="" /></li>
                                    <#else>

                                    </#if>
                                    <#if cinemasUser.pictureGalleryFive??>
                                        <li id="slide5"><img src="/img/${cinemasUser.pictureGalleryFive}" alt="" /></li>
                                    <#else>

                                    </#if>
                                </ul>
                                <ul class="thumbnails">
                                    <#if cinemasUser.pictureGalleryOne??>
                                        <li><a href="#slide1"><img src="/img/${cinemasUser.pictureGalleryOne}" /></a></li>
                                    <#else>

                                    </#if>
                                    <#if cinemasUser.pictureGalleryTwo??>
                                        <li><a href="#slide2"><img src="/img/${cinemasUser.pictureGalleryTwo}" /></a></li>
                                    <#else>

                                    </#if>
                                    <#if cinemasUser.pictureGalleryThree??>
                                        <li><a href="#slide3"><img src="/img/${cinemasUser.pictureGalleryThree}" /></a></li>
                                    <#else>

                                    </#if>
                                    <#if cinemasUser.pictureGalleryFour??>
                                        <li><a href="#slide4"><img src="/img/${cinemasUser.pictureGalleryFour}" /></a></li>
                                    <#else>

                                    </#if>
                                    <#if cinemasUser.pictureGalleryFive??>
                                        <li><a href="#slide5"><img src="/img/${cinemasUser.pictureGalleryFive}" /></a></li>
                                    <#else>

                                    </#if>
                                </ul>
                            </div>
                        </div>
                    </div>
                </article>
                <!-- post article-->

            </div>
            <div class="col-md-3 mb40">
                <div class="text-center">
                    <h4 class="sidebar-title text">Залы</h4>
                    <div class="card-body">
                        <table id="example2" class="table table-bordered table-hover" style="background: white">
                            <tbody>
                            <tr>
                                <#list halls as hall>
                            <tr>
                                <td><a href="/hall/edit/${hall.id}">${hall.hallNumber!" "}</a></td>
                            </tr>
                            </#list>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="text-center">
                    <h4 class="sidebar-title text">Смотрите сегодня:</h4>
                    <div class="card-body">
                        <table id="example2" class="table table-bordered table-hover" style="background: white">
                            <tbody>
                            <tr>
                                <#list timeTableFilms as film>
                            <tr>
                                <td><a href="/currentFilms/edit/${film.id}">${film.nameCinema!" "}</a></td>
                            </tr>
                            </#list>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

</@u.pageUser>