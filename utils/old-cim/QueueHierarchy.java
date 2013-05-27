/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class QueueHierarchy as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the QueueHierarchyBean Interface. The CIM class QueueHierarchy is described as follows:
 * 
 * Describes the reliance of a QueuingService on other, supporting queues and their QueuingServices. A given Service can only act in support of one
 * QueuingService; but a higher level queue may be supported by many lower level QueuingServices. The class is deprecated since a queue only stores
 * network traffic. It does not support other queues, or manipulate their entries. This type of processing is described using NextService associations
 * 'rightwards' from the QueuingService. These associations reference 'other' ConditioningServices that may send traffic to 'other' queues).
 */
@Deprecated
public class QueueHierarchy extends ServiceServiceDependency implements
		Serializable {

	/**
	 * This constructor creates a QueueHierarchyBeanImpl Class which implements the QueueHierarchyBean Interface, and encapsulates the CIM class
	 * QueueHierarchy in a Java Bean. The CIM class QueueHierarchy is described as follows:
	 * 
	 * Describes the reliance of a QueuingService on other, supporting queues and their QueuingServices. A given Service can only act in support of
	 * one QueuingService; but a higher level queue may be supported by many lower level QueuingServices. The class is deprecated since a queue only
	 * stores network traffic. It does not support other queues, or manipulate their entries. This type of processing is described using NextService
	 * associations 'rightwards' from the QueuingService. These associations reference 'other' ConditioningServices that may send traffic to 'other'
	 * queues).
	 */
	public QueueHierarchy() {
	};

	/**
	 * This method create an Association of the type QueueHierarchy between one QueuingService object and QueuingService object
	 */
	@Deprecated
	public static QueueHierarchy link(QueuingService antecedent, QueuingService
			dependent) {

		return (QueueHierarchy) Association.link(QueueHierarchy.class, antecedent, dependent);
	}// link

} // Class QueueHierarchy
