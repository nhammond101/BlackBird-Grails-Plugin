<g:if env="production">
    <link rel="stylesheet" href="${resource(dir:'css',file:'blackbird-min.css')}" />
</g:if>
<g:else>
    <link rel="stylesheet" href="${resource(dir:'css',file:'blackbird.css')}" />
</g:else>