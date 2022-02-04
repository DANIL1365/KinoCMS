<#macro newsAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameNews">Название новости</label>
                <input type="text" name="nameNews"
                       class="form-control ${(nameNewsError??)?string('is-invalid', '')}"
                       value="<#if news??>${news.nameNews}</#if>"
                       placeholder="Введите название ..." />
                <#if nameNewsError??>
                    <div class="invalid-feedback">
                        ${nameNewsError}
                    </div>
                </#if>
<#--                <input type="text" id="nameNews" name="nameNews" class="form-control" value="${nameNews?ifExists}" placeholder="Введите название новости" />-->
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="publicationDate">Дата публикации</label>
<#--                <input type="date" id="publicationDate" name="publicationDate" class="form-control" value="${publicationDate?ifExists}" placeholder="Введите дату публикации" />-->
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
<#--                <input type="text" id="description" name="description" class="form-control" value="${description?ifExists}" placeholder="Введите описание" />-->
                <textarea rows="5" type="text" name="description" class="form-control ${(descriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if news??>${news.description}</#if></textarea>
                <#if descriptionError??>
                    <div class="invalid-feedback">
                        ${descriptionError}
                    </div>
                </#if>
            </div>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="mainNewsPicture">Главная картинка</label>
                    <input type="file" class="form-control" id="mainNewsPicture" name="mainPicture">
                </div>
            </div>
            <h5>Галерея картинок</h5>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryOne">Первая картинка</label>
                    <input type="file" class="form-control" name="galleryOne" id="pictureNewsGalleryOne">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryTwo">Вторая картинка</label>
                    <input type="file" class="form-control" name="galleryTwo" id="pictureNewsGalleryTwo">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryThree">Третья картинка</label>
                    <input type="file" class="form-control" name="galleryThree" id="pictureNewsGalleryThree">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryFour">Четвертая картинка</label>
                    <input type="file" class="form-control" name="galleryFour" id="pictureNewsGalleryFour">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryFive">Пятая картинка</label>
                    <input type="file" class="form-control" name="galleryFive" id="pictureNewsGalleryFive">
                </div>
            </div>
            <div class="form-group mt-2 ">
                <label class="form-label" for="videoLink">Ссылка на видео</label>
<#--                <input type="text" id="videoLink" name="videoLink" class="form-control" value="${videoLink?ifExists}" placeholder="Ссылка на видео Youtube" />-->
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
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>