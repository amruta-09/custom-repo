/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.BaseModuleActivator;

/**
 * This class contains the logic that is run every time this module is either started or shutdown
 */
public class OrganizationEMRCoreActivator extends BaseModuleActivator {
	private final Log log = LogFactory.getLog(OrganizationEMRCoreActivator.class);

	@Override
	public void willStart() {
		log.info("Starting Organization EMR Core Module");
	}

	@Override
	public void started() {
		log.info("Organization EMR Core Module started");
	}

	@Override
	public void willStop() {
		log.info("Stopping Organization EMR Core Module");
	}

	@Override
	public void stopped() {
		log.info("Organization EMR Core Module stopped");
	}
}
