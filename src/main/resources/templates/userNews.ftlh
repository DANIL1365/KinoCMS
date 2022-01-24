<#import "parts/userPart.ftlh" as u>

<@u.pageUser>
    <div class="text-center">
        <h2>Новости</h2>
    </div>
    <div class="row row-cols-1 row-cols-md-4 g-4 mt-2">
        <#list news as newsAdd>
            <div class="col">
                <div class="card text-center">
                    <#if newsAdd.mainNewsPicture??>
                        <img src="/img/${newsAdd.mainNewsPicture}" class="card-img-top">
                    </#if>
                    <div class="card-body">
                        <a href="/news/edit/${newsAdd.id}">
                        <h5 class="card-text"><span>${newsAdd.nameNews}</span></h5>
                        </a>
                        <div class="card-text">
                            <p><span>${newsAdd.publicationDate}</span></p>
                            <p><span>${newsAdd.description}</span></p>
                        </div>
                    </div>
                </div>
            </div>
        <#else>
            No news
        </#list>
    </div>

</@u.pageUser>