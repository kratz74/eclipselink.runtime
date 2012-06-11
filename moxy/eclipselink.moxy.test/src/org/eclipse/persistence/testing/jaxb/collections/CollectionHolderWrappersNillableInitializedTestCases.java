/*******************************************************************************
 * Copyright (c) 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *  - rbarkhouse - 27 January 2012 - 2.3.3 - Initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.collections;

import org.eclipse.persistence.testing.jaxb.JAXBTestCases;

public class CollectionHolderWrappersNillableInitializedTestCases extends JAXBTestCases {

    private final static String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/collections/emptycollectionholderwrappersnillableinitialized.xml";

    public CollectionHolderWrappersNillableInitializedTestCases(String name) throws Exception {
        super(name);
        setControlDocument(XML_RESOURCE);
        Class[] classes = new Class[1];
        classes[0] = CollectionHolderWrappersNillableInitialized.class;
        setClasses(classes);
    }

    @Override
    protected Object getControlObject() {
        return new CollectionHolderWrappersNillableInitialized();
    }

}