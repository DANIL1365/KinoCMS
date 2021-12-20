<#macro bannersTop path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="row">
            <div class="col-12">
                <div class="card card-primary">
                    <div class="card-header">
                        <h3 class="card-title">На главной верх</h3>
                    </div>
                        <div class="form-group mt-3">
                            <div class="form-group mt-2">
                                <div class="col-lg-3 col-md-4 col-6 custom-file">
                                    <label class="custom-file-label" for="firstTopImage">Первая картинка</label>
                                    <input type="file" class="custom-file-input" name="firstTopImage" id="firstTopImage">
                                </div>
                            </div>
                            <div class="form-group mt-2">
                                <div class="col-lg-3 col-md-4 col-6 custom-file">
                                    <label class="custom-file-label" for="secondTopImage">Первая картинка</label>
                                    <input type="file" class="custom-file-input" name="secondTopImage" id="secondTopImage">
                                </div>
                            </div>
                            <div class="form-group mt-2">
                                <div class="col-lg-3 col-md-4 col-6 custom-file">
                                    <label class="custom-file-label" for="thirdTopImage">Первая картинка</label>
                                    <input type="file" class="custom-file-input" name="thirdTopImage" id="thirdTopImage">
                                </div>
                            </div>
                            <div class="form-group mt-2">
                                <div class="col-lg-3 col-md-4 col-6 custom-file">
                                    <label class="custom-file-label" for="fourthTopImage">Первая картинка</label>
                                    <input type="file" class="custom-file-input" name="fourthTopImage" id="fourthTopImage">
                                </div>
                            </div>
                            <div class="form-group mt-2">
                                <div class="col-lg-3 col-md-4 col-6 custom-file">
                                    <label class="custom-file-label" for="fifthTopImage">Первая картинка</label>
                                    <input type="file" class="custom-file-input" name="fifthTopImage" id="fifthTopImage">
                                </div>
                            </div>
                        <input type="hidden" name="_csrf" value="${_csrf.token}" />
                        <div class="form-group mt-2">
                            <button type="submit" class="btn btn-primary">Сохранить</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>
    </#macro>

<#macro bannersMain path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="row">
            <div class="col-12">
                <div class="card card-primary">
                    <div class="card-header">
                        <h3 class="card-title">Сквозной банер на заднем фоне</h3>
                    </div>
                    <div class="form-group mt-3">
                        <div class="form-group mt-2">
                            <div class="col-lg-3 col-md-4 col-6 custom-file">
                                <label class="custom-file-label" for="pictureBanner"></label>
                                <input type="file" class="custom-file-input" name="pictureBanner" id="pictureBanner">
                            </div>
                        </div>
                        <input type="hidden" name="_csrf" value="${_csrf.token}" />
                        <div class="row">
                        <div class="col-lg-2 col-md-4 col-6">
                            <button type="submit" id="pictureBanner" class="btn btn-primary">Добавить</button>
                        </div>
<#--                        <div class="col-lg-2 col-md-4 col-6">-->
<#--                            <button type="#" id="pictureBanner" class="btn btn-primary">Удалить</button>-->
<#--                        </div>-->
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </form>
    </#macro>

<#macro bannersBottom path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="row">
            <div class="col-12">
                <div class="card card-primary">
                    <div class="card-header">
                        <h3 class="card-title">На главной новости и акции</h3>
                    </div>
                    <div class="form-group mt-3">
                        <div class="form-group mt-2">
                            <div class="col-lg-3 col-md-4 col-6 custom-file">
                                <label class="custom-file-label" for="firstImage">Первая картинка</label>
                                <input type="file" class="custom-file-input" name="firstImage" id="firstImage">
                            </div>
                        </div>
                        <div class="form-group mt-2">
                            <div class="col-lg-3 col-md-4 col-6 custom-file">
                                <label class="custom-file-label" for="secondImage">Вторая картинка</label>
                                <input type="file" class="custom-file-input" name="secondImage" id="secondImage">
                            </div>
                        </div>
                        <div class="form-group mt-2">
                            <div class="col-lg-3 col-md-4 col-6 custom-file">
                                <label class="custom-file-label" for="thirdImage">Третья картинка</label>
                                <input type="file" class="custom-file-input" name="thirdImage" id="thirdImage">
                            </div>
                        </div>
                        <div class="form-group mt-2">
                            <div class="col-lg-3 col-md-4 col-6 custom-file">
                                <label class="custom-file-label" for="fourthImage">Четвертая картинка</label>
                                <input type="file" class="custom-file-input" name="fourthImage" id="fourthImage">
                            </div>
                        </div>
                        <div class="form-group mt-2">
                            <div class="col-lg-3 col-md-4 col-6 custom-file">
                                <label class="custom-file-label" for="fifthImage">Пятая картинка</label>
                                <input type="file" class="custom-file-input" name="fifthImage" id="fifthImage">
                            </div>
                        </div>
                        <input type="hidden" name="_csrf" value="${_csrf.token}" />
                        <div class="form-group mt-2">
                            <button type="submit" class="btn btn-primary">Сохранить</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>
</#macro>