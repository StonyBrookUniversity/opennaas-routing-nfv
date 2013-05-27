/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class TokenBucketMeterService as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the TokenBucketMeterServiceBean Interface. The CIM class TokenBucketMeterService
 * is described as follows:
 * 
 * This is a concrete subclass of the MeterService class that represents the metering of network traffic using a token bucket meter. Two types of
 * token bucket meters are defined using this class - a simple, two-parameter bucket meter, and a multi-stage meter. A simple token bucket usually has
 * two parameters, an average token rate and a burst size, and has two conformance levels: 'conforming' and 'non-conforming'. This class also defines
 * an excess burst size, which enables the meter to have three conformance levels ('conforming', 'partially conforming', and 'non-conforming'). In
 * this case, packets that exceed the excess burst size are deemed non-conforming, while packets that exceed the smaller burst size but are less than
 * the excess burst size are deemed partially conforming.
 */
public class TokenBucketMeterService extends MeterService implements
		Serializable {

	/**
	 * This constructor creates a TokenBucketMeterServiceBeanImpl Class which implements the TokenBucketMeterServiceBean Interface, and encapsulates
	 * the CIM class TokenBucketMeterService in a Java Bean. The CIM class TokenBucketMeterService is described as follows:
	 * 
	 * This is a concrete subclass of the MeterService class that represents the metering of network traffic using a token bucket meter. Two types of
	 * token bucket meters are defined using this class - a simple, two-parameter bucket meter, and a multi-stage meter. A simple token bucket usually
	 * has two parameters, an average token rate and a burst size, and has two conformance levels: 'conforming' and 'non-conforming'. This class also
	 * defines an excess burst size, which enables the meter to have three conformance levels ('conforming', 'partially conforming', and
	 * 'non-conforming'). In this case, packets that exceed the excess burst size are deemed non-conforming, while packets that exceed the smaller
	 * burst size but are less than the excess burst size are deemed partially conforming.
	 */
	public TokenBucketMeterService() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property averageRate.
	 */
	private long	averageRate;

	/**
	 * This method returns the TokenBucketMeterService.averageRate property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer that is used to define the committed rate of the meter. The value is expressed in kilobits per
	 * second.
	 * 
	 * @return long current averageRate property value
	 * @exception Exception
	 */
	public long getAverageRate() {

		return this.averageRate;
	} // getAverageRate

	/**
	 * This method sets the TokenBucketMeterService.averageRate property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer that is used to define the committed rate of the meter. The value is expressed in kilobits per
	 * second.
	 * 
	 * @param long new averageRate property value
	 * @exception Exception
	 */
	public void setAverageRate(long averageRate) {

		this.averageRate = averageRate;
	} // setAverageRate

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property peakRate.
	 */
	private long	peakRate;

	/**
	 * This method returns the TokenBucketMeterService.peakRate property value. This property is described as follows:
	 * 
	 * This attribute is a 32-bit unsigned integer that is used to define the peak rate of the meter. The value is expressed in kilobits per second.
	 * 
	 * @return long current peakRate property value
	 * @exception Exception
	 */
	public long getPeakRate() {

		return this.peakRate;
	} // getPeakRate

	/**
	 * This method sets the TokenBucketMeterService.peakRate property value. This property is described as follows:
	 * 
	 * This attribute is a 32-bit unsigned integer that is used to define the peak rate of the meter. The value is expressed in kilobits per second.
	 * 
	 * @param long new peakRate property value
	 * @exception Exception
	 */
	public void setPeakRate(long peakRate) {

		this.peakRate = peakRate;
	} // setPeakRate

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property burstSize.
	 */
	private long	burstSize;

	/**
	 * This method returns the TokenBucketMeterService.burstSize property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer that is used to define the maximum number of tokens available for the committed rate (specified by
	 * the AverageRate property). The value is specified in kilobytes.
	 * 
	 * @return long current burstSize property value
	 * @exception Exception
	 */
	public long getBurstSize() {

		return this.burstSize;
	} // getBurstSize

	/**
	 * This method sets the TokenBucketMeterService.burstSize property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer that is used to define the maximum number of tokens available for the committed rate (specified by
	 * the AverageRate property). The value is specified in kilobytes.
	 * 
	 * @param long new burstSize property value
	 * @exception Exception
	 */
	public void setBurstSize(long burstSize) {

		this.burstSize = burstSize;
	} // setBurstSize

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property excessBurstSize.
	 */
	private long	excessBurstSize;

	/**
	 * This method returns the TokenBucketMeterService.excessBurstSize property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer that is used to define the maximum number of tokens available for the peak rate (specified by the
	 * PeakRate property). The value is specified in kilobytes.
	 * 
	 * @return long current excessBurstSize property value
	 * @exception Exception
	 */
	public long getExcessBurstSize() {

		return this.excessBurstSize;
	} // getExcessBurstSize

	/**
	 * This method sets the TokenBucketMeterService.excessBurstSize property value. This property is described as follows:
	 * 
	 * This property is a 32-bit unsigned integer that is used to define the maximum number of tokens available for the peak rate (specified by the
	 * PeakRate property). The value is specified in kilobytes.
	 * 
	 * @param long new excessBurstSize property value
	 * @exception Exception
	 */
	public void setExcessBurstSize(long excessBurstSize) {

		this.excessBurstSize = excessBurstSize;
	} // setExcessBurstSize

} // Class TokenBucketMeterService
