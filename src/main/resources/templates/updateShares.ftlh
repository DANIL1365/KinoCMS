<#import "parts/common.ftlh" as c>

<@c.page>
    <form action="/shares" method="post" enctype="multipart/form-data">
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
                                            <input type="text" name="nameShares"
                                                   class="form-control ${(nameSharesError??)?string('is-invalid', '')}"
                                                   value="<#if shares??>${shares.nameShares}</#if>"
                                                   placeholder="Введите название ..." />
                                            <#if nameSharesError??>
                                                <div class="invalid-feedback">
                                                    ${nameSharesError}
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
                                            <textarea rows="5" type="text" name="description" class="form-control ${(descriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if shares??>${shares.description}</#if></textarea>
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
                                                   value="<#if shares??>${shares.videoLink}</#if>"
                                                   placeholder="Введите ссылку ..." />
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
                                            <input type="file" class="form-control" id="mainSharesPicture" name="mainPicture">
                                        </div>
                                    </div>
                                    <h5>Галерея картинок</h5>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureSharesGalleryOne">Первая картинка</label>
                                        <input type="file" class="form-control" name="galleryOne" id="pictureSharesGalleryOne">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureSharesGalleryTwo">Вторая картинка</label>
                                        <input type="file" class="form-control" name="galleryTwo" id="pictureSharesGalleryTwo">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureSharesGalleryThree">Третья картинка</label>
                                        <input type="file" class="form-control" name="galleryThree" id="pictureSharesGalleryThree">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureSharesGalleryFour">Четвертая картинка</label>
                                        <input type="file" class="form-control" name="galleryFour" id="pictureSharesGalleryFour">
                                    </div>
                                    <div class="form-group row">
                                        <label class="form-label" for="pictureSharesGalleryFive">Пятая картинка</label>
                                        <input type="file" class="form-control" name="galleryFive" id="pictureSharesGalleryFive">
                                    </div>
                                    <input type="hidden" value="${shares.id}" name="sharesId">
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