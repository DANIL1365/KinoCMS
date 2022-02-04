<#macro filmAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameCinema">Название фильма</label>
                <input type="text" name="nameCinema"
                       class="form-control ${(nameCinemaError??)?string('is-invalid', '')}"
                       value="<#if currentFilms??>${currentFilms.nameCinema}</#if>"
                       placeholder="Введите название ..." />
                <#if nameCinemaError??>
                    <div class="invalid-feedback">
                        ${nameCinemaError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="description">Описание</label>
                <textarea rows="5" type="text" name="description" class="form-control ${(descriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if currentFilms??>${currentFilms.description}</#if></textarea>
                <#if descriptionError??>
                    <div class="invalid-feedback">
                        ${descriptionError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="trailerLink">Трейлер</label>
                <input type="text" name="trailerLink"
                       class="form-control ${(trailerLinkError??)?string('is-invalid', '')}"
                       value="<#if currentFilms??>${currentFilms.trailerLink}</#if>"
                       placeholder="Введите название ..." />
                <#if trailerLinkError??>
                    <div class="invalid-feedback">
                        ${trailerLinkError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="typeCinema">Тип фильма</label>
<#--                <input type="text" id="typeCinema" name="typeCinema" class="form-control" value="${typeCinema?ifExists}" placeholder="Введите тип фильма" />-->
                    <select class="form-control select2 ${(typeCinemaError??)?string('is-invalid', '')}"
                            name="typeCinema" style="width: 100%;"
                            value="<#if currentFilms??>${currentFilms.typeCinema}</#if>" />
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
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="mainPicture">Главная картинка</label>
                    <input type="file" class="form-control" id="mainPicture" name="main">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryOne">Первая картинка</label>
                    <input type="file" class="form-control" name="galleryOne" id="pictureGalleryOne">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryTwo">Вторая картинка</label>
                    <input type="file" class="form-control" name="galleryTwo" id="pictureGalleryTwo">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryThree">Третья картинка</label>
                    <input type="file" class="form-control" name="galleryThree" id="pictureGalleryThree">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryFour">Четвертая картинка</label>
                    <input type="file" class="form-control" name="galleryFour" id="pictureGalleryFour">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureGalleryFive">Пятая картинка</label>
                    <input type="file" class="form-control" name="galleryFive" id="pictureGalleryFive">
                </div>
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>