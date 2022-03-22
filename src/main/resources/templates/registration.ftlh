<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as r>

<@c.page>
    <div class="card-header"><h3 class="card-title">Регистрация</h3></div>
    ${messages?ifExists}
<@r.login "./registration" true/>
</@c.page>