
<#macro cinemasAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameCinema">Название кинотеатра</label>
                <input type="text" name="nameCinema" class="form-control ${(nameCinemaError??)?string('is-invalid', '')}"
                       value="<#if cinema??>${cinema.nameCinema}</#if>" placeholder="Введите название кинотеатра" />
                <#if nameCinemaError??>
                    <div class="invalid-feedback">
                        ${nameCinemaError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="descriptionCinema">Описание</label>
                <textarea type="text" rows="5" name="descriptionCinema" class="form-control ${(descriptionCinemaError??)?string('is-invalid', '')}"
                          placeholder="Введите описание"></textarea>
<#--                value="<#if cinema??>${cinema.description}</#if>"-->
<#--                <#if descriptionCinemaError??>-->
<#--                    <div class="invalid-feedback">-->
<#--                        ${descriptionCinemaError}-->
<#--                    </div>-->
<#--                </#if>-->
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="conditionsCinema">Условия</label>
                <textarea type="text" rows="5" name="conditionsCinema" class="form-control ${(conditionsCinemaError??)?string('is-invalid', '')}"
                           placeholder="Введите условия"></textarea>
<#--                value="<#if cinema??>${cinema.conditions}</#if>"-->
<#--                <#if conditionsCinemaError??>-->
<#--                    <div class="invalid-feedback">-->
<#--                        ${conditionsCinemaError}-->
<#--                    </div>-->
<#--                </#if>-->
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
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>