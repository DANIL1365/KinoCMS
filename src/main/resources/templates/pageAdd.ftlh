<#import "parts/common.ftlh" as c>
<#import "parts/pageAdd.ftlh" as p>
//
<@c.page>
    ${messages?ifExists}
    <@p.pageAdd "/pageAdd" />
</@c.page>