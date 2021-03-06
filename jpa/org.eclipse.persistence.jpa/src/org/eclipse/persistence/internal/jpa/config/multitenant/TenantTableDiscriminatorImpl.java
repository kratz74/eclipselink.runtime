/*******************************************************************************
 * Copyright (c) 2013, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Guy Pelletier, Doug Clarke - initial API and implementation
 ******************************************************************************/
package org.eclipse.persistence.internal.jpa.config.multitenant;

import org.eclipse.persistence.internal.jpa.config.MetadataImpl;
import org.eclipse.persistence.internal.jpa.metadata.multitenant.TenantTableDiscriminatorMetadata;
import org.eclipse.persistence.jpa.config.TenantTableDiscriminator;

/**
 * JPA scripting API implementation.
 *
 * @author Guy Pelletier
 * @since EclipseLink 2.5.1
 */
public class TenantTableDiscriminatorImpl extends MetadataImpl<TenantTableDiscriminatorMetadata> implements TenantTableDiscriminator {

    public TenantTableDiscriminatorImpl() {
        super(new TenantTableDiscriminatorMetadata());
    }

    public TenantTableDiscriminator setContextProperty(String contextProperty) {
        getMetadata().setContextProperty(contextProperty);
        return this;
    }

    public TenantTableDiscriminator setType(String type) {
        getMetadata().setType(type);
        return this;
    }

}
