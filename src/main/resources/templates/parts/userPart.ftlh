<#macro pageUser>
    <!DOCTYPE html>
    <!--
    This is a starter template page. Use this page to start your new project from
    scratch. This page gets rid of all links and provides the needed markup only.
    -->
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>KinoCMS</title>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome Icons -->
        <link rel="stylesheet" href="/plugins/fontawesome-free/css/all.min.css" />

        <link rel="stylesheet" href="/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css" />
        <!-- iCheck -->
        <link rel="stylesheet" href="/plugins/icheck-bootstrap/icheck-bootstrap.min.css" />
        <!-- JQVMap -->
        <link rel="stylesheet" href="/plugins/jqvmap/jqvmap.min.css" />
        <!-- Theme style -->
        <link rel="stylesheet" href="/plugins/css/adminlte.min.css" />
        <!-- overlayScrollbars -->
        <link rel="stylesheet" href="/plugins/overlayScrollbars/css/OverlayScrollbars.min.css" />
        <!-- Daterange picker -->
        <link rel="stylesheet" href="/plugins/daterangepicker/daterangepicker.css" />
        <!-- summernote -->
        <link rel="stylesheet" href="/plugins/summernote/summernote-bs4.min.css" />

        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" />
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="/plugins/css/userPart.css" />

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/css/all.min.css" integrity="sha256-2XFplPlrFClt0bIdPgpz8H7ojnk10H69xRqd9+uTShA=" crossorigin="anonymous" />
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/ti-icons@0.1.2/css/themify-icons.css">
    </head>
    <#list mainImageBanners as mainImageBanner>
    <#if !(mainImageBanner?has_next)>
    <body class="hold-transition" background="/img/${mainImageBanner.pictureBanner!"null or missing"}">
    </#if>
    </#list>
    <div class="wrapper">
        <img src="/plugins/img/kinobanner.png" width="100%"
             height="90">

        <!-- Navbar -->
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light mt-1"  style="background-color: white;">
                <a href="/userPartMain">
                    <img src="/plugins/img/logo.png" width="100" height="70">
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Переключатель навигации">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="/userPoster">Афиша</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/userTimeTable">Расписание</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/userPosterSoon">Скоро</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/userCinemas">Кинотеатры</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/userShares">Акции</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                О кинотеатре
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="/userNews">Новости</a>
                                <#list pagePages as pagePages>
                                    <#if (pagePages.onOf = true)>
                                    <a class="dropdown-item" href="/pagePages/edit/${pagePages.id}">${pagePages.namePage!" "}</a>
                                        <#else>

                                    </#if>
                                </#list>
                                    <a class="dropdown-item" href="/getContactPage">Контакты</a>
                            </div>
                        </li>
                    </ul>
                    <div class="text mr-5">
                        <#list mainPage as mainPage>
                            <#if !(mainPage?has_next)>
                                <h4 class="text"><span>${mainPage.numberOne}</span></h4>
                                <h4 class="text"><span>${mainPage.numberTwo}</span></h4>
                            </#if>
                        </#list>
                    </div>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Поиск" aria-label="Поиск">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Поиск</button>
                    </form>
                </div>
            </nav>
        </div>
        <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
    <!-- Content Wrapper. Contains page content -->
<#--    <div class="content-wrapper">-->
        <div class="container" style="background-color: #e3f2fd;">
            <#nested>
        </div>
<#--    </div>-->
    <!-- /.content-wrapper -->

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
        <div class="p-3">
            <h5>Title</h5>
            <p>Sidebar content</p>
        </div>
    </aside>
    <!-- /.control-sidebar -->
    <div class="container">
    <footer class="footer_area section_padding_130_0" style="background-color: white;">
        <div class="container">
            <div class="row">
                <!-- Single Widget-->
                <div class="col-12 col-sm-6 col-lg-4">
                    <div class="single-footer-widget section_padding_0_130">
                        <!-- Footer Logo-->
                        <div class="footer-logo mb-3"></div>
                        <p>Мобильные приложения</p>
                        <!-- Copywrite Text-->
                        <div class="copywrite-text mb-5">
                            <p class="mb-0">Made with <i class="lni-heart mr-1"></i>by<a class="ml-1" href="#">AVADA MEDIA</a></p>
                        </div>
                        <!-- Footer Social Area-->
                        <div class="footer_social_area">
                            <ul class="social-icon-style2 ps-0">
                                <li><a href="#!" class="rounded-3"><i class="fab fa-facebook-f"></i></a></li>
                                <li><a href="#!" class="rounded-3"><i class="fab fa-twitter"></i></a></li>
                                <li><a href="#!" class="rounded-3"><i class="fab fa-youtube"></i></a></li>
                                <li><a href="#!" class="rounded-3"><i class="fab fa-linkedin-in"></i></a></li>
                            </ul></div>
                    </div>
                </div>
                <!-- Single Widget-->
                <div class="col-12 col-sm-6 col-lg">
                    <div class="single-footer-widget section_padding_0_130">
                        <!-- Widget Title-->
                        <h5 class="widget-title">Афиша</h5>
                        <!-- Footer Menu-->
                        <div class="footer_menu">
                            <ul>
                                <li><a href="/userTimeTable">Расписание</a></li>
                                <li><a href="/userPosterSoon">Скоро в прокате</a></li>
                                <li><a href="/userCinemas">Кинотеатры</a></li>
                                <li><a href="/userShares">Акции</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- Single Widget-->
                <div class="col-12 col-sm-6 col-lg">
                    <div class="single-footer-widget section_padding_0_130">
                        <!-- Widget Title-->
                        <h5 class="widget-title">О кинотеатре</h5>
                        <!-- Footer Menu-->
                        <div class="footer_menu">
                            <ul>
                                <li><a href="/userNews">Новости</a></li>
                                <#list pagePages as pagePages>
                                    <#if (pagePages.onOf = true)>
                                    <li><a href="/pagePages/edit/${pagePages.id}">${pagePages.namePage!" "}</a></li>
                                        <#else>

                                    </#if>
                                </#list>
                                    <li><a href="/getContactPage">Контакты</a></li>

                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    </div>
    </div>
    </body>

    <!-- jQuery -->
    <script src="/plugins/jquery/jquery.min.js"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="/plugins/jquery-ui/jquery-ui.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>




    <#--    </body>-->
    </html>
</#macro>