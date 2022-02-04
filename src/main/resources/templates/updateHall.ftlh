<#import "parts/common.ftlh" as c>

<@c.page>
    <form action="/hall" method="post" enctype="multipart/form-data">
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
                                        <label class="col-sm-2 col-form-label"> Название : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="hallNumber"
                                                   class="form-control ${(hallNumberError??)?string('is-invalid', '')}"
                                                   value="<#if hall??>${hall.hallNumber}</#if>"
                                                   placeholder="Введите название ..." />
                                            <#if hallNumberError??>
                                                <div class="invalid-feedback">
                                                    ${hallNumberError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Описание : </label>
                                        <div class="col-sm-6">
                                            <textarea rows="5" type="text" name="hallDescription" class="form-control ${(hallDescriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if hall??>${hall.hallDescription}</#if></textarea>
                                            <#if hallDescriptionError??>
                                                <div class="invalid-feedback">
                                                    ${hallDescriptionError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Дата публикации : </label>
                                        <div class="col-sm-6">
                                            <input type="date" name="dateCreation"
                                                   class="form-control ${(dateCreationError??)?string('is-invalid', '')}"
                                                   placeholder="Введите название ..." />
                                            <#if dateCreationError??>
                                                <div class="invalid-feedback">
                                                    ${dateCreationError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Схема зала : </label>
                                        <div class="custom-file">
                                            <input type="file" class="form-control" id="hallLayout" name="layout">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Верхний банер : </label>
                                        <div class="custom-file">
                                            <input type="file" class="form-control" id="topBanner" name="top">
                                        </div>
                                    </div>
                                    <h5>Галерея картинок</h5>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureHallGalleryOne">Первая картинка</label>
                                        <input type="file" class="form-control" name="galleryOne" id="pictureHallGalleryOne">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureHallGalleryTwo">Вторая картинка</label>
                                        <input type="file" class="form-control" name="galleryTwo" id="pictureHallGalleryTwo">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureHallGalleryThree">Третья картинка</label>
                                        <input type="file" class="form-control" name="galleryThree" id="pictureHallGalleryThree">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureHallGalleryFour">Четвертая картинка</label>
                                        <input type="file" class="form-control" name="galleryFour" id="pictureHallGalleryFour">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureHallGalleryFive">Пятая картинка</label>
                                        <input type="file" class="form-control" name="galleryFive" id="pictureHallGalleryFive">
                                    </div>
                                    <input type="hidden" value="${hall.id}" name="hallId">
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