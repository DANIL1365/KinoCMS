<#macro pageAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="namePage">Название страницы</label>
                <input type="text" id="namePage" name="namePage" class="form-control" value="${namePage?ifExists}" placeholder="Введите название ..." />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="dateCreation">Дата публикации</label>
                <input type="date" id="dateCreation" name="dateCreation" class="form-control" value="${dateCreation?ifExists}" placeholder="Введите дату публикации">
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="description">Описание</label>
                <textarea rows="5" type="text" id="description" name="description" class="form-control" value="${description?ifExists}" placeholder="Введите описание"></textarea>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="pagePicture">Главная картинка</label>
                    <input type="file" class="form-control" id="pagePicture" name="pagePicture">
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