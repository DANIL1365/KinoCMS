
<#macro cinemasAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameCinema">Название кинотеатра</label>
                <input type="text" name="nameCinema" id="nameCinema" class="form-control" value="${nameCinema?ifExists}" placeholder="Введите название кинотеатра" />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="descriptionCinema">Описание</label>
                <textarea type="text" rows="5" id="descriptionCinema" name="descriptionCinema" class="form-control" value="${descriptionCinema?ifExists}" placeholder="Введите описание"></textarea>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="conditionsCinema">Условия</label>
                <textarea type="text" rows="5" id="conditionsCinema" name="conditionsCinema" class="form-control" value="${conditionsCinema?ifExists}" placeholder="Введите условия"></textarea>
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