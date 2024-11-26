<#import "parts/common.ftlh" as c>
//
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
                                        <!-- Rounded switch -->
                                        <label class="col-sm-2 col-form-label"> Вкл/Выкл : </label>
                                        <label class="switch" for="onOf">
                                            <input type="checkbox" id="onOf" name="onOf"
                                            <#if (pagePages.onOf = true)> checked
                                                <#else>
                                                </#if> class="form-control">
                                            <span class="slider round"></span>
                                        </label>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Название : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="namePage"
                                                   class="form-control ${(namePageError??)?string('is-invalid', '')}"
                                                   value="<#if pagePages??>${pagePages.namePage}</#if>"
                                                   placeholder="Введите название ..." />
                                            <#if namePageError??>
                                                <div class="invalid-feedback">
                                                    ${namePageError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Дата публикации : </label>
                                        <div class="col-sm-6">
                                            <input type="date" name="dateCreation"
                                                   class="form-control ${(dateCreationError??)?string('is-invalid', '')}"
                                                    <#--                       value="<#if pagePages??>${pagePages.dateCreation}</#if>"-->
                                                   placeholder="Введите дату публикации" />
                                            <#if dateCreationError??>
                                                <div class="invalid-feedback">
                                                    ${dateCreationError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Описание : </label>
                                        <div class="col-sm-6">
                                            <textarea rows="5" type="text" name="description" class="form-control ${(descriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if pagePages??>${pagePages.description}</#if></textarea>
                                            <#if descriptionError??>
                                                <div class="invalid-feedback">
                                                    ${descriptionError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Главная картинка : </label>
                                        <div class="custom-file">
                                            <input type="file" class="form-control" id="pagePicture" name="main">
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