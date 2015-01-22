package org.transmartproject.core.dataquery.highdim.tworegion

/**
 * Represents metadata about one event, possibly linking to multiple junctions
 */
interface EventValues {
    /**
     * deletion, inversion, duplication,... Type from http://cgatools.sourceforge.net/docs/1.8.0/cgatools-command-line-reference.html#junctions2events
     */
    String getCgaType()
    /**
     * inter/intra chromosomal inversion/translocation: http://sourceforge.net/p/soapfuse/wiki/classification-of-fusions.for.SOAPfuse/
     */
    String getSoapClass()
    JunctionInEventValues[] getJunctions()
}
