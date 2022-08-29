// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2022-08-02
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "insert-sheet" collection as defined in:
 * [PWG5100.3](https://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf),
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
@Suppress("RedundantCompanionReference", "unused")
data class InsertSheet
constructor(
    var insertAfterPageNumber: Int? = null,
    var insertCount: Int? = null,
    /** May contain any keyword from [Media] or a name. */
    var media: KeywordOrName? = null,
    var mediaCol: MediaCol? = null,
) : AttributeCollection {

    /** Construct an empty [InsertSheet]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            insertAfterPageNumber?.let { InsertSheet.insertAfterPageNumber.of(it) },
            insertCount?.let { InsertSheet.insertCount.of(it) },
            media?.let { InsertSheet.media.of(it) },
            mediaCol?.let { InsertSheet.mediaCol.of(it) },
        )

    /** Defines types for each member of [InsertSheet]. */
    companion object : AttributeCollection.Converter<InsertSheet> {
        override fun convert(attributes: List<Attribute<*>>): InsertSheet =
            InsertSheet(
                extractOne(attributes, insertAfterPageNumber),
                extractOne(attributes, insertCount),
                extractOne(attributes, media),
                extractOne(attributes, mediaCol),
            )
        override val cls = InsertSheet::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val insertAfterPageNumber = IntType("insert-after-page-number")
        @JvmField val insertCount = IntType("insert-count")
        @JvmField val media = KeywordOrNameType("media")
        @JvmField val mediaCol = AttributeCollection.Type("media-col", MediaCol)
    }
    override fun toString() = "InsertSheet(${attributes.joinToString()})"
}
