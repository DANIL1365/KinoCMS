<#macro cinemasAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data" xmlns="http://www.w3.org/1999/html">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameCinema">Название кинотеатра</label>
                <input type="text" id="nameCinema" name="nameCinema" class="form-control" value="${nameCinema?ifExists}" placeholder="Введите название кинотеатра" />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="description">Описание</label>
                <textarea type="text" rows="5" id="description" name="description" class="form-control" value="${description?ifExists}" placeholder="Введите описание"></textarea>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="conditions">Условия</label>
                <textarea type="text" rows="5" id="conditions" name="conditions" class="form-control" value="${conditions?ifExists}" placeholder="Введите условия" /></textarea>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="logo">Логотип</label>
                    <input type="file" class="form-control" id="logo" name="logo">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="topBanner">Фото верхнего баннера</label>
                    <input type="file" class="form-control" id="topBanner" name="topBanner">
                </div>
            </div>
            <h5>Галерея картинок</h5>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryOne">Первая картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryOne" id="pictureGalleryOne">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryTwo">Вторая картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryTwo" id="pictureGalleryTwo">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryThree">Третья картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryThree" id="pictureGalleryThree">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryFour">Четвертая картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryFour" id="pictureGalleryFour">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryFive">Пятая картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryFive" id="pictureGalleryFive">
                </div>
            </div>
            <section class="content">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12">
                            <div class="card card-primary">
                                <div class="card-header">
                                    <h3 class="card-title">Список пользователей</h3>
                                </div>
                                <!-- /.card-header -->
                                <div class="card-body">
                                    <table id="example2" class="table table-bordered table-hover">
                                        <thead>
                                        <tr>
                                            <th>Название</th>
                                            <th>Дата создания</th>
                                            <th></th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <#list halls as hall>
                                        <tr>
                                            <td>${hall.hallNumber!" "}</td>
                                            <td>${hall.dateCreation!" "}</td>
                                            <td><a href="/cinemas/${hall.id}"><img class="img-fluid" src="/dist/img/Edit_icon.png"></a> <a href="#"><img class="img-fluid" src="/dist/img/bin-delete.png"></a> </td>
                                        </tr>

                                        </#list>
                                        </tr>
                                        <a href="/hallAdd"><button type="submit" class="btn btn-primary">Add new hall</button></a>
                                        </tbody>
                                        <#--                                <tfoot>-->
                                        <#--                                <tr>-->
                                        <#--                                    <th>Rendering engine</th>-->
                                        <#--                                    <th>Browser</th>-->
                                        <#--                                    <th>Platform(s)</th>-->
                                        <#--                                    <th>Engine version</th>-->
                                        <#--                                    <th>CSS grade</th>-->
                                        <#--                                </tr>-->
                                        <#--                                </tfoot>-->
                                    </table>
                                </div>
                                <!-- /.card-body -->
                            </div>
                            <!-- /.card -->
                        </div>
                    </div>
                </div>
            </section>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>