<#macro sharesAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameShares">Название акции</label>
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
            <div class="form-group mt-2">
                <label class="form-label" for="publicationDate">Дата публикации</label>
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
            <div class="form-group mt-2">
                <label class="form-label" for="description">Описание</label>
                <textarea rows="5" type="text" name="description" class="form-control ${(descriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if shares??>${shares.description}</#if></textarea>
                <#if descriptionError??>
                    <div class="invalid-feedback">
                        ${descriptionError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="mainSharesPicture">Главная картинка</label>
                    <input type="file" class="form-control" id="mainSharesPicture" name="mainPicture">
                </div>
            </div>
            <h5>Галерея картинок</h5>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryOne">Первая картинка</label>
                    <input type="file" class="form-control" name="galleryOne" id="pictureSharesGalleryOne">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryTwo">Вторая картинка</label>
                    <input type="file" class="form-control" name="galleryTwo" id="pictureSharesGalleryTwo">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryThree">Третья картинка</label>
                    <input type="file" class="form-control" name="galleryThree" id="pictureSharesGalleryThree">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryFour">Четвертая картинка</label>
                    <input type="file" class="form-control" name="galleryFour" id="pictureSharesGalleryFour">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryFive">Пятая картинка</label>
                    <input type="file" class="form-control" name="galleryFive" id="pictureSharesGalleryFive">
                </div>
            </div>
            <div class="form-group mt-2 ">
                <label class="form-label" for="videoLink">Ссылка на видео</label>
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
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>