<#import "parts/common.ftlh" as c>

<@c.page>
    <form action="/news" method="post">
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
                            <div class="form-group mt-3">
                                <div class="form-group mt-2 ">
                                    <label class="form-label" for="nameNews">Название новости</label>
                                    <input type="text" id="nameNews" name="nameNews" class="form-control" placeholder="Введите название новости" />
                                </div>
                                <div class="form-group mt-2">
                                    <label class="form-label" for="publicationDate">Дата публикации</label>
                                    <input type="date" id="publicationDate" name="publicationDate" class="form-control" placeholder="Введите дату публикации" />
                                </div>
                                <div class="form-group mt-2">
                                    <label class="form-label" for="description">Описание</label>
                                    <input type="text" id="description" name="description" class="form-control" placeholder="Введите описание" />
                                </div>
                                <div class="form-group mt-2">
                                    <div class="custom-file">
                                        <label class="form-label" for="mainNewsPicture">Главная картинка</label>
                                        <input type="file" class="form-control" id="mainNewsPicture" name="mainNewsPicture">
                                    </div>
                                </div>
                                <h5>Галерея картинок</h5>
                                <div class="form-group mt-2">
                                    <div class="mb-3">
                                        <label class="form-label" for="pictureNewsGalleryOne">Первая картинка</label>
                                        <input type="file" class="form-control" name="pictureNewsGalleryOne" id="pictureNewsGalleryOne">
                                    </div>
                                </div>
                                <div class="form-group mt-2">
                                    <div class="mb-3">
                                        <label class="form-label" for="pictureNewsGalleryTwo">Вторая картинка</label>
                                        <input type="file" class="form-control" name="pictureNewsGalleryTwo" id="pictureNewsGalleryTwo">
                                    </div>
                                </div>
                                <div class="form-group mt-2">
                                    <div class="mb-3">
                                        <label class="form-label" for="pictureNewsGalleryThree">Третья картинка</label>
                                        <input type="file" class="form-control" name="pictureNewsGalleryThree" id="pictureNewsGalleryThree">
                                    </div>
                                </div>
                                <div class="form-group mt-2">
                                    <div class="mb-3">
                                        <label class="form-label" for="pictureNewsGalleryFour">Четвертая картинка</label>
                                        <input type="file" class="form-control" name="pictureNewsGalleryFour" id="pictureNewsGalleryFour">
                                    </div>
                                </div>
                                <div class="form-group mt-2">
                                    <div class="mb-3">
                                        <label class="form-label" for="pictureNewsGalleryFive">Пятая картинка</label>
                                        <input type="file" class="form-control" name="pictureNewsGalleryFive" id="pictureNewsGalleryFive">
                                    </div>
                                </div>
                                <div class="form-group mt-2 ">
                                    <label class="form-label" for="videoLink">Ссылка на видео</label>
                                    <input type="text" id="videoLink" name="videoLink" class="form-control" placeholder="Ссылка на видео Youtube" />
                                </div>
                            </div>
                                    <#--    <div class="form-group row">-->
                                    <#--        <label class="col-sm-2 col-form-label"> User Date Birth : </label>-->
                                    <#--        <div class="col-sm-6">-->
                                    <#--            <input type="date" name="dateBirth" class="form-control" placeholder="User Date Birth" />-->
                                    <#--        </div>-->
                                    <#--    </div>-->

                                    <input type="hidden" value="${news.id}" name="newsId">
                                    <input type="hidden" name="_csrf" value="${_csrf.token}" />
                                    <button type="submit" class="btn btn-primary">Save</button>
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