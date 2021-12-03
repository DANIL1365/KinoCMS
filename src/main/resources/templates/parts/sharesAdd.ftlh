<#macro sharesAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameShares">Название акции</label>
                <input type="text" id="nameShares" name="nameShares" class="form-control" value="${nameShares?ifExists}" placeholder="Введите название акции" />
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
                    <label class="form-label" for="mainSharesPicture">Главная картинка</label>
                    <input type="file" class="form-control" id="mainSharesPicture" name="mainSharesPicture">
                </div>
            </div>
            <h5>Галерея картинок</h5>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryOne">Первая картинка</label>
                    <input type="file" class="form-control" name="pictureSharesGalleryOne" id="pictureSharesGalleryOne">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryTwo">Вторая картинка</label>
                    <input type="file" class="form-control" name="pictureSharesGalleryTwo" id="pictureSharesGalleryTwo">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryThree">Третья картинка</label>
                    <input type="file" class="form-control" name="pictureSharesGalleryThree" id="pictureSharesGalleryThree">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryFour">Четвертая картинка</label>
                    <input type="file" class="form-control" name="pictureSharesGalleryFour" id="pictureSharesGalleryFour">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureSharesGalleryFive">Пятая картинка</label>
                    <input type="file" class="form-control" name="pictureSharesGalleryFive" id="pictureSharesGalleryFive">
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