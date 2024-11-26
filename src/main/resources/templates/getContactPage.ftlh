<#import "parts/userPart.ftlh" as u>
//
<@u.pageUser>
    <div class="container">
        <div class="directory-info-row">
            <div class="row">
<#--                <div class="col-md-6 col-sm-6">-->
<#--                    <div class="panel">-->
<#--                        <div class="panel-body">-->
<#--                            <div class="media">-->
<#--                                <#list contactPageUser as contactPage>-->
<#--                                <a class="pull-left" href="#">-->
<#--                                    <#if contactPage.contactLogo??>-->
<#--                                    <img class="thumb media-object" src="/img/${contactPage.contactLogo}" alt="" />-->
<#--                                    </#if>-->
<#--                                </a>-->
<#--                                <div class="media-body">-->
<#--                                    <h4>${contactPage.nameCinema}</h4>-->
<#--                                    <address>-->
<#--                                        <strong>${contactPage.address}</strong><br />-->
<#--                                    </address>-->
<#--                                    </#list>-->
<#--                                </div>-->
<#--                            </div>-->
<#--                        </div>-->
<#--                    </div>-->
                <!-- Category-->
                <#list contactPageUser as contactPage>
                    <div class="col-md-4 col-sm-6">
                        <div class="card border-0 mb-grid-gutter">
                            <a class="card-img-tiles">
                                <div class="main-img"><img src="/plugins/img/multipleks.jpg" alt="Clothing"></div>
                                <div class="thumblist"><img src="/img/${contactPage.contactLogo}" alt="Clothing"><img src="/img/${contactPage.mapCoordinates}" alt="Clothing"></div>
                            </a>
                            <div class="card-body border mt-n1 py-4 text-center">
                                <h2 class="h5 mb-1">${contactPage.nameCinema}</h2><span class="d-block mb-3 font-size-xs text-muted">${contactPage.address}</span>
                            </div>
                        </div>
                    </div>
                </#list>
            </div>
        </div>
    </div>
    </div>
</@u.pageUser>