<#macro login path isRegisterForm>
    <form action="${path}" method="post">
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <!-- left column -->
                <div class="col-md-12">
                    <!-- jquery validation -->
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Авторизация</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form id="quickForm">
                            <div class="card-body">
                                <div class="form-group">
                                    <label for="exampleInputName">User Name</label>
<#--                                    <input type="name" name="username" class="form-control" id="exampleInputName" placeholder="Enter Name" />-->
                                    <input type="text" name="username" value="<#if user??>${user.username}</#if>"
                                           class="form-control ${(usernameError??)?string('is-invalid', '')}"
                                           placeholder="User name" />
                                    <#if usernameError??>
                                        <div class="invalid-feedback">
                                            ${usernameError}
                                        </div>
                                    </#if>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
<#--                                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" />-->
                                    <input type="password" name="password"
                                           class="form-control ${(passwordError??)?string('is-invalid', '')}"
                                           placeholder="Password" />
                                    <#if passwordError??>
                                        <div class="invalid-feedback">
                                            ${passwordError}
                                        </div>
                                    </#if>
                                </div>
                                <#if isRegisterForm>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <#--                                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" />-->
                                    <input type="password" name="password2"
                                           class="form-control ${(password2Error??)?string('is-invalid', '')}"
                                           placeholder="Retype password" />
                                    <#if password2Error??>
                                        <div class="invalid-feedback">
                                            ${password2Error}
                                        </div>
                                    </#if>
                                </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Surname</label>
                                        <#--                                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" />-->
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
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Alias</label>
                                        <#--                                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" />-->
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
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Email:</label>
                                        <#--                                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" />-->
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
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">User address:</label>
                                        <#--                                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" />-->
                                        <select name="address" style="width: 100%;"
                                                class="form-control select2 col-sm-6 ${(addressError??)?string('is-invalid', '')}"/>
<#--                                                value="<#if user??>${user.address}</#if>" />-->
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
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">User Phone :</label>
                                        <#--                                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" />-->
                                        <input type="number" name="numberPhone"
                                               class="form-control ${(numberPhoneError??)?string('is-invalid', '')}"
<#--                                               value="<#if user??>${user.numberPhone}</#if>"-->
                                               placeholder="numberPhone" />
                                        <#if numberPhoneError??>
                                            <div class="invalid-feedback">
                                                ${numberPhoneError}
                                            </div>
                                        </#if>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">User Date Birth :</label>
                                        <#--                                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" />-->
                                        <input type="date" name="dateBirth"
                                               class="form-control ${(dateBirthError??)?string('is-invalid', '')}"
<#--                                               value="<#if user??>${user.dateBirth}</#if>"-->
                                               placeholder="dateBirth" />
                                        <#if dateBirthError??>
                                            <div class="invalid-feedback">
                                                ${dateBirthError}
                                            </div>
                                        </#if>
                                    </div>

                                </#if>
                            </div>
                            <!-- /.card-body -->
                            <div class="card-footer">
                                <input type="hidden" name="_csrf" value="${_csrf.token}" />
                                <#if !isRegisterForm><a href="./registration">Add new user</a></#if>
                                <button class="btn btn-primary" type="submit">
                                    <#if isRegisterForm>Create<#else>Sign In</#if>
                                </button>
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
</#macro>


<#macro logout>
    <form action="./logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button class="btn btn-primary" type="submit">Sign Out</button>
    </form>
</#macro>