<#import "parts/userPart.ftlh" as u>

<@u.pageUser>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-7 col-lg-4 mb-5 mb-lg-0 wow fadeIn">
                <div class="card border-0 shadow">
                    <#if soonFilmsUser.mainSoonPicture??>
                        <img src="/img/${soonFilmsUser.mainSoonPicture}">
                    </#if>
                    <div class="card-body p-1-9 p-xl-5">
                        <div class="mb-4">
                            <h3 class="h4 mb-0">Avada Media</h3>
                        </div>
                        <ul class="list-unstyled mb-4">
                            <li class="mb-3"><a href="#!"><i class="far fa-envelope display-25 me-3 text-secondary"></i>avada-media@gmail.com</a></li>
                            <li class="mb-3"><a href="#!"><i class="fas fa-mobile-alt display-25 me-3 text-secondary"></i>+012 (345) 6789</a></li>
                            <li><a href="#!"><i class="fas fa-map-marker-alt display-25 me-3 text-secondary"></i>Odessa, UA</a></li>
                        </ul>
                        <ul class="social-icon-style2 ps-0">
                            <li><a href="#!" class="rounded-3"><i class="fab fa-facebook-f"></i></a></li>
                            <li><a href="#!" class="rounded-3"><i class="fab fa-twitter"></i></a></li>
                            <li><a href="#!" class="rounded-3"><i class="fab fa-youtube"></i></a></li>
                            <li><a href="#!" class="rounded-3"><i class="fab fa-linkedin-in"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-8">
                <div class="ps-lg-1-6 ps-xl-5">
                    <div class="mb-5 wow fadeIn">
                        <div class="text-start mb-1-6 wow fadeIn">
                            <h2 class="h1 mb-0 text-primary"><span>${soonFilmsUser.nameSoonCinema}</span></h2>
                        </div>
                        <div class="content">
                        <p>${soonFilmsUser.description}</p>
                        </div>
                    </div>
                    <div class="wow fadeIn">
                        <div class="text-start mb-1-6 wow fadeIn">
                            <h2 class="mb-0 text-primary">Кадры и Постеры</h2>
                        </div>
                        <div class="cssSlider">
                            <ul class="slides">
                                <li id="slide1"><img src="/img/${soonFilmsUser.pictureGalleryOne}" alt="" /></li>
                                <li id="slide2"><img src="/img/${soonFilmsUser.pictureGalleryTwo}" alt="" /></li>
                                <li id="slide3"><img src="/img/${soonFilmsUser.pictureGalleryThree}" alt="" /></li>
                                <li id="slide4"><img src="/img/${soonFilmsUser.pictureGalleryFour}" alt="" /></li>
                                <li id="slide5"><img src="/img/${soonFilmsUser.pictureGalleryFive}" alt="" /></li>
                            </ul>
                            <ul class="thumbnails">
                                <li><a href="#slide1"><img src="/img/${soonFilmsUser.pictureGalleryOne}" /></a></li>
                                <li><a href="#slide2"><img src="/img/${soonFilmsUser.pictureGalleryTwo}" /></a></li>
                                <li><a href="#slide3"><img src="/img/${soonFilmsUser.pictureGalleryThree}" /></a></li>
                                <li><a href="#slide4"><img src="/img/${soonFilmsUser.pictureGalleryFour}" /></a></li>
                                <li><a href="#slide5"><img src="/img/${soonFilmsUser.pictureGalleryFive}" /></a></li>
                            </ul>
                        </div>
                        <div class="text-start mb-1-6 wow fadeIn mt-2">
                            <h2 class="mb-0 text-primary">Трейлер</h2>
                            <iframe width="560" height="315" src="${soonFilmsUser.trailerLink}" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</@u.pageUser>