<#import "parts/common.ftlh" as c>

<@c.page>
    <form action="/pagePages/updatePage" method="post" enctype="multipart/form-data">
        <section class="content">
            <div class="container-fluid">
                <div class="row">
                    <!-- left column -->
                    <div class="col-md-12">
                        <!-- jquery validation -->
                        <div class="card card-primary">
                            <div class="card-header">
                                <h3 class="card-title">Редактировать</h3>
                            </div>
                            <!-- /.card-header -->
                            <!-- form start -->
                            <form id="quickForm">
                                <div class="card-body">
                                    <div class="form-group row">
                                        <div class="form-group row">
                                            <!-- Rounded switch -->
                                            <label class="switch" for="onOf">
                                                <input type="checkbox" id="onOf" name="onOf" value="true" class="form-control">
                                                <span class="slider round">Вкл/Выкл</span>
                                            </label>
                                        </div>
                                        <label class="col-sm-2 col-form-label"> Название : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="namePage" class="form-control" placeholder="name Page" value="<#if pagePages??>${pagePages.namePage}</#if>" />
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Дата публикации : </label>
                                        <div class="col-sm-6">
                                            <input type="date" name="dateCreation" class="form-control" placeholder="Введите дату" />
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Описание : </label>
                                        <div class="col-sm-6">
                                            <textarea rows="5" type="text" name="description" class="form-control" placeholder="Введите описание"></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Главная картинка : </label>
                                        <div class="custom-file">
                                            <input type="file" class="form-control" id="pagePicture" name="pagePicture">
                                        </div>
                                    </div>
                                    <h5>Галерея картинок</h5>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryOne">Первая картинка</label>
                                        <input type="file" class="form-control" name="pictureGalleryOne" id="pictureGalleryOne">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryTwo">Вторая картинка</label>
                                        <input type="file" class="form-control" name="pictureGalleryTwo" id="pictureGalleryTwo">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryThree">Третья картинка</label>
                                        <input type="file" class="form-control" name="pictureGalleryThree" id="pictureGalleryThree">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryFour">Четвертая картинка</label>
                                        <input type="file" class="form-control" name="pictureGalleryFour" id="pictureGalleryFour">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryFive">Пятая картинка</label>
                                        <input type="file" class="form-control" name="pictureGalleryFive" id="pictureGalleryFive">
                                    </div>
                                    <input type="hidden" value="${pagePages.id}" name="pageId">
                                    <input type="hidden" name="_csrf" value="${_csrf.token}" />
                                    <div class="form-group mt-2">
                                        <button type="submit" class="btn btn-primary">Добавить</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <!-- /.card -->
                    </div>
                    <!--/.col (left) -->
                    <!-- right column -->
                    <div class="col-md-6">

                    </div>
                    <!--/.col (right) -->
                </div>
                <!-- /.row -->
            </div><!-- /.container-fluid -->
        </section>
        <!-- /.content -->
    </form>
</@c.page>