package org.transmartproject.core.dataquery.highdim.tworegion

/**
 * Created by j.hudecek on 21-1-2015.
 */
interface GenesInEventValues {
    long getId()
    /**
     * HUGO gene identifier
     */
    String getGeneId()
    /**
     * effect of the event on the gene: FUSION, CONTAINED, DISRUPTED, ...  (from CGA)
     */
    String getEffect()
    long getEventId()
}
