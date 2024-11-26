<#--<#import "parts/common.ftlh" as c>-->

<#--<@c.page>-->
<#--    <form action="/news" method="post">-->
<#--        <section class="content">-->
<#--            <div class="container-fluid">-->
<#--                <div class="row">-->
<#--                    <!-- left column &ndash;&gt;-->
<#--                    <div class="col-md-12">-->
<#--                        <!-- jquery validation &ndash;&gt;-->
<#--                        <div class="card card-primary">-->
<#--                            <div class="card-header">-->
<#--                                <h3 class="card-title">Редактировать</h3>-->
<#--                            </div>-->
<#--                            <!-- /.card-header &ndash;&gt;-->
<#--                            <!-- form start &ndash;&gt;-->
<#--                            <form id="quickForm">-->
<#--                                <div class="card-body">-->
<#--                            <div class="form-group mt-3">-->
<#--                                <div class="form-group mt-2 ">-->
<#--                                    <label class="form-label" for="nameNews">Название новости</label>-->
<#--                                    <input type="text" name="nameNews"-->
<#--                                           class="form-control ${(nameNewsError??)?string('is-invalid', '')}"-->
<#--                                           value="<#if news??>${news.nameNews}</#if>"-->
<#--                                           placeholder="Введите название ..." />-->
<#--                                    <#if nameNewsError??>-->
<#--                                        <div class="invalid-feedback">-->
<#--                                            ${nameNewsError}-->
<#--                                        </div>-->
<#--                                    </#if>-->
<#--                                </div>-->
<#--                                <div class="form-group mt-2">-->
<#--                                    <label class="form-label" for="publicationDate">Дата публикации</label>-->
<#--                                    <input type="date" name="publicationDate"-->
<#--                                           class="form-control ${(publicationDateError??)?string('is-invalid', '')}"-->
<#--                                            &lt;#&ndash;                       value="<#if newsAdd??>${newsAdd.namePage}</#if>"&ndash;&gt;-->
<#--                                           placeholder="Введите название ..." />-->
<#--                                    <#if publicationDateError??>-->
<#--                                        <div class="invalid-feedback">-->
<#--                                            ${publicationDateError}-->
<#--                                        </div>-->
<#--                                    </#if>-->
<#--                                </div>-->
<#--                                <div class="form-group mt-2">-->
<#--                                    <label class="form-label" for="description">Описание</label>-->
<#--                                    <input type="text" name="description"-->
<#--                                           class="form-control ${(descriptionError??)?string('is-invalid', '')}"-->
<#--                                           value="<#if news??>${news.description}</#if>"-->
<#--                                           placeholder="Введите ..." />-->
<#--                                    <#if descriptionError??>-->
<#--                                        <div class="invalid-feedback">-->
<#--                                            ${descriptionError}-->
<#--                                        </div>-->
<#--                                    </#if>-->
<#--                                </div>-->
<#--                                <div class="form-group mt-2">-->
<#--                                    <div class="custom-file">-->
<#--                                        <label class="form-label" for="mainNewsPicture">Главная картинка</label>-->
<#--                                        <input type="file" class="form-control" id="mainNewsPicture" name="mainPicture">-->
<#--                                    </div>-->
<#--                                </div>-->
<#--                                <h5>Галерея картинок</h5>-->
<#--                                <div class="form-group mt-2">-->
<#--                                    <div class="mb-3">-->
<#--                                        <label class="form-label" for="pictureNewsGalleryOne">Первая картинка</label>-->
<#--                                        <input type="file" class="form-control" name="galleryOne" id="pictureNewsGalleryOne">-->
<#--                                    </div>-->
<#--                                </div>-->
<#--                                <div class="form-group mt-2">-->
<#--                                    <div class="mb-3">-->
<#--                                        <label class="form-label" for="pictureNewsGalleryTwo">Вторая картинка</label>-->
<#--                                        <input type="file" class="form-control" name="galleryTwo" id="pictureNewsGalleryTwo">-->
<#--                                    </div>-->
<#--                                </div>-->
<#--                                <div class="form-group mt-2">-->
<#--                                    <div class="mb-3">-->
<#--                                        <label class="form-label" for="pictureNewsGalleryThree">Третья картинка</label>-->
<#--                                        <input type="file" class="form-control" name="galleryThree" id="pictureNewsGalleryThree">-->
<#--                                    </div>-->
<#--                                </div>-->
<#--                                <div class="form-group mt-2">-->
<#--                                    <div class="mb-3">-->
<#--                                        <label class="form-label" for="pictureNewsGalleryFour">Четвертая картинка</label>-->
<#--                                        <input type="file" class="form-control" name="galleryFour" id="pictureNewsGalleryFour">-->
<#--                                    </div>-->
<#--                                </div>-->
<#--                                <div class="form-group mt-2">-->
<#--                                    <div class="mb-3">-->
<#--                                        <label class="form-label" for="pictureNewsGalleryFive">Пятая картинка</label>-->
<#--                                        <input type="file" class="form-control" name="galleryFive" id="pictureNewsGalleryFive">-->
<#--                                    </div>-->
<#--                                </div>-->
<#--                                <div class="form-group mt-2 ">-->
<#--                                    <label class="form-label" for="videoLink">Ссылка на видео</label>-->
<#--                                    <input type="text" name="videoLink"-->
<#--                                           class="form-control ${(videoLinkError??)?string('is-invalid', '')}"-->
<#--                                           value="<#if news??>${news.videoLink}</#if>"-->
<#--                                           placeholder="Введите название ..." />-->
<#--                                    <#if videoLinkError??>-->
<#--                                        <div class="invalid-feedback">-->
<#--                                            ${videoLinkError}-->
<#--                                        </div>-->
<#--                                    </#if>-->
<#--                                </div>-->
<#--                            </div>-->
<#--                                    <input type="hidden" value="${news.id}" name="newsId">-->
<#--                                    <input type="hidden" name="_csrf" value="${_csrf.token}" />-->
<#--                                    <button type="submit" class="btn btn-primary">Save</button>-->
<#--                                </div>-->
<#--                            </form>-->
<#--                        </div>-->
<#--                        <!-- /.card &ndash;&gt;-->
<#--                    </div>-->
<#--                    <!--/.col (left) &ndash;&gt;-->
<#--                    <!-- right column &ndash;&gt;-->
<#--                    <div class="col-md-6">-->

<#--                    </div>-->
<#--                    <!--/.col (right) &ndash;&gt;-->
<#--                </div>-->
<#--                <!-- /.row &ndash;&gt;-->
<#--            </div><!-- /.container-fluid &ndash;&gt;-->
<#--        </section>-->
<#--        <!-- /.content &ndash;&gt;-->
<#--    </form>-->
<#--</@c.page>-->//