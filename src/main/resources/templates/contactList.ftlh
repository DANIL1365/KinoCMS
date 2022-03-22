<#import "parts/common.ftlh" as c>

<@c.page>
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="card card-primary">
                        <div class="card-header">
                            <h1 class="card-title">Список страниц</h1>
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

                                <#list contacts as contactPage>
                                    <tr>
                                        <td>${contactPage.nameCinema!" "}</td>
                                        <td>${contactPage.dateCreation!" "}</td>
                                        <td><#if (contactPage.onOf = true)> <p>Вкл</p>
                                            <#else><p>Выкл</p></td></#if>
                                        <td><a href="/contactPage/${contactPage.id}"><img class="img-fluid" src="/plugins/img/Edit_icon.png"></a>
                                         <#if (contactPage.id > 321)>
                                            <a href="/deleteContactPage/${contactPage.id}"><img class="img-fluid" src="/plugins/img/bin-delete.png"></a> </td>
                                        <#else>
                                    </#if>

                                    </tr>

                                </#list>
                                </tr>

                                </tbody>
                            </table>
                            <a href="/contactPageAdd" class="ml-auto"><button style="float:right;" type="submit" class="btn btn-primary">Добавить кинотеатр</button></a>
                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->
                </div>
            </div>
        </div>
    </section>
</@c.page>