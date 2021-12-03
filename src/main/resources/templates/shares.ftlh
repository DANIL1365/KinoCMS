<#import "parts/common.ftlh" as c>



<@c.page>
    <form method="get" action="/shares" class="row g-3">
        <#--    <div class="col-auto">-->
        <#--        &lt;#&ndash;        <label for="inputText" class="visually-hidden">Search by name</label>&ndash;&gt;-->
        <#--        <input type="text" name="filter" class="form-control" value="${filter?ifExists}" id="inputText" placeholder="Search by name news">-->
        <#--    </div>-->
        <#--    <div class="col-auto">-->
        <#--        <button type="submit" class="btn btn-primary mb-3">Search</button>-->
        <#--    </div>-->
    </form>

    <a href="/sharesAdd"><button type="submit" class="btn btn-primary">Add new shares</button></a>

    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list shares as shares>
            <div class="col">
                <div class="card">
                    <#if shares.mainSharesPicture??>
                        <img src="/img/${shares.mainSharesPicture}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <h5 class="card-title"><span>${shares.nameShares}</span></h5>
<#--                        <a href="/news/${shares.id}"><button class="btn btn-primary">Update</button></a>-->
                        <a href="/deleteShares/${shares.id}"><button type="submit" class="btn btn-primary">Delete</button></a>
                        <#--            <span>${film.description}</span>-->


                        <#--            <div>-->
                        <#--                <#if film.pictureGallery??>-->
                        <#--                    <img src="/img/${film.pictureGallery}">-->
                        <#--                </#if>-->
                        <#--            </div>-->
                        <#--            <span>${film.trailerLink}</span>-->
                        <#--            <span>${film.typeCinema}</span>-->
                    </div>
                    <#--            <div class="card-footer text-muted">-->
                    <#--            ${film.authorName?ifExists}-->
                    <#--            </div>-->
                </div>
            </div>
        <#else>
            No shares
        </#list>
    </div>
</@c.page>