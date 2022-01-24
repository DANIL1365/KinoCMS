<#import "parts/userPart.ftlh" as u>

<@u.pageUser>
    <div class="text-center">
        <h2>Кинотеатры</h2>
    </div>
    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list cinemas as cinema>
            <div class="col">
                <div class="card">
                    <#if cinema.logo??>
                        <img src="/img/${cinema.logo}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <a href="/cinemas/edit/${cinema.id}">
                        <h5 class="card-title"><span>${cinema.nameCinema}</span></h5>
                        </a>
                    </div>
                </div>
            </div>
        <#else>
            No cinemas
        </#list>


    </div>

</@u.pageUser>