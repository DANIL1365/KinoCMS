<#macro hallAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="hallNumber">Номер зала</label>
                <input type="text" id="hallNumber" name="hallNumber" class="form-control" value="${hallNumber?ifExists}" placeholder="Введите номер зала" />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="hallDescription">Описание зала</label>
                <input type="text" id="hallDescription" name="hallDescription" class="form-control" value="${hallDescription?ifExists}" placeholder="Введите описание зала" />
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="hallLayout">Схема зала</label>
                    <input type="file" class="form-control" id="hallLayout" name="hallLayout">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="topBanner">Верхний баннер</label>
                    <input type="file" class="form-control" id="topBanner" name="topBanner">
                </div>
            </div>
            <h5>Галерея картинок</h5>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryOne">Первая картинка</label>
                    <input type="file" class="form-control" name="pictureHallGalleryOne" id="pictureHallGalleryOne">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryTwo">Вторая картинка</label>
                    <input type="file" class="form-control" name="pictureHallGalleryTwo" id="pictureHallGalleryTwo">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryThree">Третья картинка</label>
                    <input type="file" class="form-control" name="pictureHallGalleryThree" id="pictureHallGalleryThree">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryFour">Четвертая картинка</label>
                    <input type="file" class="form-control" name="pictureHallGalleryFour" id="pictureHallGalleryFour">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="mb-3">
                    <label class="form-label" for="pictureHallGalleryFive">Пятая картинка</label>
                    <input type="file" class="form-control" name="pictureHallGalleryFive" id="pictureHallGalleryFive">
                </div>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="dateCreation">Дата создания</label>
                <input type="date" id="dateCreation" name="dateCreation" class="form-control" value="${dateCreation?ifExists}" placeholder="Введите дату создания зала" />
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>