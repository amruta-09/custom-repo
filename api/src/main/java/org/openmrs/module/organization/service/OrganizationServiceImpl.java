package org.openmrs.module.organization.service;


import org.openmrs.module.organization.dao.OrganizationDao;
import org.openmrs.module.organization.dao.OrganizationMapper;
import org.openmrs.module.organization.model.Organization;

import java.util.List;

public class OrganizationServiceImpl extends BaseOpenmrsService implements OrgnizationService{

    private OrganizationDao organizationDao;

    @Override
    public Organization getOrganizationById(Long id) {
        return organizationDao.getOrganizationById(id);
    }

    @Override
    public Organization getOrganizationByUuid(String uuid) {
        return organizationDao.getOrganizationByUuid(uuid);
    }

    @Override
    public Organization saveOrganization(Organization organization) {
        return organizationDao.saveOrganization(organization);
    }

    @Override
    public Organization updateOrganizationById(Long id, Organization organization) {
        Organization organizationDetails = getOrganizationById(id);
        if (organization != null && organizationDetails != null) {
            OrganizationMapper.setOrganizationDetails(organization, organizationDetails);
            return organizationDao.updateOrganization(organizationDetails);
        }
        return organizationDetails;
    }

    @Override
    public void deleteOrganizationById(Long id) {
        Organization organization = getOrganizationById(id);
        if (organization != null) {
            organizationDao.deleteOrganization(organization);
        }
    }
}
