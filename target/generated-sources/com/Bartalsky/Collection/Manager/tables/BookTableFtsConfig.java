/*
 * This file is generated by jOOQ.
 */
package com.Bartalsky.Collection.Manager.tables;


import com.Bartalsky.Collection.Manager.DefaultSchema;
import com.Bartalsky.Collection.Manager.tables.records.BookTableFtsConfigRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class BookTableFtsConfig extends TableImpl<BookTableFtsConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>Book_Table_fts_config</code>
     */
    public static final BookTableFtsConfig BOOK_TABLE_FTS_CONFIG = new BookTableFtsConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookTableFtsConfigRecord> getRecordType() {
        return BookTableFtsConfigRecord.class;
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
    public final TableField<BookTableFtsConfigRecord, Object> K = createField(DSL.name("k"), org.jooq.impl.DefaultDataType.getDefaultDataType("").nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<BookTableFtsConfigRecord, Object> V = createField(DSL.name("v"), org.jooq.impl.DefaultDataType.getDefaultDataType(""), this, "");

    private BookTableFtsConfig(Name alias, Table<BookTableFtsConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookTableFtsConfig(Name alias, Table<BookTableFtsConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>Book_Table_fts_config</code> table reference
     */
    public BookTableFtsConfig(String alias) {
        this(DSL.name(alias), BOOK_TABLE_FTS_CONFIG);
    }

    /**
     * Create an aliased <code>Book_Table_fts_config</code> table reference
     */
    public BookTableFtsConfig(Name alias) {
        this(alias, BOOK_TABLE_FTS_CONFIG);
    }

    /**
     * Create a <code>Book_Table_fts_config</code> table reference
     */
    public BookTableFtsConfig() {
        this(DSL.name("Book_Table_fts_config"), null);
    }

    public <O extends Record> BookTableFtsConfig(Table<O> child, ForeignKey<O, BookTableFtsConfigRecord> key) {
        super(child, key, BOOK_TABLE_FTS_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public BookTableFtsConfig as(String alias) {
        return new BookTableFtsConfig(DSL.name(alias), this);
    }

    @Override
    public BookTableFtsConfig as(Name alias) {
        return new BookTableFtsConfig(alias, this);
    }

    @Override
    public BookTableFtsConfig as(Table<?> alias) {
        return new BookTableFtsConfig(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookTableFtsConfig rename(String name) {
        return new BookTableFtsConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookTableFtsConfig rename(Name name) {
        return new BookTableFtsConfig(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookTableFtsConfig rename(Table<?> name) {
        return new BookTableFtsConfig(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Object, Object> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Object, ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Object, ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
