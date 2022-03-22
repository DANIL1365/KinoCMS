<#import "parts/common.ftlh" as c>

<@c.page>
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Список пользователей</h3>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>Название</th>
                                    <th>Дата создания</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <#list halls as hall>
                                <tr>
                                    <td>${hall.hallNumber!" "}</td>
                                    <td>${hall.dateCreation!" "}</td>
                                    <td><a href="/hall/${hall.id}"><img class="img-fluid" src="/plugins/img/Edit_icon.png"></a>
                                        <a href="/deleteHall/${hall.id}"><img class="img-fluid" src="/plugins/img/bin-delete.png"></a> </td>
                                </tr>

                                </#list>
                                </tr>

                                </tbody>
                            </table>
                            <a href="/hallAdd"><button type="submit" class="btn btn-primary">Создать Зал</button></a>
                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->
                </div>
            </div>
        </div>
    </section>
</@c.page>