/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ResourceAllocationFromPool as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the ResourceAllocationFromPoolBean Interface. The CIM class
 * ResourceAllocationFromPool is described as follows:
 * 
 * ResourceAllocationFromPool associates an instance of CIM_ResourceAllocationSettingData representing a resource allocation with the CIM_ResourcePool
 * from which it is allocated.
 */
public class ResourceAllocationFromPool extends Dependency implements
		Serializable {

	/**
	 * This constructor creates a ResourceAllocationFromPoolBeanImpl Class which implements the ResourceAllocationFromPoolBean Interface, and
	 * encapsulates the CIM class ResourceAllocationFromPool in a Java Bean. The CIM class ResourceAllocationFromPool is described as follows:
	 * 
	 * ResourceAllocationFromPool associates an instance of CIM_ResourceAllocationSettingData representing a resource allocation with the
	 * CIM_ResourcePool from which it is allocated.
	 */
	public ResourceAllocationFromPool() {
	};

	/**
	 * This method create an Association of the type ResourceAllocationFromPool between one ResourcePool object and ResourceAllocationSettingData
	 * object
	 */
	public static ResourceAllocationFromPool link(ResourcePool
			antecedent, ResourceAllocationSettingData dependent) {

		return (ResourceAllocationFromPool) Association.link(ResourceAllocationFromPool.class, antecedent, dependent);
	}// link

} // Class ResourceAllocationFromPool
