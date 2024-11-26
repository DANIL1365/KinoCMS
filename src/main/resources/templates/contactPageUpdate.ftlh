<#import "parts/common.ftlh" as c>
//
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
                                        <!-- Rounded switch -->
                                        <label class="col-sm-2 col-form-label"> Вкл/Выкл : </label>
                                        <label class="switch" for="onOf">
                                            <input type="checkbox" id="onOf" name="onOf"
                                                    <#if (contactPage.onOf = true)> checked
                                                    <#else>
                                                    </#if> class="form-control">
                                            <span class="slider round"></span>
                                        </label>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Название кинотеатра : </label>
                                        <div class="col-sm-6">
<#--                                            <input type="text" name="nameCinema" class="form-control" placeholder="" value="<#if contactPage??>${contactPage.nameCinema}</#if>" />-->
                                            <input type="text" name="nameCinema"
                                                   class="form-control ${(nameCinemaError??)?string('is-invalid', '')}"
                                                   value="<#if contactPage??>${contactPage.nameCinema}</#if>"
                                                   placeholder="Введите название ..." />
                                            <#if nameCinemaError??>
                                                <div class="invalid-feedback">
                                                    ${nameCinemaError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Адресс : </label>
                                        <div class="col-sm-6">
<#--                                            <input type="text" name="address" class="form-control" placeholder="" value="<#if contactPage??>${contactPage.address}</#if>" />-->
                                            <input type="text" name="address"
                                                   class="form-control ${(addressError??)?string('is-invalid', '')}"
                                                   value="<#if contactPage??>${contactPage.address}</#if>"
                                                   placeholder="Введите ..." />
                                            <#if addressError??>
                                                <div class="invalid-feedback">
                                                    ${addressError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Дата публикации : </label>
                                        <div class="col-sm-6">
<#--                                            <input type="date" name="dateCreation" class="form-control" placeholder="Введите дату" />-->
                                            <input type="date" name="dateCreation"
                                                   class="form-control ${(dateCreationError??)?string('is-invalid', '')}"
                                                   placeholder="Введите ..." />
                                            <#if dateCreationError??>
                                                <div class="invalid-feedback">
                                                    ${dateCreationError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Лого : </label>
                                        <div class="col-sm-6">
                                            <input type="file" name="file" class="form-control" placeholder="Введите..." />
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Координаты : </label>
                                        <div class="col-sm-6">
                                            <input type="file" name="file2" class="form-control" placeholder="Введите..." />
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