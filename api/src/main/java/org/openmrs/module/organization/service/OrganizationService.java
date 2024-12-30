package org.openmrs.module.organization.service;

import org.openmrs.module.organization.model.Organization;

import java.util.List;

public interface OrganizationService {

    Organization getOrganizationById(Long id);

    Organization getOrganizationByUuid(String uuid);

    Organization saveOrganization(Organization organization);

    Organization updateOrganizationById(Long id,Organization organization);

    void deleteOrganizationById(Long id);
}
