
<#--<form method="get" action="/cinemas" class="row g-3">-->
<#--    <div class="col-auto">-->
<#--        &lt;#&ndash;        <label for="inputText" class="visually-hidden">Search by name</label>&ndash;&gt;-->
<#--        <input type="text" name="filter" class="form-control" value="${filter?ifExists}" id="inputText" placeholder="Search by name cinema">-->
<#--    </div>-->
<#--    <div class="col-auto">-->
<#--        <button type="submit" class="btn btn-primary mb-3">Search</button>-->
<#--    </div>-->
<#--</form>-->

<#--<a href="/cinemasAdd"><button type="submit" class="btn btn-primary">Add new cinema</button></a>-->

<#--<div class="row row-cols-1 row-cols-md-4 g-4 mt-2">-->
<#--    <#list cinemas as cinema>-->
<#--        <div class="col">-->
<#--            <div class="card">-->
<#--                <#if cinema.logo??>-->
<#--                    <img src="/img/${cinema.logo}" class="card-img-top">-->
<#--                </#if>-->
<#--                <div class="card-body">-->
<#--                    <h5 class="card-title"><span>${cinema.nameCinema}</span></h5>-->
<#--                    &lt;#&ndash;            <span>${film.description}</span>&ndash;&gt;-->


<#--                    &lt;#&ndash;            <div>&ndash;&gt;-->
<#--                    &lt;#&ndash;                <#if film.pictureGallery??>&ndash;&gt;-->
<#--                    &lt;#&ndash;                    <img src="/img/${film.pictureGallery}">&ndash;&gt;-->
<#--                    &lt;#&ndash;                </#if>&ndash;&gt;-->
<#--                    &lt;#&ndash;            </div>&ndash;&gt;-->
<#--                    &lt;#&ndash;            <span>${film.trailerLink}</span>&ndash;&gt;-->
<#--                    &lt;#&ndash;            <span>${film.typeCinema}</span>&ndash;&gt;-->
<#--                </div>-->
<#--                &lt;#&ndash;            <div class="card-footer text-muted">&ndash;&gt;-->
<#--                &lt;#&ndash;            ${film.authorName?ifExists}&ndash;&gt;-->
<#--                &lt;#&ndash;            </div>&ndash;&gt;-->
<#--            </div>-->
<#--        </div>-->
<#--    <#else>-->
<#--        No films-->
<#--    </#list>-->
<#--</div>-->
