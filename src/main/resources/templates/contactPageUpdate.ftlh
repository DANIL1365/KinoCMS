<#import "parts/common.ftlh" as c>

<@c.page>
    <form action="/contactPage" method="post" enctype="multipart/form-data">
        <section class="content">
            <div class="container-fluid">
                <div class="row">
                    <!-- left column -->
                    <div class="col-md-12">
                        <!-- jquery validation -->
                        <div class="card card-primary">
                            <div class="card-header">
                                <h3 class="card-title">Редактировать</h3>
                            </div>
                            <!-- /.card-header -->
                            <!-- form start -->
                            <form id="quickForm">
                                <div class="card-body">
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Название кинотеатра : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="nameCinema" class="form-control" placeholder="" />
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Адресс : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="address" class="form-control" placeholder="" />
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Дата публикации : </label>
                                        <div class="col-sm-6">
                                            <input type="date" name="dateCreation" class="form-control" placeholder="Введите дату" />
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Координаты : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="mapCoordinates" class="form-control" placeholder="Введите..." />
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Лого : </label>
                                        <div class="col-sm-6">
                                            <input type="file" name="contactLogo" class="form-control" placeholder="Введите..." />
                                        </div>
                                    </div>


                                    <input type="hidden" value="${contactPage.id}" name="contactPageId">
                                    <input type="hidden" name="_csrf" value="${_csrf.token}" />
                                    <div class="form-group mt-2">
                                        <button type="submit" class="btn btn-primary">Добавить</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <!-- /.card -->
                    </div>
                    <!--/.col (left) -->
                    <!-- right column -->
                    <div class="col-md-6">

                    </div>
                    <!--/.col (right) -->
                </div>
                <!-- /.row -->
            </div><!-- /.container-fluid -->
        </section>
        <!-- /.content -->
    </form>
</@c.page>