<#import "parts/userPart.ftlh" as u>
//
<@u.pageUser>

    <section class="content">
<#--        <div class="container-fluid">-->
            <div class="row">
                <div class="col-12">
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Расписание сеансов</h3>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>Название фильма</th>
                                    <th>Форматы фильма</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <#list timeTableFilms as film>

                                <tr>

                                    <td><a href="/currentFilms/edit/${film.id}">${film.nameCinema!" "}</a></td>
                                    <td>${film.typeCinema!" "}</td>
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
<#--        </div>-->
    </section>

</@u.pageUser>