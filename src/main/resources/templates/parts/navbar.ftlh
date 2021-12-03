<#--<#include "security.ftlh">-->
<#--<#import "login.ftlh" as l>-->



<#--&lt;#&ndash;<header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">&ndash;&gt;-->
<#--&lt;#&ndash;    <div class="container-fluid me-auto mb-2 mb-lg-0">&ndash;&gt;-->
<#--&lt;#&ndash;        <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3" href="/">KinoCMS</a>&ndash;&gt;-->
<#--&lt;#&ndash;        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">&ndash;&gt;-->
<#--&lt;#&ndash;            <span class="navbar-toggler-icon"></span>&ndash;&gt;-->
<#--&lt;#&ndash;        </button>&ndash;&gt;-->
<#--&lt;#&ndash;        <div class="navbar-nav d-flex">&ndash;&gt;-->
<#--&lt;#&ndash;        <div class="nav-item" id="navbarSupportedContent">&ndash;&gt;-->
<#--&lt;#&ndash;            <ul class="navbar-nav me-auto mb-2 mb-lg-0">&ndash;&gt;-->
<#--&lt;#&ndash;                <div class="navbar-text me-3">${name}</div>&ndash;&gt;-->
<#--&lt;#&ndash;                <@l.logout />&ndash;&gt;-->
<#--&lt;#&ndash;            </ul>&ndash;&gt;-->

<#--&lt;#&ndash;        </div>&ndash;&gt;-->
<#--&lt;#&ndash;        </div>&ndash;&gt;-->
<#--&lt;#&ndash;    </div>&ndash;&gt;-->
<#--&lt;#&ndash;</header>&ndash;&gt;-->

<#--&lt;#&ndash;<div class="container-fluid">&ndash;&gt;-->
<#--&lt;#&ndash;    <div class="row">&ndash;&gt;-->

<#--&lt;#&ndash;        <ul class="nav flex-column me-auto mb-2 mb-lg-0">&ndash;&gt;-->
<#--&lt;#&ndash;            <li class="nav-item">&ndash;&gt;-->
<#--&lt;#&ndash;                <a class="nav-link active" aria-current="page" href="/">Home</a>&ndash;&gt;-->
<#--&lt;#&ndash;            </li>&ndash;&gt;-->
<#--&lt;#&ndash;            <li class="nav-item">&ndash;&gt;-->
<#--&lt;#&ndash;                <a class="nav-link active" aria-current="page" href="/main">Films</a>&ndash;&gt;-->
<#--&lt;#&ndash;            </li>&ndash;&gt;-->
<#--&lt;#&ndash;            <#if isAdmin>&ndash;&gt;-->
<#--&lt;#&ndash;                <li class="nav-item">&ndash;&gt;-->
<#--&lt;#&ndash;                    <a class="nav-link active" aria-current="page" href="/user">User list</a>&ndash;&gt;-->
<#--&lt;#&ndash;                </li>&ndash;&gt;-->
<#--&lt;#&ndash;            </#if>&ndash;&gt;-->
<#--&lt;#&ndash;        </ul>&ndash;&gt;-->


<#--&lt;#&ndash;</div>&ndash;&gt;-->
<#--&lt;#&ndash;</div>&ndash;&gt;-->

<#--<div class="wrapper">-->

<#--    <!-- Navbar &ndash;&gt;-->
<#--    <nav class="main-header navbar navbar-expand navbar-white navbar-light">-->
<#--        <!-- Left navbar links &ndash;&gt;-->
<#--        <ul class="navbar-nav">-->
<#--            <li class="nav-item">-->
<#--                <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>-->
<#--            </li>-->
<#--        </ul>-->

<#--        <!-- Right navbar links &ndash;&gt;-->
<#--        <ul class="navbar-nav ml-auto">-->
<#--            <li class="nav-item">-->
<#--                <div class="navbar-text me-3">${name}</div>-->
<#--                <@l.logout />-->
<#--            </li>-->
<#--        </ul>-->
<#--    </nav>-->
<#--    <!-- /.navbar &ndash;&gt;-->

<#--    <!-- Main Sidebar Container &ndash;&gt;-->
<#--    <aside class="main-sidebar sidebar-dark-primary elevation-4">-->
<#--        <!-- Brand Logo &ndash;&gt;-->
<#--        <a href="index3.html" class="brand-link">-->
<#--            <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">-->
<#--            <span class="brand-text font-weight-light">KinoCMS</span>-->
<#--        </a>-->

<#--        <!-- Sidebar &ndash;&gt;-->
<#--        <div class="sidebar">-->
<#--            <!-- Sidebar user panel (optional) &ndash;&gt;-->
<#--            <div class="user-panel mt-3 pb-3 mb-3 d-flex">-->
<#--                <div class="image">-->
<#--                    <img src="dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">-->
<#--                </div>-->
<#--                <div class="info">-->
<#--                    <a href="#" class="d-block">Alexander Pierce</a>-->
<#--                </div>-->
<#--            </div>-->

<#--            <!-- SidebarSearch Form &ndash;&gt;-->
<#--            <div class="form-inline">-->
<#--                <div class="input-group" data-widget="sidebar-search">-->
<#--                    <input class="form-control form-control-sidebar" type="search" placeholder="Search" aria-label="Search">-->
<#--                    <div class="input-group-append">-->
<#--                        <button class="btn btn-sidebar">-->
<#--                            <i class="fas fa-search fa-fw"></i>-->
<#--                        </button>-->
<#--                    </div>-->
<#--                </div>-->
<#--            </div>-->

<#--            <!-- Sidebar Menu &ndash;&gt;-->
<#--            <nav class="mt-2">-->
<#--                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">-->
<#--                    <!-- Add icons to the links using the .nav-icon class-->
<#--                         with font-awesome or any other icon font library &ndash;&gt;-->
<#--                    <li class="nav-item menu-open">-->
<#--                        <a href="#" class="nav-link active">-->
<#--                            <i class="nav-icon fas fa-tachometer-alt"></i>-->
<#--                            <p>-->
<#--                                Starter Pages-->
<#--                                <i class="right fas fa-angle-left"></i>-->
<#--                            </p>-->
<#--                        </a>-->
<#--                        <ul class="nav nav-treeview">-->
<#--                            <li class="nav-item">-->
<#--                                <a href="#" class="nav-link active">-->
<#--                                    <i class="far fa-circle nav-icon"></i>-->
<#--                                    <p>Active Page</p>-->
<#--                                </a>-->
<#--                            </li>-->
<#--                            <li class="nav-item">-->
<#--                                <a href="#" class="nav-link">-->
<#--                                    <i class="far fa-circle nav-icon"></i>-->
<#--                                    <p>Inactive Page</p>-->
<#--                                </a>-->
<#--                            </li>-->
<#--                        </ul>-->
<#--                    </li>-->
<#--                    <li class="nav-item">-->
<#--                        <a href="#" class="nav-link">-->
<#--                            <i class="nav-icon fas fa-th"></i>-->
<#--                            <p>-->
<#--                                Simple Link-->
<#--                                <span class="right badge badge-danger">New</span>-->
<#--                            </p>-->
<#--                        </a>-->
<#--                    </li>-->
<#--                </ul>-->
<#--            </nav>-->
<#--            <!-- /.sidebar-menu &ndash;&gt;-->
<#--        </div>-->
<#--        <!-- /.sidebar &ndash;&gt;-->
<#--    </aside>-->

<#--    <!-- Content Wrapper. Contains page content &ndash;&gt;-->
<#--    <div class="content-wrapper">-->
<#--        <!-- Content Header (Page header) &ndash;&gt;-->
<#--        <div class="content-header">-->
<#--            <div class="container-fluid">-->
<#--                <div class="row mb-2">-->
<#--                    <div class="col-sm-6">-->
<#--                        <h1 class="m-0">Starter Page</h1>-->
<#--                    </div><!-- /.col &ndash;&gt;-->
<#--                    <div class="col-sm-6">-->
<#--                        <ol class="breadcrumb float-sm-right">-->
<#--                            <li class="breadcrumb-item"><a href="#">Home</a></li>-->
<#--                            <li class="breadcrumb-item active">Starter Page</li>-->
<#--                        </ol>-->
<#--                    </div><!-- /.col &ndash;&gt;-->
<#--                </div><!-- /.row &ndash;&gt;-->
<#--            </div><!-- /.container-fluid &ndash;&gt;-->
<#--        </div>-->
<#--        <!-- /.content-header &ndash;&gt;-->


<#--&lt;#&ndash;        <!-- Main content &ndash;&gt;&ndash;&gt;-->
<#--&lt;#&ndash;        <div class="content">&ndash;&gt;-->
<#--&lt;#&ndash;            <div class="container-fluid">&ndash;&gt;-->
<#--&lt;#&ndash;                <div class="row">&ndash;&gt;-->
<#--&lt;#&ndash;                    <div class="col-lg-6">&ndash;&gt;-->
<#--&lt;#&ndash;                        <div class="card">&ndash;&gt;-->
<#--&lt;#&ndash;                            <div class="card-body">&ndash;&gt;-->
<#--&lt;#&ndash;                                <h5 class="card-title">Card title</h5>&ndash;&gt;-->

<#--&lt;#&ndash;                                <p class="card-text">&ndash;&gt;-->
<#--&lt;#&ndash;                                    Some quick example text to build on the card title and make up the bulk of the card's&ndash;&gt;-->
<#--&lt;#&ndash;                                    content.&ndash;&gt;-->
<#--&lt;#&ndash;                                </p>&ndash;&gt;-->

<#--&lt;#&ndash;                                <a href="#" class="card-link">Card link</a>&ndash;&gt;-->
<#--&lt;#&ndash;                                <a href="#" class="card-link">Another link</a>&ndash;&gt;-->
<#--&lt;#&ndash;                            </div>&ndash;&gt;-->
<#--&lt;#&ndash;                        </div>&ndash;&gt;-->

<#--&lt;#&ndash;                        <div class="card card-primary card-outline">&ndash;&gt;-->
<#--&lt;#&ndash;                            <div class="card-body">&ndash;&gt;-->
<#--&lt;#&ndash;                                <h5 class="card-title">Card title</h5>&ndash;&gt;-->

<#--&lt;#&ndash;                                <p class="card-text">&ndash;&gt;-->
<#--&lt;#&ndash;                                    Some quick example text to build on the card title and make up the bulk of the card's&ndash;&gt;-->
<#--&lt;#&ndash;                                    content.&ndash;&gt;-->
<#--&lt;#&ndash;                                </p>&ndash;&gt;-->
<#--&lt;#&ndash;                                <a href="#" class="card-link">Card link</a>&ndash;&gt;-->
<#--&lt;#&ndash;                                <a href="#" class="card-link">Another link</a>&ndash;&gt;-->
<#--&lt;#&ndash;                            </div>&ndash;&gt;-->
<#--&lt;#&ndash;                        </div><!-- /.card &ndash;&gt;&ndash;&gt;-->
<#--&lt;#&ndash;                    </div>&ndash;&gt;-->
<#--&lt;#&ndash;                    <!-- /.col-md-6 &ndash;&gt;&ndash;&gt;-->
<#--&lt;#&ndash;                    <div class="col-lg-6">&ndash;&gt;-->
<#--&lt;#&ndash;                        <div class="card">&ndash;&gt;-->
<#--&lt;#&ndash;                            <div class="card-header">&ndash;&gt;-->
<#--&lt;#&ndash;                                <h5 class="m-0">Featured</h5>&ndash;&gt;-->
<#--&lt;#&ndash;                            </div>&ndash;&gt;-->
<#--&lt;#&ndash;                            <div class="card-body">&ndash;&gt;-->
<#--&lt;#&ndash;                                <h6 class="card-title">Special title treatment</h6>&ndash;&gt;-->

<#--&lt;#&ndash;                                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>&ndash;&gt;-->
<#--&lt;#&ndash;                                <a href="#" class="btn btn-primary">Go somewhere</a>&ndash;&gt;-->
<#--&lt;#&ndash;                            </div>&ndash;&gt;-->
<#--&lt;#&ndash;                        </div>&ndash;&gt;-->

<#--&lt;#&ndash;                        <div class="card card-primary card-outline">&ndash;&gt;-->
<#--&lt;#&ndash;                            <div class="card-header">&ndash;&gt;-->
<#--&lt;#&ndash;                                <h5 class="m-0">Featured</h5>&ndash;&gt;-->
<#--&lt;#&ndash;                            </div>&ndash;&gt;-->
<#--&lt;#&ndash;                            <div class="card-body">&ndash;&gt;-->
<#--&lt;#&ndash;                                <h6 class="card-title">Special title treatment</h6>&ndash;&gt;-->

<#--&lt;#&ndash;                                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>&ndash;&gt;-->
<#--&lt;#&ndash;                                <a href="#" class="btn btn-primary">Go somewhere</a>&ndash;&gt;-->
<#--&lt;#&ndash;                            </div>&ndash;&gt;-->
<#--&lt;#&ndash;                        </div>&ndash;&gt;-->
<#--&lt;#&ndash;                    </div>&ndash;&gt;-->
<#--&lt;#&ndash;                    <!-- /.col-md-6 &ndash;&gt;&ndash;&gt;-->
<#--&lt;#&ndash;                </div>&ndash;&gt;-->
<#--&lt;#&ndash;                <!-- /.row &ndash;&gt;&ndash;&gt;-->
<#--&lt;#&ndash;            </div><!-- /.container-fluid &ndash;&gt;&ndash;&gt;-->
<#--&lt;#&ndash;        </div>&ndash;&gt;-->
<#--&lt;#&ndash;        <!-- /.content &ndash;&gt;&ndash;&gt;-->
<#--    </div>-->
<#--    <!-- /.content-wrapper &ndash;&gt;-->

<#--    <!-- Control Sidebar &ndash;&gt;-->
<#--    <aside class="control-sidebar control-sidebar-dark">-->
<#--        <!-- Control sidebar content goes here &ndash;&gt;-->
<#--        <div class="p-3">-->
<#--            <h5>Title</h5>-->
<#--            <p>Sidebar content</p>-->
<#--        </div>-->
<#--    </aside>-->
<#--    <!-- /.control-sidebar &ndash;&gt;-->

<#--&lt;#&ndash;    <!-- Main Footer &ndash;&gt;&ndash;&gt;-->
<#--&lt;#&ndash;    <footer class="main-footer">&ndash;&gt;-->
<#--&lt;#&ndash;        <!-- To the right &ndash;&gt;&ndash;&gt;-->
<#--&lt;#&ndash;        <div class="float-right d-none d-sm-inline">&ndash;&gt;-->
<#--&lt;#&ndash;            Anything you want&ndash;&gt;-->
<#--&lt;#&ndash;        </div>&ndash;&gt;-->
<#--&lt;#&ndash;        <!-- Default to the left &ndash;&gt;&ndash;&gt;-->
<#--&lt;#&ndash;        <strong>Copyright &copy; 2014-2021 <a href="https://adminlte.io">AdminLTE.io</a>.</strong> All rights reserved.&ndash;&gt;-->
<#--&lt;#&ndash;    </footer>&ndash;&gt;-->
<#--</div>-->
<#--<!-- ./wrapper &ndash;&gt;-->