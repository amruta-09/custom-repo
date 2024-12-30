package org.openmrs.module.organization.dao;

import org.openmrs.module.organization.model.Organization;
import org.openmrs.module.organization.model.Organization;

public class OrganizationMapper {

    public static void setOrganizationDetails(Organization organization, Organization organizationDetails) {
        if (organization.getAddress() != null && !organization.getAddress().isEmpty()) {
            organizationDetails.setAddress(organization.getAddress());
        }
        if (organization.getName() != null && !organization.getName().isEmpty()) {
            organizationDetails.setName(organization.getName());
        }
        if (organization.getEmail() != null && !organization.getEmail().isEmpty()) {
            organizationDetails.setEmail(organization.getEmail());
        }
        if (organization.getContactNumber() != null && !organization.getContactNumber().isEmpty()) {
            organizationDetails.setContactNumber(organization.getContactNumber());
        }
    }
}
