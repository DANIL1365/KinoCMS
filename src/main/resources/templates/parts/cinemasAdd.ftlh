
<#macro cinemasAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameCinema">Название кинотеатра</label>
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
            <div class="form-group mt-2">
                <label class="form-label" for="descriptionCinema">Описание</label>
                <textarea rows="5" type="text" name="descriptionCinema" class="form-control ${(descriptionCinemaError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if cinemas??>${cinemas.descriptionCinema}</#if></textarea>
                <#if descriptionCinemaError??>
                    <div class="invalid-feedback">
                        ${descriptionCinemaError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="conditionsCinema">Условия</label>
                <textarea rows="5" type="text" name="conditionsCinema" class="form-control ${(conditionsCinemaError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if cinemas??>${cinemas.conditionsCinema}</#if></textarea>
                <#if conditionsCinemaError??>
                    <div class="invalid-feedback">
                        ${conditionsCinemaError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="logo">Логотип</label>
                    <input type="file" class="form-control" id="logo" name="logoPicture">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="topBanner">Фото верхнего баннера</label>
                    <input type="file" class="form-control" id="topBanner" name="top">
                </div>
            </div>
            <h5>Галерея картинок</h5>
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