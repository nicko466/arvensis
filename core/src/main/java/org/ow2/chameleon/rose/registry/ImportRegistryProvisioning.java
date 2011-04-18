package org.ow2.chameleon.rose.registry;

import org.osgi.service.remoteserviceadmin.EndpointDescription;

/**
 * This service is useful to provision the Rose ImportRegistry which contains
 * all the {@link EndpointDescription} discovered through various discovery
 * protocol.
 * 
 * @author barjo
 */
public interface ImportRegistryProvisioning {

	void put(EndpointDescription desc);

	boolean remove(EndpointDescription key);

}
