<#import "parts/common.ftlh" as c>

<@c.page>
    <form action="/user" method="post">
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
                                        <label class="col-sm-2 col-form-label"> User Name : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="username" value="<#if user??>${user.username}</#if>"
                                                   class="form-control ${(usernameError??)?string('is-invalid', '')}"
                                                   placeholder="User name" />
                                            <#if usernameError??>
                                                <div class="invalid-feedback">
                                                    ${usernameError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> User Surname : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="surname"
                                                   class="form-control ${(surnameError??)?string('is-invalid', '')}"
                                                   value="<#if user??>${user.surname}</#if>"
                                                   placeholder="surname" />
                                            <#if surnameError??>
                                                <div class="invalid-feedback">
                                                    ${surnameError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> User Alias : </label>
                                        <div class="col-sm-6">
                                            <input type="text" name="alias"
                                                   class="form-control ${(aliasError??)?string('is-invalid', '')}"
                                                   value="<#if user??>${user.alias}</#if>"
                                                   placeholder="alias" />
                                            <#if aliasError??>
                                                <div class="invalid-feedback">
                                                    ${aliasError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> User Email : </label>
                                        <div class="col-sm-6">
                                            <input type="email" name="email"
                                                   class="form-control ${(emailError??)?string('is-invalid', '')}"
                                                   value="<#if user??>${user.email}</#if>"
                                                   placeholder="some@some.com" />
                                            <#if emailError??>
                                                <div class="invalid-feedback">
                                                    ${emailError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> User Address : </label>
                                        <div class="col-sm-6">
                                            <select name="address" style="width: 100%;"
                                                    class="form-control select2 col-sm-6 ${(addressError??)?string('is-invalid', '')}"/>
                                            <option selected="selected"><#if user??>${user.address}</#if></option>
                                            <option>Кривой Рог</option>
                                            <option>Киев</option>
                                            <option>Одесса</option>
                                            </select>
                                            <#if addressError??>
                                                <div class="invalid-feedback">
                                                    ${addressError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Password: </label>
                                        <div class="col-sm-6">
                                            <input type="password" name="password"
                                                   class="form-control ${(passwordError??)?string('is-invalid', '')}"
                                                   placeholder="Password" />
                                            <#if passwordError??>
                                                <div class="invalid-feedback">
                                                    ${passwordError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> Retype password: </label>
                                        <div class="col-sm-6">
                                            <input type="password" name="password2"
                                                   class="form-control ${(password2Error??)?string('is-invalid', '')}"
                                                   placeholder="Retype password" />
                                            <#if password2Error??>
                                                <div class="invalid-feedback">
                                                    ${password2Error}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> User Phone : </label>
                                        <div class="col-sm-6">
                                            <input type="number" name="numberPhone"
                                                   class="form-control ${(numberPhoneError??)?string('is-invalid', '')}"
                                                   value="<#if user??>${user.numberPhone}</#if>"
                                                   placeholder="numberPhone" />
                                            <#if numberPhoneError??>
                                                <div class="invalid-feedback">
                                                    ${numberPhoneError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label class="col-sm-2 col-form-label"> User Date Birth : </label>
                                        <div class="col-sm-6">
                                            <input type="date" name="dateBirth"
                                                   class="form-control ${(dateBirthError??)?string('is-invalid', '')}"
                                                   value="<#if user??>${user.dateBirth}</#if>"
                                                   placeholder="dateBirth" />
                                            <#if dateBirthError??>
                                                <div class="invalid-feedback">
                                                    ${dateBirthError}
                                                </div>
                                            </#if>
                                        </div>
                                    </div>

                                    <#list roles as role>
                                        <div class="form-check">
                                            <label><input type="checkbox" class="form-check-input" name="${role}" ${user.roles?seq_contains(role)?string("chacked", "")}>${role}</label>
                                        </div>
                                    </#list>
                                    <input type="hidden" value="${user.id}" name="userId">
                                    <input type="hidden" name="_csrf" value="${_csrf.token}" />
                                    <button type="submit" class="btn btn-primary">Save</button>
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