<#import "parts/userPart.ftlh" as u>

<@u.pageUser>
    <div class="container pb50">
        <div class="row">
            <div class="col-md-9 mb40">
                <article>
                    <#if pagePagesUser.pagePicture??>
                    <img src="/img/${pagePagesUser.pagePicture}" alt="" class="img-fluid mb30">
                    </#if>
                    <div class="post-content">
                        <h3><span>${pagePagesUser.namePage}</span></h3>
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
                        <p>${pagePagesUser.description}</p>

                        <hr class="mb40">
                        <h4 class="mb40 text-uppercase font500">Галерея</h4>
                        <div class="media mb40">
                            <div class="cssSlider">
                                <ul class="slides">
                                    <li id="slide1"><img src="/img/${pagePagesUser.pictureGalleryOne}" alt="" /></li>
                                    <li id="slide2"><img src="/img/${pagePagesUser.pictureGalleryTwo}" alt="" /></li>
                                    <li id="slide3"><img src="/img/${pagePagesUser.pictureGalleryThree}" alt="" /></li>
                                    <li id="slide4"><img src="/img/${pagePagesUser.pictureGalleryFour}" alt="" /></li>
                                    <li id="slide5"><img src="/img/${pagePagesUser.pictureGalleryFive}" alt="" /></li>
                                </ul>
                                <ul class="thumbnails">
                                    <li><a href="#slide1"><img src="/img/${pagePagesUser.pictureGalleryOne}" /></a></li>
                                    <li><a href="#slide2"><img src="/img/${pagePagesUser.pictureGalleryTwo}" /></a></li>
                                    <li><a href="#slide3"><img src="/img/${pagePagesUser.pictureGalleryThree}" /></a></li>
                                    <li><a href="#slide4"><img src="/img/${pagePagesUser.pictureGalleryFour}" /></a></li>
                                    <li><a href="#slide5"><img src="/img/${pagePagesUser.pictureGalleryFive}" /></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </article>
                <!-- post article-->

            </div>
            <div class="col-md-3 mb40">
                <div>
                    <h4 class="sidebar-title">News</h4>
                    <ul class="list-unstyled">
                        <li class="media">
                            <img class="d-flex mr-3 img-fluid" width="64" src="https://bootdey.com/img/Content/avatar/avatar1.png" alt="Generic placeholder image">
                            <div class="media-body">
                                <h5 class="mt-0 mb-1"><a href="#">Lorem ipsum dolor sit amet</a></h5> April 05, 2017
                            </div>
                        </li>
                        <li class="media my-4">
                            <img class="d-flex mr-3 img-fluid" width="64" src="https://bootdey.com/img/Content/avatar/avatar2.png" alt="Generic placeholder image">
                            <div class="media-body">
                                <h5 class="mt-0 mb-1"><a href="#">Lorem ipsum dolor sit amet</a></h5> Jan 05, 2017
                            </div>
                        </li>
                        <li class="media">
                            <img class="d-flex mr-3 img-fluid" width="64" src="https://bootdey.com/img/Content/avatar/avatar3.png" alt="Generic placeholder image">
                            <div class="media-body">
                                <h5 class="mt-0 mb-1"><a href="#">Lorem ipsum dolor sit amet</a></h5> March 15, 2017
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</@u.pageUser>