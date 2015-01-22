package org.transmartproject.core.dataquery.highdim.tworegion

/**
 * Represents metadata about one junction as part of an event of a two region variant
 */
interface JunctionInEventValues {
    JunctionValues getJunction()
    int getReadsSpan()
    int getReadsJunction()
    int getPairsSpan()
    int getPairsJunction()
    int getPairsEnd()
    int getPairsCounter()
    double getBaseFreq()
}
