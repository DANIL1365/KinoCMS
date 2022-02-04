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
                                <i class="fa fa-calendar-o"></i> <a href="#">${pagePagesUser.dateCreation}</a>
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
                    <h4 class="sidebar-title">Новости</h4>
                    <ul class="list-unstyled">
                        <li class="media">
                            <#list newsUser as news>
                            <#if news.mainNewsPicture??>
                            <img class="d-flex mr-3 img-fluid" width="64" src="/img/${news.mainNewsPicture}" alt="Generic placeholder image">
                            </#if>
                            <div class="media-body">
                                <h5 class="mt-0 mb-1"><a href="/news/edit/${news.id}">${news.nameNews}</a></h5> ${news.publicationDate}
                            </div>
                            </#list>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</@u.pageUser>