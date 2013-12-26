package com.jaspersoft.jasperserver.jaxrs.client.authority;

import com.jaspersoft.jasperserver.dto.authority.ClientRole;
import com.jaspersoft.jasperserver.dto.authority.RolesListWrapper;
import com.jaspersoft.jasperserver.jaxrs.client.builder.authority.RolesRequestBuilder;

public class Roles {

    public static RolesRequestBuilder<ClientRole> rolename(String rolename) {
        RolesRequestBuilder<ClientRole> builder = new RolesRequestBuilder<ClientRole>(ClientRole.class);
        builder.setPath(rolename);
        return builder;
    }

    public static RolesRequestBuilder<RolesListWrapper> allRoles() {
        return  new RolesRequestBuilder<RolesListWrapper>(RolesListWrapper.class);
    }

}
