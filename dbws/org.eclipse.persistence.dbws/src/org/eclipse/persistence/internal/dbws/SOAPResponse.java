/*******************************************************************************
 * Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/
 package org.eclipse.persistence.internal.dbws;

// Javase imports

// Java extension imports

// EclipseLink imports

/**
 * <p><b>INTERNAL</b>: Helper class holds the value returned for a DBWS Operation
 * Parent class for all DBWS Operations' code-generated Response sub-classes; the contained
 * result field is mapped as appropriate for each code-generated Response sub-class
 * in {@link SOAPResponseWriter}
 *
 * @author Mike Norman - michael.norman@oracle.com
 * @since EclipseLink 1.x
 */
public class SOAPResponse {

    public SOAPResponse() {
      super();
    }

    protected Object result = null;

    public void setResult(Object result) {
      this.result = result;
    }

    public Object getResult() {
      return result;
    }
}
