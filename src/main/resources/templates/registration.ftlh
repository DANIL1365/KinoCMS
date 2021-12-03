<#import "parts/common.ftlh" as c>
<#import "parts/registration.ftlh" as r>

<@c.page>
    ${messages?ifExists}
<@r.registration "/registration" true/>
</@c.page>