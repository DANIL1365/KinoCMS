<#macro newsAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameNews">Название новости</label>
                <input type="text" id="nameNews" name="nameNews" class="form-control" value="${nameNews?ifExists}" placeholder="Введите название новости" />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="publicationDate">Дата публикации</label>
                <input type="date" id="publicationDate" name="publicationDate" class="form-control" value="${publicationDate?ifExists}" placeholder="Введите дату публикации" />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="description">Описание</label>
                <input type="text" id="description" name="description" class="form-control" value="${description?ifExists}" placeholder="Введите описание" />
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="mainNewsPicture">Главная картинка</label>
                    <input type="file" class="form-control" id="mainNewsPicture" name="mainNewsPicture">
                </div>
            </div>
            <h5>Галерея картинок</h5>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryOne">Первая картинка</label>
                    <input type="file" class="form-control" name="pictureNewsGalleryOne" id="pictureNewsGalleryOne">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryTwo">Вторая картинка</label>
                    <input type="file" class="form-control" name="pictureNewsGalleryTwo" id="pictureNewsGalleryTwo">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryThree">Третья картинка</label>
                    <input type="file" class="form-control" name="pictureNewsGalleryThree" id="pictureNewsGalleryThree">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryFour">Четвертая картинка</label>
                    <input type="file" class="form-control" name="pictureNewsGalleryFour" id="pictureNewsGalleryFour">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureNewsGalleryFive">Пятая картинка</label>
                    <input type="file" class="form-control" name="pictureNewsGalleryFive" id="pictureNewsGalleryFive">
                </div>
            </div>
            <div class="form-group mt-2 ">
                <label class="form-label" for="videoLink">Ссылка на видео</label>
                <input type="text" id="videoLink" name="videoLink" class="form-control" value="${videoLink?ifExists}" placeholder="Ссылка на видео Youtube" />
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>