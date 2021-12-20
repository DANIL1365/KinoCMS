<#macro contactPageAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameCinema"></label>
                <input type="text" id="nameCinema" name="nameCinema" class="form-control" value="${nameCinema?ifExists}" placeholder="Введите ..." />
            </div>
            <div class="form-group mt-2 ">
                <label class="form-label" for="address"></label>
                <input type="text" id="address" name="address" class="form-control" value="${address?ifExists}" placeholder="Введите ..." />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="dateCreation"></label>
                <input type="date" id="dateCreation" name="dateCreation" class="form-control" value="${dateCreation?ifExists}" placeholder="Введите дату публикации">
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="mapCoordinates"></label>
                <input type="text" id="mapCoordinates" name="mapCoordinates" class="form-control" value="${mapCoordinates?ifExists}" placeholder="Введите ...">
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="contactLogo">Главная картинка</label>
                    <input type="file" class="form-control" id="contactLogo" name="contactLogo">
                </div>
            </div>

            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>