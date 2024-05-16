/*
 * This file is generated by jOOQ.
 */
package com.Bartalsky.Collection.Manager.tables;


import com.Bartalsky.Collection.Manager.DefaultSchema;
import com.Bartalsky.Collection.Manager.Indexes;
import com.Bartalsky.Collection.Manager.tables.records.ComicTableRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ComicTable extends TableImpl<ComicTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>Comic_Table</code>
     */
    public static final ComicTable COMIC_TABLE = new ComicTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ComicTableRecord> getRecordType() {
        return ComicTableRecord.class;
    }

    /**
     * The column <code>Comic_Table.ID</code>.
     */
    public final TableField<ComicTableRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.identity(true), this, "");

    /**
     * The column <code>Comic_Table.Comic</code>.
     */
    public final TableField<ComicTableRecord, String> COMIC = createField(DSL.name("Comic"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Comic_Table.Nummer</code>.
     */
    public final TableField<ComicTableRecord, String> NUMMER = createField(DSL.name("Nummer"), SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'Einzelband'"), SQLDataType.CLOB)), this, "");

    /**
     * The column <code>Comic_Table.Verpackung</code>.
     */
    public final TableField<ComicTableRecord, String> VERPACKUNG = createField(DSL.name("Verpackung"), SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'Offen'"), SQLDataType.CLOB)), this, "");

    /**
     * The column <code>Comic_Table.Kiste</code>.
     */
    public final TableField<ComicTableRecord, String> KISTE = createField(DSL.name("Kiste"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Comic_Table.Doppelt</code>.
     */
    public final TableField<ComicTableRecord, String> DOPPELT = createField(DSL.name("Doppelt"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>Comic_Table.Verlag</code>.
     */
    public final TableField<ComicTableRecord, String> VERLAG = createField(DSL.name("Verlag"), SQLDataType.CLOB, this, "");

    private ComicTable(Name alias, Table<ComicTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private ComicTable(Name alias, Table<ComicTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>Comic_Table</code> table reference
     */
    public ComicTable(String alias) {
        this(DSL.name(alias), COMIC_TABLE);
    }

    /**
     * Create an aliased <code>Comic_Table</code> table reference
     */
    public ComicTable(Name alias) {
        this(alias, COMIC_TABLE);
    }

    /**
     * Create a <code>Comic_Table</code> table reference
     */
    public ComicTable() {
        this(DSL.name("Comic_Table"), null);
    }

    public <O extends Record> ComicTable(Table<O> child, ForeignKey<O, ComicTableRecord> key) {
        super(child, key, COMIC_TABLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.COMIC_INDEX);
    }

    @Override
    public Identity<ComicTableRecord, Integer> getIdentity() {
        return (Identity<ComicTableRecord, Integer>) super.getIdentity();
    }

    @Override
    public ComicTable as(String alias) {
        return new ComicTable(DSL.name(alias), this);
    }

    @Override
    public ComicTable as(Name alias) {
        return new ComicTable(alias, this);
    }

    @Override
    public ComicTable as(Table<?> alias) {
        return new ComicTable(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ComicTable rename(String name) {
        return new ComicTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ComicTable rename(Name name) {
        return new ComicTable(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ComicTable rename(Table<?> name) {
        return new ComicTable(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
