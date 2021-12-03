<#import "parts/common.ftlh" as c>



<@c.page>
<form method="get" action="/news" class="row g-3">
    <div class="col-auto">
        <#--        <label for="inputText" class="visually-hidden">Search by name</label>-->
        <input type="text" name="filter" class="form-control" value="${filter?ifExists}" id="inputText" placeholder="Search by name news">
    </div>
    <div class="col-auto">
        <button type="submit" class="btn btn-primary mb-3">Search</button>
    </div>
</form>

<a href="/newsAdd"><button type="submit" class="btn btn-primary">Add new news</button></a>

<div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
    <#list newsServiceAllNews as newsAdd>
        <div class="col">
            <div class="card">
                <#if newsAdd.mainNewsPicture??>
                    <img src="/img/${newsAdd.mainNewsPicture}" class="card-img-top">
                </#if>
                <div class="card-body">
                    <h5 class="card-title"><span>${newsAdd.nameNews}</span></h5>
<#--                    <a href="/news/${newsAdd.id}"><button class="btn btn-primary">Update</button></a>-->
                    <a href="/delete/${newsAdd.id}"><button type="submit" class="btn btn-primary">Delete</button></a>
                </div>
            </div>
        </div>
    <#else>
        No news
    </#list>
</div>
</@c.page>