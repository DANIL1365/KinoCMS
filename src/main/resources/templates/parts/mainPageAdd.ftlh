<#macro mainPageAdd path>
    <form action="${path}" method="post" enctype="multipart/form-data">
        <div class="form-group mt-3">
            <h5>Телефон</h5>
            <div class="form-group mt-2 ">
                <label class="form-label" for="numberOne"></label>
                <input type="text" id="numberOne" name="numberOne" class="form-control" value="${numberOne?ifExists}" placeholder="Введите номер ..." />
            </div>
            <div class="form-group mt-2 ">
                <label class="form-label" for="numberTwo"></label>
                <input type="text" id="numberTwo" name="numberTwo" class="form-control" value="${numberTwo?ifExists}" placeholder="Введите номер ..." />
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="dateCreation"></label>
                <input type="date" id="dateCreation" name="dateCreation" class="form-control" value="${dateCreation?ifExists}" placeholder="Введите дату публикации">
            </div>
            <div class="form-group mt-2">
                <label class="form-label" for="seoText">SEO текст</label>
                <textarea rows="5" type="text" id="seoText" name="seoText" class="form-control" value="${seoText?ifExists}" placeholder="Введите текст"></textarea>
            </div>

            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group mt-2">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </div>
    </form>

</#macro>