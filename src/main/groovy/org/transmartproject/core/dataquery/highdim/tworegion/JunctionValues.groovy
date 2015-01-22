package org.transmartproject.core.dataquery.highdim.tworegion

/**
 * Represents metadata about one junction of a two region variant
 */
interface JunctionValues {
    /**
     * end of up stream fusion partner
     */
    long getUpEnd()
    /**
     * chromosome of up stream fusion partner
     */
    String getUpChromosome()
    /**
     * location of up stream fusion partner''s junction point
     */
    long getUpPos()
    /**
     * strand of up stream junction, 1 for +, 0 for -
     */
    char getUpStrand()
    /**
     * end of down stream junction
     */
    long getDownEnd()
    /**
     * chromosome of down stream fusion partner
     */
    String getDownChromosome()
    /**
     * location of down stream junction point
     */
    long getDownPos()
    /**
     * strand of down stream junction, 1 for +, 0 for -
     */
    char getDownStrand()
    /**
     * whether junction is frame-shift (false) or in-frame-shift (true)
     */
    boolean getIsInFrame()
}
