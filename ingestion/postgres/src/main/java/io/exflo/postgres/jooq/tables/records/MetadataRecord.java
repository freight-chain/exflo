/*
 * This file is generated by jOOQ.
 */
package io.exflo.postgres.jooq.tables.records;


import io.exflo.postgres.jooq.tables.Metadata;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MetadataRecord extends UpdatableRecordImpl<MetadataRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1937559132;

    /**
     * Setter for <code>public.metadata.key</code>.
     */
    public MetadataRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.metadata.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.metadata.value</code>.
     */
    public MetadataRecord setValue(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.metadata.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Metadata.METADATA.KEY;
    }

    @Override
    public Field<String> field2() {
        return Metadata.METADATA.VALUE;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getValue();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getValue();
    }

    @Override
    public MetadataRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public MetadataRecord value2(String value) {
        setValue(value);
        return this;
    }

    @Override
    public MetadataRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetadataRecord
     */
    public MetadataRecord() {
        super(Metadata.METADATA);
    }

    /**
     * Create a detached, initialised MetadataRecord
     */
    public MetadataRecord(String key, String value) {
        super(Metadata.METADATA);

        set(0, key);
        set(1, value);
    }
}
