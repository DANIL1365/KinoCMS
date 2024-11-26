<#import "parts/common.ftlh" as c>
//
<@c.page>
    <form action="/soonFilms" method="post" enctype="multipart/form-data">
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
                                            <input type="text" name="nameSoonCinema"
                                                   class="form-control ${(nameSoonCinemaError??)?string('is-invalid', '')}"
                                                   value="<#if soonFilms??>${soonFilms.nameSoonCinema}</#if>"
                                                   placeholder="Введите название ..." />
                                            <#if nameSoonCinemaError??>
                                                <div class="invalid-feedback">
                                                    ${nameSoonCinemaError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Описание : </label>
                                        <div class="col-sm-6">
                                            <textarea rows="5" type="text" name="description" class="form-control ${(descriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if soonFilms??>${soonFilms.description}</#if></textarea>
                                            <#if descriptionError??>
                                                <div class="invalid-feedback">
                                                    ${descriptionError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Ссылка : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="trailerLink"
                                                   class="form-control ${(trailerLinkError??)?string('is-invalid', '')}"
                                                   value="<#if soonFilms??>${soonFilms.trailerLink}</#if>"
                                                   placeholder="Введите название ..." />
                                            <#if trailerLinkError??>
                                                <div class="invalid-feedback">
                                                    ${trailerLinkError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Тип фильма : </label>
                                        <div class="col-sm-6">
                                            <select class="form-control select2 ${(typeCinemaError??)?string('is-invalid', '')}"
                                                    name="typeCinema" style="width: 100%;"
                                                    value="<#if soonFilms??>${soonFilms.typeCinema}</#if>" />
                                            <option selected="selected"></option>
                                            <option>2D</option>
                                            <option>3D</option>
                                            <option>IMAX</option>
                                            </select>
                                            <#if typeCinemaError??>
                                                <div class="invalid-feedback">
                                                    ${typeCinemaError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Главная картинка : </label>
                                        <div class="custom-file">
                                            <input type="file" class="form-control" id="mainSoonPicture" name="mainPicture">
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
                                    <input type="hidden" value="${soonFilms.id}" name="soonId">
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