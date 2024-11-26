<#import "parts/common.ftlh" as c>
//
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
                                    <th>Имя</th>
                                    <th>Фамилия</th>
                                    <th>Никнейм</th>
                                    <th>Почта</th>
                                    <th>Адрес</th>
                                    <th>Номер телефона</th>
                                    <th>Роль</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <#list users as user>
                                <tr>
                                    <td>${user.username!" "}</td>
                                    <td>${user.surname!" "}</td>
                                    <td>${user.alias!" "}</td>
                                    <td>${user.email!" "}</td>
                                    <td>${user.address!" "}</td>
                                    <td>${user.numberPhone!" "}</td>
                                    <td><#list user.roles as role>${role}<#sep>, </#list></td>
                                    <td><a href="/user/${user.id}"><img class="img-fluid" src="/plugins/img/Edit_icon.png"></a>
                                        <a href="/user/delete/${user.id}"><img class="img-fluid" src="/plugins/img/bin-delete.png"></a> </td>
                                </tr>

                                </#list>
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