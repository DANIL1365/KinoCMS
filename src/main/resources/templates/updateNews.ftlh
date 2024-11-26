<#import "parts/common.ftlh" as c>
//
<@c.page>
    <form action="/news" method="post" enctype="multipart/form-data">
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
                                            <input type="text" name="nameNews"
                                                   class="form-control ${(nameNewsError??)?string('is-invalid', '')}"
                                                   value="<#if news??>${news.nameNews}</#if>"
                                                   placeholder="Введите название ..." />
                                            <#if nameNewsError??>
                                                <div class="invalid-feedback">
                                                    ${nameNewsError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Дата публикации : </label>
                                        <div class="col-sm-6">
                                            <input type="date" name="publicationDate"
                                                   class="form-control ${(publicationDateError??)?string('is-invalid', '')}"
                                                    <#--                       value="<#if newsAdd??>${newsAdd.namePage}</#if>"-->
                                                   placeholder="Введите название ..." />
                                            <#if publicationDateError??>
                                                <div class="invalid-feedback">
                                                    ${publicationDateError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Описание : </label>
                                        <div class="col-sm-6">
                                            <textarea rows="5" type="text" name="description" class="form-control ${(descriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if news??>${news.description}</#if></textarea>
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
                                            <input type="text" name="videoLink"
                                                   class="form-control ${(videoLinkError??)?string('is-invalid', '')}"
                                                   value="<#if news??>${news.videoLink}</#if>"
                                                   placeholder="Введите название ..." />
                                            <#if videoLinkError??>
                                                <div class="invalid-feedback">
                                                    ${videoLinkError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Главная картинка : </label>
                                        <div class="custom-file">
                                            <input type="file" class="form-control" id="mainNewsPicture" name="mainPicture">
                                        </div>
                                    </div>
                                    <h5>Галерея картинок</h5>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureNewsGalleryOne">Первая картинка</label>
                                        <input type="file" class="form-control" name="galleryOne" id="pictureNewsGalleryOne">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureNewsGalleryTwo">Вторая картинка</label>
                                        <input type="file" class="form-control" name="galleryTwo" id="pictureNewsGalleryTwo">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureNewsGalleryThree">Третья картинка</label>
                                        <input type="file" class="form-control" name="galleryThree" id="pictureNewsGalleryThree">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureNewsGalleryFour">Четвертая картинка</label>
                                        <input type="file" class="form-control" name="galleryFour" id="pictureNewsGalleryFour">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureNewsGalleryFive">Пятая картинка</label>
                                        <input type="file" class="form-control" name="galleryFive" id="pictureNewsGalleryFive">
                                    </div>
                                    <input type="hidden" value="${news.id}" name="newsId">
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