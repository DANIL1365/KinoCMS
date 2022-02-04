<#import "parts/common.ftlh" as c>

<@c.page>
    <form action="/mainPage" method="post" enctype="multipart/form-data">
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
                                                    <#if (mainPage.onOf = true)> checked
                                                    <#else>
                                                    </#if> class="form-control">
                                            <span class="slider round"></span>
                                        </label>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label">Номер телефона 1 : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="numberOne"
                                                   class="form-control ${(numberOneError??)?string('is-invalid', '')}"
                                                   value="<#if mainPage??>${mainPage.numberOne}</#if>"
                                                   placeholder="Number one" />
                                            <#if numberOneError??>
                                                <div class="invalid-feedback">
                                                    ${numberOneError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label">Номер телефона 2 :</label>
                                        <div class="col-sm-6">
<#--                                            <input type="text" name="numberTwo" class="form-control" placeholder="number" />-->
                                            <input type="text" name="numberTwo"
                                                   class="form-control ${(numberTwoError??)?string('is-invalid', '')}"
                                                   value="<#if mainPage??>${mainPage.numberTwo}</#if>"
                                                   placeholder="Number two" />
                                            <#if numberTwoError??>
                                                <div class="invalid-feedback">
                                                    ${numberTwoError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Дата публикации : </label>
                                        <div class="col-sm-6">
<#--                                            <input type="date" name="dateCreationMain" class="form-control" placeholder="Введите дату" />-->
                                            <input type="date" name="dateMainCreation"
                                                   class="form-control ${(dateMainCreationError??)?string('is-invalid', '')}"
<#--                                                   value="<#if mainPage??>${mainPage.dateMainCreation}</#if>"-->
                                                   placeholder="dateMainCreation" />
                                            <#if dateMainCreationError??>
                                                <div class="invalid-feedback">
                                                    ${dateMainCreationError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> SEO text : </label>
                                        <div class="col-sm-6">
                                            <textarea rows="5" type="text" name="seoText" class="form-control ${(seoTextError??)?string('is-invalid', '')}" placeholder="Введите ..."><#if mainPage??>${mainPage.seoText}</#if></textarea>
                                            <#if seoTextError??>
                                                <div class="invalid-feedback">
                                                    ${seoTextError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>

                                    <input type="hidden" value="${mainPage.id}" name="mainPageId">
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