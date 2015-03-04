package org.transmartproject.core.biomarker

/**
 * Measurable indicator of some biological state or condition
 */
interface ChromosomalBioMarker extends BioMarker {

    /**
     * @return genome build.
     * e.g. hg18, hg19
     */
    String getGenomeBuild()

    /**
     * @return chromosome number/name
     */
    String getChromosome()

    /**
     * @return the base pair number that identifies the starting position for this
     * interval on the chromosome.
     */
    Long getStart()

    /**
     * @return the base pair number that identifies the end position for this
     * interval on the chromosome.
     */
    Long getEnd()

}


