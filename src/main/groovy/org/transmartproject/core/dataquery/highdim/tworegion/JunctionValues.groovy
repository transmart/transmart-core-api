package org.transmartproject.core.dataquery.highdim.tworegion

/**
 * Represents metadata about one junction of a two region variant
 */
interface JunctionValues {
    long getUpEnd()
    String getUpChromosome()
    long getUpPos()
    char getUpStrand()
    long getDownEnd()
    String getDownChromosome()
    long getDownPos()
    char getDownStrand()
    boolean getIsInFrame()
}
