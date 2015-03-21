
package com.kss.social.adapters;

import org.mule.api.Capabilities;
import org.mule.api.Capability;


/**
 * A <code>FoursquareConnectorCapabilitiesAdapter</code> is a wrapper around {@link com.kss.social.FoursquareConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
public class FoursquareConnectorCapabilitiesAdapter
    extends com.kss.social.FoursquareConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        if (capability == Capability.CONNECTION_MANAGEMENT_CAPABLE) {
            return true;
        }
        return false;
    }

}
