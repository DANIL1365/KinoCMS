<#import "parts/common.ftlh" as c>

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
                                        <#list page as pagePages>
                                    <tr>
                                        <td>${pagePages.namePage!" "}</td>
                                        <td>${pagePages.dateCreation!" "}</td>
                                        <td>Статус</td>
                                        <td><a href="/pagePages/${pagePages.id}"><img class="img-fluid" src="/dist/img/Edit_icon.png"></a>
                                            <a href="/deletePage/${pagePages.id}"><img class="img-fluid" src="/dist/img/bin-delete.png"></a> </td>
                                    </tr>

                                    </#list>
                                    </tr>

                                    </tbody>
                                    <#--                                <tfoot>-->
                                    <#--                                <tr>-->
                                    <#--                                    <th>Rendering engine</th>-->
                                    <#--                                    <th>Browser</th>-->
                                    <#--                                    <th>Platform(s)</th>-->
                                    <#--                                    <th>Engine version</th>-->
                                    <#--                                    <th>CSS grade</th>-->
                                    <#--                                </tr>-->
                                    <#--                                </tfoot>-->
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