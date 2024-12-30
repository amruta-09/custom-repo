package org.openmrs.module.organization.dao;

import org.openmrs.module.lafiaemr.api.model.CompanyDetails;
import org.openmrs.module.organization.model.Organization;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.module.lafiaemr.api.dao.CompanyDetailsDAO;
import org.springframework.stereotype.Repository;

public interface OrganizationDao {

    Organization getOrganizationById(Long id);

    Organization getOrganizationByUuid(String uuid);

    List<Organization> getAllOrganizations();

    Organization saveOrganization(Organization organization);

    Organization updateOrganization(Organization organization);

    void deleteOrganization(Organization id);
}
