/*******************************************************************************
 * Copyright (c) 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Blaise Doughan - 2.3.3 - initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.jaxbcontext.empty.negative;

import javax.xml.bind.JAXBException;
import junit.framework.TestCase;
import org.eclipse.persistence.jaxb.JAXBContextFactory;

public class NegativeTestCases extends TestCase {

    public void testCreateJAXBContextWithNoMetadata() throws JAXBException {
        try {
            JAXBContextFactory.createContext("org.eclipse.persistence.testing.jaxb.jaxbcontext.empty.negative", this.getClass().getClassLoader());
        } catch(JAXBException e) {
            return;
        } catch(Exception e) {
            fail("Expected JAXBException but caught:  " + e.getClass().toString());
        }
        fail("Expected JAXBException but no exceptions were thrown");
    }

}