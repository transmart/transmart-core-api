package org.transmartproject.core.dataquery.highdim.tworegion

/**
 * Represents metadata about one event, possibly linking to multiple junctions
 */
interface EventValues {
    String getCgaType()
    String getSoapClass()
    JunctionInEventValues[] getJunctions()
}
