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
            <input type="text" name="name" class="form-control" placeholder="User Name" />
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label"> User Surname : </label>
        <div class="col-sm-6">
            <input type="text" name="surname" class="form-control" placeholder="User Surname" />
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label"> User Alias : </label>
        <div class="col-sm-6">
            <input type="text" name="alias" class="form-control" placeholder="User Alias" />
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label"> User Email : </label>
        <div class="col-sm-6">
            <input type="email" name="email" class="form-control" placeholder="User Email" />
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label"> User Address : </label>
        <div class="col-sm-6">
            <input type="text" name="address" class="form-control" placeholder="User Address" />
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label"> Password: </label>
        <div class="col-sm-6">
            <input type="password" name="password" class="form-control" placeholder="Password" />
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label"> User Phone : </label>
        <div class="col-sm-6">
            <input type="number" name="numberPhone" class="form-control" placeholder="User Phone" />
        </div>
    </div>
<#--    <div class="form-group row">-->
<#--        <label class="col-sm-2 col-form-label"> User Date Birth : </label>-->
<#--        <div class="col-sm-6">-->
<#--            <input type="date" name="dateBirth" class="form-control" placeholder="User Date Birth" />-->
<#--        </div>-->
<#--    </div>-->

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