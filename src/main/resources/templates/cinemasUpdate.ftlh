<#import "parts/common.ftlh" as c>

<@c.page>
    <form action="/cinemas" method="post" enctype="multipart/form-data">
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
                                            <input type="text" name="nameCinema"
                                                   class="form-control ${(nameCinemaError??)?string('is-invalid', '')}"
                                                   value="<#if cinemas??>${cinemas.nameCinema}</#if>"
                                                   placeholder="Введите название ..." />
                                            <#if nameCinemaError??>
                                                <div class="invalid-feedback">
                                                    ${nameCinemaError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Описание : </label>
                                        <div class="col-sm-6">
                                            <textarea rows="5" type="text" name="descriptionCinema" class="form-control ${(descriptionCinemaError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if cinemas??>${cinemas.descriptionCinema}</#if></textarea>
                                            <#if descriptionCinemaError??>
                                                <div class="invalid-feedback">
                                                    ${descriptionCinemaError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Условия : </label>
                                        <div class="col-sm-6">
                                            <textarea rows="5" type="text" name="conditionsCinema" class="form-control ${(conditionsCinemaError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if cinemas??>${cinemas.conditionsCinema}</#if></textarea>
                                            <#if conditionsCinemaError??>
                                                <div class="invalid-feedback">
                                                    ${conditionsCinemaError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Logo : </label>
                                        <div class="custom-file">
                                            <input type="file" class="form-control" id="logo" name="logoPicture">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Banner : </label>
                                        <div class="custom-file">
                                            <input type="file" class="form-control" id="topBanner" name="top">
                                        </div>
                                    </div>
                                    <h5>Галерея картинок</h5>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryOne">Первая картинка</label>
                                        <input type="file" class="form-control" name="galleryOne" id="pictureGalleryOne">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryTwo">Вторая картинка</label>
                                        <input type="file" class="form-control" name="galleryTwo" id="pictureGalleryTwo">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryThree">Третья картинка</label>
                                        <input type="file" class="form-control" name="galleryThree" id="pictureGalleryThree">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryFour">Четвертая картинка</label>
                                        <input type="file" class="form-control" name="galleryFour" id="pictureGalleryFour">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureGalleryFive">Пятая картинка</label>
                                        <input type="file" class="form-control" name="galleryFive" id="pictureGalleryFive">
                                    </div>
                                    <input type="hidden" value="${cinemas.id}" name="cinemasId">
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