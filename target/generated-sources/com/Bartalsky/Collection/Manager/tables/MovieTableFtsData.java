/*
 * This file is generated by jOOQ.
 */
package com.Bartalsky.Collection.Manager.tables;


import com.Bartalsky.Collection.Manager.DefaultSchema;
import com.Bartalsky.Collection.Manager.tables.records.MovieTableFtsDataRecord;

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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class MovieTableFtsData extends TableImpl<MovieTableFtsDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>Movie_Table_fts_data</code>
     */
    public static final MovieTableFtsData MOVIE_TABLE_FTS_DATA = new MovieTableFtsData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MovieTableFtsDataRecord> getRecordType() {
        return MovieTableFtsDataRecord.class;
    }

    /**
     * The column <code>Movie_Table_fts_data.id</code>.
     */
    public final TableField<MovieTableFtsDataRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Movie_Table_fts_data.block</code>.
     */
    public final TableField<MovieTableFtsDataRecord, byte[]> BLOCK = createField(DSL.name("block"), SQLDataType.BLOB, this, "");

    private MovieTableFtsData(Name alias, Table<MovieTableFtsDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private MovieTableFtsData(Name alias, Table<MovieTableFtsDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>Movie_Table_fts_data</code> table reference
     */
    public MovieTableFtsData(String alias) {
        this(DSL.name(alias), MOVIE_TABLE_FTS_DATA);
    }

    /**
     * Create an aliased <code>Movie_Table_fts_data</code> table reference
     */
    public MovieTableFtsData(Name alias) {
        this(alias, MOVIE_TABLE_FTS_DATA);
    }

    /**
     * Create a <code>Movie_Table_fts_data</code> table reference
     */
    public MovieTableFtsData() {
        this(DSL.name("Movie_Table_fts_data"), null);
    }

    public <O extends Record> MovieTableFtsData(Table<O> child, ForeignKey<O, MovieTableFtsDataRecord> key) {
        super(child, key, MOVIE_TABLE_FTS_DATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public MovieTableFtsData as(String alias) {
        return new MovieTableFtsData(DSL.name(alias), this);
    }

    @Override
    public MovieTableFtsData as(Name alias) {
        return new MovieTableFtsData(alias, this);
    }

    @Override
    public MovieTableFtsData as(Table<?> alias) {
        return new MovieTableFtsData(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieTableFtsData rename(String name) {
        return new MovieTableFtsData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieTableFtsData rename(Name name) {
        return new MovieTableFtsData(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieTableFtsData rename(Table<?> name) {
        return new MovieTableFtsData(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, byte[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Integer, ? super byte[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Integer, ? super byte[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
