/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ProtocolService as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the ProtocolServiceBean Interface. The CIM class ProtocolService is described as
 * follows:
 * 
 * ProtocolService represents represents an application layer service available on a hosting system. Often times, the service name reflects the
 * employed/supported communication protocol (e.g. file transfer - FTP), however in some other cases it does not. (e.g. mail notification service -
 * biff). Access to the service is modeled with one or more instances of ProtocolEndpoint. This class represents the availability of the function on
 * the system. Issuing a stop to this instance is equivalent to disabling the functionality and making it unavailable to users. Thus a stop of this
 * service will result in the removing of all ProtocolEndpoints which are associated with the instance via ServicAccessBySAP. The functionality can be
 * made available again by issuing a start to the service. This class contains service definitions which are currently needed. Future extensions are
 * expected.
 */
public class ProtocolService extends Service implements Serializable {

	/**
	 * This constructor creates a ProtocolServiceBeanImpl Class which implements the ProtocolServiceBean Interface, and encapsulates the CIM class
	 * ProtocolService in a Java Bean. The CIM class ProtocolService is described as follows:
	 * 
	 * ProtocolService represents represents an application layer service available on a hosting system. Often times, the service name reflects the
	 * employed/supported communication protocol (e.g. file transfer - FTP), however in some other cases it does not. (e.g. mail notification service
	 * - biff). Access to the service is modeled with one or more instances of ProtocolEndpoint. This class represents the availability of the
	 * function on the system. Issuing a stop to this instance is equivalent to disabling the functionality and making it unavailable to users. Thus a
	 * stop of this service will result in the removing of all ProtocolEndpoints which are associated with the instance via ServicAccessBySAP. The
	 * functionality can be made available again by issuing a start to the service. This class contains service definitions which are currently
	 * needed. Future extensions are expected.
	 */
	public ProtocolService() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property Protocol.
	 */

	public enum Protocol {
		UNKNOWN,
		OTHER,
		SSH,
		TELNET,
		CLP,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private Protocol	protocol;

	/**
	 * This method returns the ProtocolService.protocol property value. This property is described as follows:
	 * 
	 * The protocol this service provides. Values defined for this property are limited to the known use cases where it is desirable to represent the
	 * ability to enable or disable the functionality on the system.
	 * 
	 * @return int current protocol property value
	 * @exception Exception
	 */
	public Protocol getProtocol() {

		return this.protocol;
	} // getProtocol

	/**
	 * This method sets the ProtocolService.protocol property value. This property is described as follows:
	 * 
	 * The protocol this service provides. Values defined for this property are limited to the known use cases where it is desirable to represent the
	 * ability to enable or disable the functionality on the system.
	 * 
	 * @param int new protocol property value
	 * @exception Exception
	 */
	public void setProtocol(Protocol protocol) {

		this.protocol = protocol;
	} // setProtocol

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherProtocol.
	 */
	private String	otherProtocol;

	/**
	 * This method returns the ProtocolService.otherProtocol property value. This property is described as follows:
	 * 
	 * If the Protocol property is set to 1 "Other" then free form string providing more information about the protocol. If not set to 1, this string
	 * has no meaning.
	 * 
	 * @return String current otherProtocol property value
	 * @exception Exception
	 */
	public String getOtherProtocol() {

		return this.otherProtocol;
	} // getOtherProtocol

	/**
	 * This method sets the ProtocolService.otherProtocol property value. This property is described as follows:
	 * 
	 * If the Protocol property is set to 1 "Other" then free form string providing more information about the protocol. If not set to 1, this string
	 * has no meaning.
	 * 
	 * @param String
	 *            new otherProtocol property value
	 * @exception Exception
	 */
	public void setOtherProtocol(String otherProtocol) {

		this.otherProtocol = otherProtocol;
	} // setOtherProtocol

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property maxConnections.
	 */
	private int	maxConnections;

	/**
	 * This method returns the ProtocolService.maxConnections property value. This property is described as follows:
	 * 
	 * MaxConnections specifies the maximum number of connections currently allowed by the service. The values 32768..65535 are DMTF Reserved.
	 * 
	 * @return int current maxConnections property value
	 * @exception Exception
	 */
	public int getMaxConnections() {

		return this.maxConnections;
	} // getMaxConnections

	/**
	 * This method sets the ProtocolService.maxConnections property value. This property is described as follows:
	 * 
	 * MaxConnections specifies the maximum number of connections currently allowed by the service. The values 32768..65535 are DMTF Reserved.
	 * 
	 * @param int new maxConnections property value
	 * @exception Exception
	 */
	public void setMaxConnections(int maxConnections) {

		this.maxConnections = maxConnections;
	} // setMaxConnections

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property currentActiveConnections.
	 */
	private int	currentActiveConnections;

	/**
	 * This method returns the ProtocolService.currentActiveConnections property value. This property is described as follows:
	 * 
	 * CurrentActiveConnections indicates the number of sessions currently established with the protocol service. A value of null for this property
	 * shall indicate the number of active sessions is unknown. A value of zero shall indicate there are no active sessions. Any other value shall
	 * correspond to the number of active sessions.
	 * 
	 * @return int current currentActiveConnections property value
	 * @exception Exception
	 */
	public int getCurrentActiveConnections() {

		return this.currentActiveConnections;
	} // getCurrentActiveConnections

	/**
	 * This method sets the ProtocolService.currentActiveConnections property value. This property is described as follows:
	 * 
	 * CurrentActiveConnections indicates the number of sessions currently established with the protocol service. A value of null for this property
	 * shall indicate the number of active sessions is unknown. A value of zero shall indicate there are no active sessions. Any other value shall
	 * correspond to the number of active sessions.
	 * 
	 * @param int new currentActiveConnections property value
	 * @exception Exception
	 */
	public void setCurrentActiveConnections(int currentActiveConnections) {

		this.currentActiveConnections = currentActiveConnections;
	} // setCurrentActiveConnections

} // Class ProtocolService
