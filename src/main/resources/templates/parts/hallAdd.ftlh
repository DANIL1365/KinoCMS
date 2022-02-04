<#macro hallAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="hallNumber">Номер зала</label>
                <input type="text" name="hallNumber"
                       class="form-control ${(hallNumberError??)?string('is-invalid', '')}"
                       value="<#if hall??>${hall.hallNumber}</#if>"
                       placeholder="Введите название ..." />
                <#if hallNumberError??>
                    <div class="invalid-feedback">
                        ${hallNumberError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="hallDescription">Описание зала</label>
                <textarea rows="5" type="text" name="hallDescription" class="form-control ${(hallDescriptionError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if hall??>${hall.hallDescription}</#if></textarea>
                <#if hallDescriptionError??>
                    <div class="invalid-feedback">
                        ${hallDescriptionError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="hallLayout">Схема зала</label>
                    <input type="file" class="form-control" id="hallLayout" name="layout">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="topBanner">Верхний баннер</label>
                    <input type="file" class="form-control" id="topBanner" name="top">
                </div>
            </div>
            <h5>Галерея картинок</h5>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryOne">Первая картинка</label>
                    <input type="file" class="form-control" name="galleryOne" id="pictureHallGalleryOne">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryTwo">Вторая картинка</label>
                    <input type="file" class="form-control" name="galleryTwo" id="pictureHallGalleryTwo">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryThree">Третья картинка</label>
                    <input type="file" class="form-control" name="galleryThree" id="pictureHallGalleryThree">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryFour">Четвертая картинка</label>
                    <input type="file" class="form-control" name="galleryFour" id="pictureHallGalleryFour">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryFive">Пятая картинка</label>
                    <input type="file" class="form-control" name="galleryFive" id="pictureHallGalleryFive">
                </div>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="dateCreation">Дата создания</label>
                <input type="date" name="dateCreation"
                       class="form-control ${(dateCreationError??)?string('is-invalid', '')}"
                       placeholder="Введите название ..." />
                <#if dateCreationError??>
                    <div class="invalid-feedback">
                        ${dateCreationError}
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