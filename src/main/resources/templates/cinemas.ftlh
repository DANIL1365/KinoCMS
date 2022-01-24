<#import "parts/common.ftlh" as c>


<@c.page>
    <form method="get" action="/cinemas" class="row g-3">
        <div class="col-auto">
            <#--        <label for="inputText" class="visually-hidden">Search by name</label>-->
            <input type="text" name="filter" class="form-control" value="${filter?ifExists}" id="inputText" placeholder="Search by name cinema">
        </div>
        <div class="col-auto">
            <button type="submit" class="btn btn-primary mb-3">Search</button>
        </div>
    </form>

    <a href="/cinemasAdd"><button type="submit" class="btn btn-primary">Add new cinema</button></a>

    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list cinemas as cinema>
            <div class="col">
                <div class="card">
                    <#if cinema.logo??>
                        <img src="/img/${cinema.logo}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <h5 class="card-title"><span>${cinema.nameCinema}</span></h5>
                        <a href="/cinemas/${cinema.id}"><button type="submit" class="btn btn-primary">Update</button></a>
                        <a href="/deleteCinema/${cinema.id}"><button type="submit" class="btn btn-primary">Delete</button></a>
                    </div>
                </div>
            </div>
        <#else>
            No cinemas
        </#list>
    </div>

</@c.page>