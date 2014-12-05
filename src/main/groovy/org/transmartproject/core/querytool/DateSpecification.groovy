package org.transmartproject.core.querytool

import groovy.transform.Immutable

/**
 * Specifies a date interval bound.
 */
@Immutable
class DateSpecification {
    boolean inclusive = true
    DateColumn dateColumn = DateColumn.START_DATE
    Calendar date

    static enum DateColumn {
        START_DATE,
        END_DATE
    }
}
