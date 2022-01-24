<#macro soonFilmAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameSoonCinema">Название фильма</label>
                <input type="text" id="nameSoonCinema" name="nameSoonCinema" class="form-control" value="${nameSoonCinema?ifExists}" placeholder="Введите название фильма" />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="description">Описание</label>
                <input type="text" id="description" name="description" class="form-control" value="${description?ifExists}" placeholder="Введите описание" />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="trailerLink">Трейлер</label>
                <input type="text" id="trailerLink" name="trailerLink" class="form-control" value="${trailerLink?ifExists}" placeholder="Вставить ссылку на трейлер" />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="typeCinema">Тип фильма</label>
                <select class="form-control select2" name="typeCinema" style="width: 100%;" />
                <option selected="selected"></option>
                <option>2D</option>
                <option>3D</option>
                <option>IMAX</option>
                </select>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="mainSoonPicture">Главная картинка</label>
                    <input type="file" class="form-control" id="mainSoonPicture" name="mainSoonPicture">
                </div>
            </div>
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