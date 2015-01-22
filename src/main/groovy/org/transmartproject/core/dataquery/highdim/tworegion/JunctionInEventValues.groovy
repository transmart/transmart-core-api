package org.transmartproject.core.dataquery.highdim.tworegion

/**
 * Represents metadata about one junction as part of an event of a two region variant
 */
interface JunctionInEventValues {
    JunctionValues getJunction()
    /**
     * number of reads in the whole span
     */
    int getReadsSpan()
    /**
     * number of reads spanning the junction
     */
    int getReadsJunction()
    /**
     * number of spanning mate pairs
     */
    int getPairsSpan()
    /**
     * number of spanning mate pairs where one end spans a fusion
     */
    int getPairsJunction()
    /**
     * number of mate pairs that support the fusion and whose one end spans the fusion
     */
    int getPairsEnd()
    /**
     * number of reads that contradict the fusion by mapping to only one of the chromosomes
     */
    int getPairsCounter()
    /**
     * frequency in the baseline set of genomes for the junction
     */
    double getBaseFreq()
}
