/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class SwitchPortSpanningTreeStatistics as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the SwitchPortSpanningTreeStatisticsBean Interface. The CIM class
 * SwitchPortSpanningTreeStatistics is described as follows:
 * 
 * Statistical information regarding a SwitchPort participating in the spanning tree.
 */
public class SwitchPortSpanningTreeStatistics extends
		SAPStatisticalInformation implements Serializable {

	/**
	 * This constructor creates a SwitchPortSpanningTreeStatisticsBeanImpl Class which implements the SwitchPortSpanningTreeStatisticsBean Interface,
	 * and encapsulates the CIM class SwitchPortSpanningTreeStatistics in a Java Bean. The CIM class SwitchPortSpanningTreeStatistics is described as
	 * follows:
	 * 
	 * Statistical information regarding a SwitchPort participating in the spanning tree.
	 */
	public SwitchPortSpanningTreeStatistics() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property forwardTransitions.
	 */
	private long	forwardTransitions;

	/**
	 * This method returns the SwitchPortSpanningTreeStatistics.forwardTransitions property value. This property is described as follows:
	 * 
	 * The number of times the port has transitioned from the Learning state to the Forwarding state.
	 * 
	 * @return long current forwardTransitions property value
	 * @exception Exception
	 */
	public long getForwardTransitions() {

		return this.forwardTransitions;
	} // getForwardTransitions

	/**
	 * This method sets the SwitchPortSpanningTreeStatistics.forwardTransitions property value. This property is described as follows:
	 * 
	 * The number of times the port has transitioned from the Learning state to the Forwarding state.
	 * 
	 * @param long new forwardTransitions property value
	 * @exception Exception
	 */
	public void setForwardTransitions(long forwardTransitions) {

		this.forwardTransitions = forwardTransitions;
	} // setForwardTransitions

} // Class SwitchPortSpanningTreeStatistics
