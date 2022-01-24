<#import "parts/userPart.ftlh" as u>

<@u.pageUser>
    <div class="text-center">
        <h2>Акции</h2>
    </div>
    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list shares as shares>
            <div class="col">
                <div class="card text-center">
                    <#if shares.mainSharesPicture??>
                        <img src="/img/${shares.mainSharesPicture}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <a href="/shares/edit/${shares.id}">
                        <h5 class="card-text"><span>${shares.nameShares}</span></h5>
                        </a>
                        <div class="card-text">
                            <p><span>${shares.publicationDate}</span></p>
                            <p><span>${shares.description}</span></p>


                        </div>
                    </div>
                </div>
            </div>
        <#else>
            No shares
        </#list>
    </div>

</@u.pageUser>