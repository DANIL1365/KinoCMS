<#import "parts/userPart.ftlh" as u>

<@u.pageUser>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-7 col-lg-4 mb-5 mb-lg-0 wow fadeIn">
                <div class="card border-0 shadow">
                    <#if currentFilmsUser.mainPicture??>
                        <img src="/img/${currentFilmsUser.mainPicture}">
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
                            <h2 class="h1 mb-0 text-primary"><span>${currentFilmsUser.nameCinema}</span></h2>
                        </div>
                    </div>
                    <div class="wow fadeIn">
                        <div class="text-start mb-1-6 wow fadeIn">
                            <h2 class="mb-0 text-primary">Зал</h2>
                        </div>
                        <img src="/dist/img/kino_hall2.jpg" class="img-fluid" >
                        </div>
                    </div>
                <div class="wow fadeIn">
                    <div class="text-start mb-1-6 wow fadeIn" style="color: black">
                        <h2 class="mb-0 text-primary">ЗАБРОНИРОВАНЫЕ БИЛЕТЫ НУЖНО ВЫКУПИТЬ В КАССЕ НЕ ПОЗДНЕЕ НАЧАЛА ФИЛЬМА</h2>
                    </div>
                    <hr class="my-2">
                    <div class="row pt-3 pb-5 mb-2">
                        <div class="col-sm-6 mb-3"><a class="btn btn-style-1 btn-secondary btn-block" href="#"><i class="fe-icon-refresh-ccw"></i>&nbsp;Забронировать</a></div>
                        <div class="col-sm-6 mb-3"><a class="btn btn-style-1 btn-primary btn-block" href="#"><i class="fe-icon-credit-card"></i>&nbsp;Купить</a></div>
                    </div>

                </div>
            </div>
                </div>
            </div>
        </div>
    </div>
</@u.pageUser>