<#macro pageAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <!-- Rounded switch -->
                    <label class="switch" for="onOf">
                        <input type="checkbox" id="onOf" name="onOf" value="true" class="form-control">
                        <span class="slider round">Вкл/Выкл</span>
                    </label>
                <label class="form-label" for="namePage">Название страницы</label>
                <input type="text" name="namePage"
                       class="form-control ${(namePageError??)?string('is-invalid', '')}"
                       value="<#if pagePages??>${pagePages.namePage}</#if>"
                       placeholder="Введите название ..." />
                <#if namePageError??>
                    <div class="invalid-feedback">
                        ${namePageError}
                    </div>
                </#if>
<#--                <input type="text" id="namePage" name="namePage" class="form-control" value="${namePage?ifExists}" placeholder="Введите название ..." />-->
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="dateCreation">Дата публикации</label>
<#--                <input type="date" id="dateCreation" name="dateCreation" class="form-control" value="${dateCreation?ifExists}" placeholder="Введите дату публикации">-->
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
            <div class="form-group mt-2">
                <label class="form-label" for="description">Описание</label>
<#--                <textarea rows="5" type="text" id="description" name="description" class="form-control" value="${description?ifExists}" placeholder="Введите описание"></textarea>-->
                <textarea rows="5" type="text" name="description" class="form-control ${(descriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if pagePages??>${pagePages.description}</#if></textarea>
                <#if descriptionError??>
                    <div class="invalid-feedback">
                        ${descriptionError}
                    </div>
                </#if>
            </div>
            <h5>Главная картинка</h5>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="custom-file-label" for="customFile">Главная картинка</label>
                    <input type="file" class="form-control" id="customFile" name="pagePicture">
                </div>
            </div>
            <h5>Галерея картинок</h5>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="custom-file-label" for="customFile">Первая картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryOne" id="customFile">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="custom-file-label" for="customFile">Вторая картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryTwo" id="customFile">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="custom-file-label" for="customFile">Третья картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryThree" id="customFile">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="custom-file-label" for="customFile">Четвертая картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryFour" id="customFile">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="custom-file-label" for="customFile">Пятая картинка</label>
                    <input type="file" class="form-control" name="pictureGalleryFive" id="customFile">
                </div>
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>