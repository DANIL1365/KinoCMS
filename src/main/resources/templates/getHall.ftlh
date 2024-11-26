<#import "parts/userPart.ftlh" as u>
//
<@u.pageUser>
    <div class="container pb50">
        <img src="/img/${hallUser.topBanner}" alt="" class="img-fluid mb30">
        <div class="row">
            <div class="col-md-9 mb40">
                <article>
                    <div class="post-content">
                        <h3><span>${hallUser.hallNumber}</span></h3>
                        <p>${hallUser.hallDescription}</p>

                        <hr class="mb40">
                        <h4 class="mb40 text-uppercase font500">Карта зала</h4>
                        <div class="media mb40">
                        <img src="/img/${hallUser.hallLayout}" alt="" class="img-fluid mb30">
                        </div>

                        <hr class="mb40">
                        <h4 class="mb40 text-uppercase font500">Галерея</h4>
                        <div class="media mb40">
                            <div class="cssSlider">
                                <ul class="slides">
                                    <#if hallUser.pictureHallGalleryOne??>
                                        <li id="slide1"><img src="/img/${hallUser.pictureHallGalleryOne}" alt="" /></li>
                                    <#else>

                                    </#if>
                                    <#if hallUser.pictureHallGalleryTwo??>
                                        <li id="slide2"><img src="/img/${hallUser.pictureHallGalleryTwo}" alt="" /></li>
                                    <#else>

                                    </#if>
                                    <#if hallUser.pictureHallGalleryThree??>
                                        <li id="slide3"><img src="/img/${hallUser.pictureHallGalleryThree}" alt="" /></li>
                                    <#else>

                                    </#if>
                                    <#if hallUser.pictureHallGalleryFour??>
                                        <li id="slide4"><img src="/img/${hallUser.pictureHallGalleryFour}" alt="" /></li>
                                    <#else>

                                    </#if>
                                    <#if hallUser.pictureHallGalleryFive??>
                                        <li id="slide5"><img src="/img/${hallUser.pictureHallGalleryFive}" alt="" /></li>
                                    <#else>

                                    </#if>
                                </ul>
                                <ul class="thumbnails">
                                    <#if hallUser.pictureHallGalleryOne??>
                                        <li><a href="#slide1"><img src="/img/${hallUser.pictureHallGalleryOne}" /></a></li>
                                    <#else>

                                    </#if>
                                    <#if hallUser.pictureHallGalleryTwo??>
                                        <li><a href="#slide2"><img src="/img/${hallUser.pictureHallGalleryTwo}" /></a></li>
                                    <#else>

                                    </#if>
                                    <#if hallUser.pictureHallGalleryThree??>
                                        <li><a href="#slide3"><img src="/img/${hallUser.pictureHallGalleryThree}" /></a></li>
                                    <#else>

                                    </#if>
                                    <#if hallUser.pictureHallGalleryFour??>
                                        <li><a href="#slide4"><img src="/img/${hallUser.pictureHallGalleryFour}" /></a></li>
                                    <#else>

                                    </#if>
                                    <#if hallUser.pictureHallGalleryFive??>
                                        <li><a href="#slide5"><img src="/img/${hallUser.pictureHallGalleryFive}" /></a></li>
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