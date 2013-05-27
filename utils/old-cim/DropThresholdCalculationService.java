/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class DropThresholdCalculationService as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the DropThresholdCalculationServiceBean Interface. The CIM class
 * DropThresholdCalculationService is described as follows:
 * 
 * This class calculates an average depth for a queue, based on a smoothing weight and a sampling time interval. The latter are properties of this
 * Service, describing how it operates and its necessary parameters. The Service does the calculation on behalf of a RED dropper (as indicated by the
 * association, CalculationServiceForDroppper). A DropThresholdCalculationService is always associated to the single queue that it examines via the
 * Calculation BasedOnQueue relationship.
 */
public class DropThresholdCalculationService extends Service implements
		Serializable {

	/**
	 * This constructor creates a DropThresholdCalculationServiceBeanImpl Class which implements the DropThresholdCalculationServiceBean Interface,
	 * and encapsulates the CIM class DropThresholdCalculationService in a Java Bean. The CIM class DropThresholdCalculationService is described as
	 * follows:
	 * 
	 * This class calculates an average depth for a queue, based on a smoothing weight and a sampling time interval. The latter are properties of this
	 * Service, describing how it operates and its necessary parameters. The Service does the calculation on behalf of a RED dropper (as indicated by
	 * the association, CalculationServiceForDroppper). A DropThresholdCalculationService is always associated to the single queue that it examines
	 * via the Calculation BasedOnQueue relationship.
	 */
	public DropThresholdCalculationService() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property smoothingWeight.
	 */
	private long	smoothingWeight;

	/**
	 * This method returns the DropThresholdCalculationService.smoothingWeight property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer, ranging between 0 and 100,000 - specified in thousandths. It defines the weighting of past history
	 * in affecting the calculation of the current average queue depth. The current queue depth calculation uses the inverse of this value as its
	 * factor, and one minus that inverse as the factor for the historical average. The calculation takes the form: average = (old_average*(1-inverse
	 * of SmoothingWeight)) + (current_queue_depth*inverse of SmoothingWeight) Implementations may choose to limit the acceptable set of values to a
	 * specified set, such as powers of 2.
	 * 
	 * @return long current smoothingWeight property value
	 * @exception Exception
	 */
	public long getSmoothingWeight() {

		return this.smoothingWeight;
	} // getSmoothingWeight

	/**
	 * This method sets the DropThresholdCalculationService.smoothingWeight property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer, ranging between 0 and 100,000 - specified in thousandths. It defines the weighting of past history
	 * in affecting the calculation of the current average queue depth. The current queue depth calculation uses the inverse of this value as its
	 * factor, and one minus that inverse as the factor for the historical average. The calculation takes the form: average = (old_average*(1-inverse
	 * of SmoothingWeight)) + (current_queue_depth*inverse of SmoothingWeight) Implementations may choose to limit the acceptable set of values to a
	 * specified set, such as powers of 2.
	 * 
	 * @param long new smoothingWeight property value
	 * @exception Exception
	 */
	public void setSmoothingWeight(long smoothingWeight) {

		this.smoothingWeight = smoothingWeight;
	} // setSmoothingWeight

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property timeInterval.
	 */
	private long	timeInterval;

	/**
	 * This method returns the DropThresholdCalculationService.timeInterval property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer, and defines the number of nanoseconds between each calculation of average/smoothed queue depth.
	 * When this property is not specified, the CalculationService may determine an appropriate interval.
	 * 
	 * @return long current timeInterval property value
	 * @exception Exception
	 */
	public long getTimeInterval() {

		return this.timeInterval;
	} // getTimeInterval

	/**
	 * This method sets the DropThresholdCalculationService.timeInterval property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer, and defines the number of nanoseconds between each calculation of average/smoothed queue depth.
	 * When this property is not specified, the CalculationService may determine an appropriate interval.
	 * 
	 * @param long new timeInterval property value
	 * @exception Exception
	 */
	public void setTimeInterval(long timeInterval) {

		this.timeInterval = timeInterval;
	} // setTimeInterval

} // Class DropThresholdCalculationService
