package org.openmrs.module.organization.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.module.lafiaemr.api.model.CompanyDetails;
import org.openmrs.module.organization.model.Organization;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("OrganizationDao")
public class OrganizationDaoImpl implements OrganizationDao {


    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public Organization getOrganizationById(Long id) {
        return (Organization) sessionFactory.getCurrentSession()
                .get(Organization.class, id);
    }

    @Override
    @Transactional
    public Organization getOrganizationByUuid(String uuid) {
        Criteria criteria = sessionFactory.getCurrentSession()
                .createCriteria(CompanyDetails.class);
        criteria.add(Restrictions.eq("uuid", uuid));
        return (Organization) criteria.uniqueResult();
    }


    @Override
    @Transactional
    public Organization saveOrganization(Organization organization) {
        return sessionFactory.getCurrentSession().saveOrUpdate(organization);
    }

    @Override
    @Transactional
    public Organization updateOrganization(Organization organization) {
         return sessionFactory.getCurrentSession().saveOrUpdate(organization);
    }

    @Override
    @Transactional
    public void deleteOrganization(Organization organization) {
        sessionFactory.getCurrentSession().delete(organization);
    }

}
