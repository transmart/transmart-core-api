package org.transmartproject.core.ontology

/**
 * A modifier is an ontology term that qualifies other ontology terms.
 *
 * This class pairs a modifier with another {@link OntologyTerm} being
 * modified.
 */
interface BoundModifier extends OntologyTerm {

    /**
     * The applied path is the full name or full name SQL LIKE pattern of the
     * ontology terms in the same ontology table that this modifier qualifies
     * (there may be exclusions futher down). The modifier is uniquely
     * identified by its key and applied path; the key alone is insufficient.
     *
     * @return the applied path for the modifier.
     */
    String getAppliedPath()

    /**
     * The {@link OntologyTerm} qualified by this modified. Cannot be null.
     *
     * @return the modified term.
     */
    OntologyTerm getQualifiedTerm()
}
