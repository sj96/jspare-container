/*
 * Copyright 2016 JSpare.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.jspare.core.container;

import static org.jspare.core.container.Environment.my;
import static org.junit.Assert.assertTrue;

import org.jspare.core.container.test.application.CmptAutoLoader;
import org.jspare.core.container.test.application.CmptAutoLoaderOneImpl;
import org.jspare.core.container.test.application.CmptAutoLoaderTwoImpl;
import org.jspare.core.container.test.application.more.CmptAutoLoaderThreeImpl;
import org.junit.Test;

public class ApplicationComponentScanningTest extends AbstractApplicationTest {

	@Test
	public void testScanning() {

		CmptAutoLoader cmptAutoLoader = my(CmptAutoLoader.class);
		assertTrue(cmptAutoLoader instanceof CmptAutoLoaderOneImpl);

		cmptAutoLoader = my(CmptAutoLoader.class, "CmptAutoLoaderTwoImpl");
		assertTrue(cmptAutoLoader instanceof CmptAutoLoaderTwoImpl);

		cmptAutoLoader = my(CmptAutoLoader.class, "CmptAutoLoaderThreeImpl");
		assertTrue(cmptAutoLoader instanceof CmptAutoLoaderThreeImpl);
	}

	@Override
	protected EnvironmentBuilder toLoad() {

		return EnvironmentBuilder.create().scan("org.jspare.core.container.test.application.*");
	}

}