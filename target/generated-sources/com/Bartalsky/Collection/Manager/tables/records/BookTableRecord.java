/*
 * This file is generated by jOOQ.
 */
package com.Bartalsky.Collection.Manager.tables.records;


import com.Bartalsky.Collection.Manager.tables.BookTable;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class BookTableRecord extends TableRecordImpl<BookTableRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>Book_Table.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Book_Table.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Book_Table.Buch</code>.
     */
    public void setBuch(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Book_Table.Buch</code>.
     */
    public String getBuch() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Book_Table.Ort</code>.
     */
    public void setOrt(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Book_Table.Ort</code>.
     */
    public String getOrt() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Book_Table.Verlag</code>.
     */
    public void setVerlag(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Book_Table.Verlag</code>.
     */
    public String getVerlag() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return BookTable.BOOK_TABLE.ID;
    }

    @Override
    public Field<String> field2() {
        return BookTable.BOOK_TABLE.BUCH;
    }

    @Override
    public Field<String> field3() {
        return BookTable.BOOK_TABLE.ORT;
    }

    @Override
    public Field<String> field4() {
        return BookTable.BOOK_TABLE.VERLAG;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getBuch();
    }

    @Override
    public String component3() {
        return getOrt();
    }

    @Override
    public String component4() {
        return getVerlag();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getBuch();
    }

    @Override
    public String value3() {
        return getOrt();
    }

    @Override
    public String value4() {
        return getVerlag();
    }

    @Override
    public BookTableRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BookTableRecord value2(String value) {
        setBuch(value);
        return this;
    }

    @Override
    public BookTableRecord value3(String value) {
        setOrt(value);
        return this;
    }

    @Override
    public BookTableRecord value4(String value) {
        setVerlag(value);
        return this;
    }

    @Override
    public BookTableRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookTableRecord
     */
    public BookTableRecord() {
        super(BookTable.BOOK_TABLE);
    }

    /**
     * Create a detached, initialised BookTableRecord
     */
    public BookTableRecord(Integer id, String buch, String ort, String verlag) {
        super(BookTable.BOOK_TABLE);

        setId(id);
        setBuch(buch);
        setOrt(ort);
        setVerlag(verlag);
        resetChangedOnNotNull();
    }
}
