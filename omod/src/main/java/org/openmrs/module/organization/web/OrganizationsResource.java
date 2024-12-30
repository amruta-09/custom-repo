package org.openmrs.module.organization.web;

import org.openmrs.api.context.Context;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.DefaultRepresentation;
import org.openmrs.module.webservices.rest.web.representation.FullRepresentation;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DataDelegatingCrudResource;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;
import org.openmrs.module.webservices.rest.web.response.ResponseException;

@Resource(name = RestConstants.VERSION_1 + "/tenants", supportedClass = Organization.class, supportedOpenmrsVersions = {"3.*"})
public class OrganizationsResource extends DataDelegatingCrudResource<Organization> {
    
    @Override
    public Organization getByUniqueId(String id) {
        return Context.getService(OrganizationService.class).getOrganizationById(id);
    }

    @PropertyGetter("uuid")
    public Organization getByUUID(String uuid) {
        return Context.getService(OrganizationService.class).getOrganizationByUuid(uuid);
    }

    
    @Override
    protected void delete(Organization organization, String reason, RequestContext context) throws ResponseException {
        Context.getService(OrganizationService.class).deleteOrganizationById(organization);
    }

    @Override
    public Organization save(Organization organization) {
        return Context.getService(OrganizationService.class).saveOrganization(organization);
    }

    @Override
    public Organization update(String id, Organization organization, RequestContext context) throws ResponseException
        return Context.getService(OrganizationService.class).updateOrganizationById(id,organization);
    }
}