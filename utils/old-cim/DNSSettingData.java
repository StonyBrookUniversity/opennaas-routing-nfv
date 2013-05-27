/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class DNSSettingData as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the DNSSettingDataBean Interface. The CIM class DNSSettingData is described as follows:
 * 
 * DNSSettingData defines the DNSconfiguration settings for a single IP network connection. With the exception of the the DNSServerAddresses and the
 * hostname in use, the configuration of a DNSProtocolEndpoint is indicated by the properties of an associated instance of DNSSettingData.
 */
public class DNSSettingData extends IPAssignmentSettingData implements
		Serializable {

	/**
	 * This constructor creates a DNSSettingDataBeanImpl Class which implements the DNSSettingDataBean Interface, and encapsulates the CIM class
	 * DNSSettingData in a Java Bean. The CIM class DNSSettingData is described as follows:
	 * 
	 * DNSSettingData defines the DNSconfiguration settings for a single IP network connection. With the exception of the the DNSServerAddresses and
	 * the hostname in use, the configuration of a DNSProtocolEndpoint is indicated by the properties of an associated instance of DNSSettingData.
	 */
	public DNSSettingData() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property domainName.
	 */
	private String	domainName;

	/**
	 * This method returns the DNSSettingData.domainName property value. This property is described as follows:
	 * 
	 * The domain to use for this client connection.
	 * 
	 * @return String current domainName property value
	 * @exception Exception
	 */
	public String getDomainName() {

		return this.domainName;
	} // getDomainName

	/**
	 * This method sets the DNSSettingData.domainName property value. This property is described as follows:
	 * 
	 * The domain to use for this client connection.
	 * 
	 * @param String
	 *            new domainName property value
	 * @exception Exception
	 */
	public void setDomainName(String domainName) {

		this.domainName = domainName;
	} // setDomainName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property requestedHostname.
	 */
	private String	requestedHostname;

	/**
	 * This method returns the DNSSettingData.requestedHostname property value. This property is described as follows:
	 * 
	 * The Hostname requested for this client connection.
	 * 
	 * @return String current requestedHostname property value
	 * @exception Exception
	 */
	public String getRequestedHostname() {

		return this.requestedHostname;
	} // getRequestedHostname

	/**
	 * This method sets the DNSSettingData.requestedHostname property value. This property is described as follows:
	 * 
	 * The Hostname requested for this client connection.
	 * 
	 * @param String
	 *            new requestedHostname property value
	 * @exception Exception
	 */
	public void setRequestedHostname(String requestedHostname) {

		this.requestedHostname = requestedHostname;
	} // setRequestedHostname

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property useSuffixWhenRegistering.
	 */
	private boolean	useSuffixWhenRegistering;

	/**
	 * This method returns the DNSSettingData.useSuffixWhenRegistering property value. This property is described as follows:
	 * 
	 * Whether or not the suffix should be appended before registering the client name with the DNS server.
	 * 
	 * @return boolean current useSuffixWhenRegistering property value
	 * @exception Exception
	 */
	public boolean isUseSuffixWhenRegistering() {

		return this.useSuffixWhenRegistering;
	} // getUseSuffixWhenRegistering

	/**
	 * This method sets the DNSSettingData.useSuffixWhenRegistering property value. This property is described as follows:
	 * 
	 * Whether or not the suffix should be appended before registering the client name with the DNS server.
	 * 
	 * @param boolean new useSuffixWhenRegistering property value
	 * @exception Exception
	 */
	public void setUseSuffixWhenRegistering(boolean useSuffixWhenRegistering)
	{

		this.useSuffixWhenRegistering = useSuffixWhenRegistering;
	} // setUseSuffixWhenRegistering

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property registerThisConnectionsAddress.
	 */
	private boolean	registerThisConnectionsAddress;

	/**
	 * This method returns the DNSSettingData.registerThisConnectionsAddress property value. This property is described as follows:
	 * 
	 * Whether or not this connection's address should be registered in DNS.
	 * 
	 * @return boolean current registerThisConnectionsAddress property value
	 * @exception Exception
	 */
	public boolean isRegisterThisConnectionsAddress() {

		return this.registerThisConnectionsAddress;
	} // getRegisterThisConnectionsAddress

	/**
	 * This method sets the DNSSettingData.registerThisConnectionsAddress property value. This property is described as follows:
	 * 
	 * Whether or not this connection's address should be registered in DNS.
	 * 
	 * @param boolean new registerThisConnectionsAddress property value
	 * @exception Exception
	 */
	public void setRegisterThisConnectionsAddress(boolean
			registerThisConnectionsAddress) {

		this.registerThisConnectionsAddress = registerThisConnectionsAddress;
	} // setRegisterThisConnectionsAddress

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property dNSServerAddresses.
	 */
	private String[]	dNSServerAddresses;

	/**
	 * This method returns the DNSSettingData.dNSServerAddresses property value. This property is described as follows:
	 * 
	 * The DNS servers to contact. The array ordering correlates to the order in which the DNS servers will be contacted. The
	 * RemoteServiceAccessPoints associated with the DNSProtocolEndpoint with the value of the AccessContext property being "DNS Server" represent the
	 * actual DNS Servers being utilized by the DNS client.
	 * 
	 * @return String[] current dNSServerAddresses property value
	 * @exception Exception
	 */
	public String[] getDNSServerAddresses() {

		return this.dNSServerAddresses;
	} // getDNSServerAddresses

	/**
	 * This method sets the DNSSettingData.dNSServerAddresses property value. This property is described as follows:
	 * 
	 * The DNS servers to contact. The array ordering correlates to the order in which the DNS servers will be contacted. The
	 * RemoteServiceAccessPoints associated with the DNSProtocolEndpoint with the value of the AccessContext property being "DNS Server" represent the
	 * actual DNS Servers being utilized by the DNS client.
	 * 
	 * @param String
	 *            [] new dNSServerAddresses property value
	 * @exception Exception
	 */
	public void setDNSServerAddresses(String[] dNSServerAddresses) {

		this.dNSServerAddresses = dNSServerAddresses;
	} // setDNSServerAddresses

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property DHCPOptionsToUse.
	 */

	public enum DHCPOptionsToUse {
		DOMAIN_NAME_SERVER,
		HOST_NAME,
		DOMAIN_NAME,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private DHCPOptionsToUse	dHCPOptionsToUse;

	/**
	 * This method returns the DNSSettingData.dHCPOptionsToUse property value. This property is described as follows:
	 * 
	 * One or more DHCP options that the DNS client should utilise if they are returned during a DHCP bind operation.
	 * 
	 * @return int current dHCPOptionsToUse property value
	 * @exception Exception
	 */
	public DHCPOptionsToUse getDHCPOptionsToUse() {

		return this.dHCPOptionsToUse;
	} // getDHCPOptionsToUse

	/**
	 * This method sets the DNSSettingData.dHCPOptionsToUse property value. This property is described as follows:
	 * 
	 * One or more DHCP options that the DNS client should utilise if they are returned during a DHCP bind operation.
	 * 
	 * @param int new dHCPOptionsToUse property value
	 * @exception Exception
	 */
	public void setDHCPOptionsToUse(DHCPOptionsToUse dHCPOptionsToUse) {

		this.dHCPOptionsToUse = dHCPOptionsToUse;
	} // setDHCPOptionsToUse

} // Class DNSSettingData
