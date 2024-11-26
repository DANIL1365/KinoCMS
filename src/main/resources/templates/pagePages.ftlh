<#import "parts/common.ftlh" as c>
//
<@c.page>
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="card card-primary">
                        <div class="card-header">
                            <h1 class="card-title">Список страниц</h1>
                            <a href="/pageAdd" class="ml-auto"><button style="float:right;" type="submit" class="btn btn-primary">Add new page</button></a>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>Название</th>
                                    <th>Дата создания</th>
                                    <th>Статус</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <#list mainPage as mainPages>
                                <tr>
                                    <td>Главная страница</td>
                                    <td>${mainPages.dateMainCreation!" "}</td>
                                    <td><#if (mainPages.onOf = true)> <p>Вкл</p>
                                        <#else><p>Выкл</p></td></#if>
                                    <td><a href="/mainPage/${mainPages.id}"><img class="img-fluid" src="/plugins/img/Edit_icon.png"></a>

                                </tr>

                                </#list>

                                <#list page as pagePages>
                                    <tr>
                                        <td>${pagePages.namePage!" "}</td>
                                        <td>${pagePages.dateCreation!" "}</td>
                                        <td><#if (pagePages.onOf = true)> <p>Вкл</p>
                                            <#else><p>Выкл</p></td></#if>
                                        <td><a href="/pagePages/${pagePages.id}"><img class="img-fluid" src="/plugins/img/Edit_icon.png"></a>
                                            <#if (pagePages.id > 316)>
                                            <a href="/deletePage/${pagePages.id}"><img class="img-fluid" src="/plugins/img/bin-delete.png"></a> </td>
                                        <#else>

                                        </#if>
                                    </tr>


                                </#list>


                                <tr>
                                    <td>Контакты</td>
                                        <td><#list contactPage as contactPage>
                                                <#if !(contactPage?has_next)>${contactPage.dateCreation}</#if>
                                            </#list></td>
                                    <td>Вкл</td>
                                    <td><a href="/contactPage"><img class="img-fluid" src="/plugins/img/Edit_icon.png"></a>

                                </tr>

                                </tr>

                                </tbody>
                            </table>
                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->
                </div>
            </div>
        </div>
    </section>
</@c.page>