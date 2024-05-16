/*
 * This file is generated by jOOQ.
 */
package com.Bartalsky.Collection.Manager.tables;


import com.Bartalsky.Collection.Manager.DefaultSchema;
import com.Bartalsky.Collection.Manager.tables.records.ComicTableFtsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
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
public class ComicTableFts extends TableImpl<ComicTableFtsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>Comic_Table_fts</code>
     */
    public static final ComicTableFts COMIC_TABLE_FTS = new ComicTableFts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ComicTableFtsRecord> getRecordType() {
        return ComicTableFtsRecord.class;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<ComicTableFtsRecord, Object> COMIC_ID = createField(DSL.name("Comic_ID"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<ComicTableFtsRecord, Object> COMIC_TITLE = createField(DSL.name("Comic_Title"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<ComicTableFtsRecord, Object> COMIC_NUMMER = createField(DSL.name("Comic_Nummer"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<ComicTableFtsRecord, Object> COMIC_VERPACKUNG = createField(DSL.name("Comic_Verpackung"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<ComicTableFtsRecord, Object> COMIC_KISTE = createField(DSL.name("Comic_Kiste"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<ComicTableFtsRecord, Object> COMIC_DOPPELT = createField(DSL.name("Comic_Doppelt"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<ComicTableFtsRecord, Object> COMIC_VERLAG = createField(DSL.name("Comic_Verlag"), SQLDataType.OTHER, this, "");

    private ComicTableFts(Name alias, Table<ComicTableFtsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ComicTableFts(Name alias, Table<ComicTableFtsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>Comic_Table_fts</code> table reference
     */
    public ComicTableFts(String alias) {
        this(DSL.name(alias), COMIC_TABLE_FTS);
    }

    /**
     * Create an aliased <code>Comic_Table_fts</code> table reference
     */
    public ComicTableFts(Name alias) {
        this(alias, COMIC_TABLE_FTS);
    }

    /**
     * Create a <code>Comic_Table_fts</code> table reference
     */
    public ComicTableFts() {
        this(DSL.name("Comic_Table_fts"), null);
    }

    public <O extends Record> ComicTableFts(Table<O> child, ForeignKey<O, ComicTableFtsRecord> key) {
        super(child, key, COMIC_TABLE_FTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public ComicTableFts as(String alias) {
        return new ComicTableFts(DSL.name(alias), this);
    }

    @Override
    public ComicTableFts as(Name alias) {
        return new ComicTableFts(alias, this);
    }

    @Override
    public ComicTableFts as(Table<?> alias) {
        return new ComicTableFts(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ComicTableFts rename(String name) {
        return new ComicTableFts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ComicTableFts rename(Name name) {
        return new ComicTableFts(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ComicTableFts rename(Table<?> name) {
        return new ComicTableFts(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Object, Object, Object, Object, Object, Object, Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}