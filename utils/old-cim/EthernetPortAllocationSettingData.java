/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class EthernetPortAllocationSettingData as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the EthernetPortAllocationSettingDataBean Interface. The CIM class
 * EthernetPortAllocationSettingData is described as follows:
 * 
 * The EthernetPortAllocationSettingData class represents settings specifically related to the allocation of an EthernetPort that are outside the
 * scope of the EthernetPort CIM class itselfThese settings are used to provide information specific to the resource itself.
 */
public class EthernetPortAllocationSettingData extends
		ResourceAllocationSettingData implements Serializable {

	/**
	 * This constructor creates a EthernetPortAllocationSettingDataBeanImpl Class which implements the EthernetPortAllocationSettingDataBean
	 * Interface, and encapsulates the CIM class EthernetPortAllocationSettingData in a Java Bean. The CIM class EthernetPortAllocationSettingData is
	 * described as follows:
	 * 
	 * The EthernetPortAllocationSettingData class represents settings specifically related to the allocation of an EthernetPort that are outside the
	 * scope of the EthernetPort CIM class itselfThese settings are used to provide information specific to the resource itself.
	 */
	public EthernetPortAllocationSettingData() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property DesiredVLANEndpointMode.
	 */

	public enum DesiredVLANEndpointMode {
		DMTF_RESERVED,
		OTHER,
		ACCESS,
		DYNAMIC_AUTO,
		DYNAMIC_DESIRABLE,
		TRUNK,
		DOT1Q_TUNNEL,
		DMTF_RESERVED1,
		VENDOR_RESERVED
	}

	private DesiredVLANEndpointMode	desiredVLANEndpointMode;

	/**
	 * This method returns the EthernetPortAllocationSettingData.desiredVLANEndpointMode property value. This property is described as follows:
	 * 
	 * The desired VLAN mode that is requested for use. This property is usedto set the initial OperationalEndpointMode property value in theinstance
	 * of CIM_VLANEndpoint associated with the targeted Ethernet Port.Refer to the description for the property OperationalEndpointMode
	 * inCIM_VLANEndpoint for a description of the values
	 * 
	 * @return int current desiredVLANEndpointMode property value
	 * @exception Exception
	 */
	public DesiredVLANEndpointMode getDesiredVLANEndpointMode() {

		return this.desiredVLANEndpointMode;
	} // getDesiredVLANEndpointMode

	/**
	 * This method sets the EthernetPortAllocationSettingData.desiredVLANEndpointMode property value. This property is described as follows:
	 * 
	 * The desired VLAN mode that is requested for use. This property is usedto set the initial OperationalEndpointMode property value in theinstance
	 * of CIM_VLANEndpoint associated with the targeted Ethernet Port.Refer to the description for the property OperationalEndpointMode
	 * inCIM_VLANEndpoint for a description of the values
	 * 
	 * @param int new desiredVLANEndpointMode property value
	 * @exception Exception
	 */
	public void setDesiredVLANEndpointMode(DesiredVLANEndpointMode
			desiredVLANEndpointMode) {

		this.desiredVLANEndpointMode = desiredVLANEndpointMode;
	} // setDesiredVLANEndpointMode

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherEndpointMode.
	 */
	private String	otherEndpointMode;

	/**
	 * This method returns the EthernetPortAllocationSettingData.otherEndpointMode property value. This property is described as follows:
	 * 
	 * A string describing the type of VLAN endpoint model that is supported by this VLANEndpoint, when the value of the mode property is set to 1
	 * (i.e., "Other"). This property should be set to NULL when the mode property is any value other than 1.
	 * 
	 * @return String current otherEndpointMode property value
	 * @exception Exception
	 */
	public String getOtherEndpointMode() {

		return this.otherEndpointMode;
	} // getOtherEndpointMode

	/**
	 * This method sets the EthernetPortAllocationSettingData.otherEndpointMode property value. This property is described as follows:
	 * 
	 * A string describing the type of VLAN endpoint model that is supported by this VLANEndpoint, when the value of the mode property is set to 1
	 * (i.e., "Other"). This property should be set to NULL when the mode property is any value other than 1.
	 * 
	 * @param String
	 *            new otherEndpointMode property value
	 * @exception Exception
	 */
	public void setOtherEndpointMode(String otherEndpointMode) {

		this.otherEndpointMode = otherEndpointMode;
	} // setOtherEndpointMode

} // Class EthernetPortAllocationSettingData
