<#import "parts/userPart.ftlh" as u>

<@u.pageUser>
    <div class="container">
        <div class="directory-info-row">
            <div class="row">
                <div class="col-md-6 col-sm-6">
                    <div class="panel">
                        <div class="panel-body">
                            <div class="media">
                                <a class="pull-left" href="#">
                                    <#if contactPageUser.contactLogo??>
                                    <img class="thumb media-object" src="/img/${contactPageUser.contactLogo}" alt="" />
                                    </#if>
                                </a>
                                <div class="media-body">
                                    <h4>${contactPageUser.nameCinema}</h4>
                                    <address>
                                        <strong>${contactPageUser.address}</strong><br />

                                    </address>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
</@u.pageUser>