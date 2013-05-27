/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ServiceAccessURI as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the ServiceAccessURIBean Interface. The CIM class ServiceAccessURI is described as
 * follows:
 * 
 * CIM_ServiceAccessURI represents the ability to utilize or invoke a Service using a uniform resource identifier (URI). RFC 1738 describes the
 * Uniform Resource Locator, which is a more specific form of a URI, and RFC 2396 describes the broader, inclusive URI. The following explanation is
 * from the RFC: "A Uniform Resource Identifier (URI) is a compact string of characters for identifying an abstract or physical resource." In the
 * context of a ServiceAccessPoint, a URI contains the information necessary to access an associated service (associated through ServiceAccessBySAP),
 * using a syntax that is specific to that service.
 */
public class ServiceAccessURI extends ServiceAccessPoint implements
		Serializable {

	/**
	 * This constructor creates a ServiceAccessURIBeanImpl Class which implements the ServiceAccessURIBean Interface, and encapsulates the CIM class
	 * ServiceAccessURI in a Java Bean. The CIM class ServiceAccessURI is described as follows:
	 * 
	 * CIM_ServiceAccessURI represents the ability to utilize or invoke a Service using a uniform resource identifier (URI). RFC 1738 describes the
	 * Uniform Resource Locator, which is a more specific form of a URI, and RFC 2396 describes the broader, inclusive URI. The following explanation
	 * is from the RFC: "A Uniform Resource Identifier (URI) is a compact string of characters for identifying an abstract or physical resource." In
	 * the context of a ServiceAccessPoint, a URI contains the information necessary to access an associated service (associated through
	 * ServiceAccessBySAP), using a syntax that is specific to that service.
	 */
	public ServiceAccessURI() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property labeledURI.
	 */
	private String	labeledURI;

	/**
	 * This method returns the ServiceAccessURI.labeledURI property value. This property is described as follows:
	 * 
	 * The LabeledURI property is based on RFC 2079 and its value and syntax are service-specific.
	 * 
	 * @return String current labeledURI property value
	 * @exception Exception
	 */
	public String getLabeledURI() {

		return this.labeledURI;
	} // getLabeledURI

	/**
	 * This method sets the ServiceAccessURI.labeledURI property value. This property is described as follows:
	 * 
	 * The LabeledURI property is based on RFC 2079 and its value and syntax are service-specific.
	 * 
	 * @param String
	 *            new labeledURI property value
	 * @exception Exception
	 */
	public void setLabeledURI(String labeledURI) {

		this.labeledURI = labeledURI;
	} // setLabeledURI

} // Class ServiceAccessURI
