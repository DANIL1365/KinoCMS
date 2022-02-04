<#macro contactPageAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <div class="form-group mt-2">
                <!-- Rounded switch -->
                <label class="col-sm-2 col-form-label"> Вкл/Выкл : </label>
                <label class="switch" for="onOf">
                    <input type="checkbox" id="onOf" name="onOf" value="true" class="form-control">
                    <span class="slider round"></span>
                </label>
            </div>
            <div class="form-group mt-2 ">
                <label class="form-label" for="nameCinema"> Название кинотеатра:</label>
                <input type="text" name="nameCinema"
                       class="form-control ${(nameCinemaError??)?string('is-invalid', '')}"
                       value="<#if contactPage??>${contactPage.nameCinema}</#if>"
                       placeholder="Введите название ..." />
                <#if nameCinemaError??>
                    <div class="invalid-feedback">
                        ${nameCinemaError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2 ">
                <label class="form-label" for="address"> Адрес:</label>
                <input type="text" name="address"
                       class="form-control ${(addressError??)?string('is-invalid', '')}"
                       value="<#if contactPage??>${contactPage.address}</#if>"
                       placeholder="Введите ..." />
                <#if addressError??>
                    <div class="invalid-feedback">
                        ${addressError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="dateCreation">Дата создания:</label>
                <input type="date" name="dateCreation"
                       class="form-control ${(dateCreationError??)?string('is-invalid', '')}"
                       placeholder="Введите ..." />
                <#if dateCreationError??>
                    <div class="invalid-feedback">
                        ${dateCreationError}
                    </div>
                </#if>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="contactLogo">Логотип</label>
                    <input type="file" class="form-control" id="contactLogo" name="file">
                </div>
            </div>
            <div class="form-group mt-2">
                <div class="custom-file">
                    <label class="form-label" for="mapCoordinates">Координаты</label>
                    <input type="file" class="form-control" id="mapCoordinates" name="file2">
                </div>
            </div>

            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>