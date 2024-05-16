/*
 * This file is generated by jOOQ.
 */
package com.Bartalsky.Collection.Manager;


import com.Bartalsky.Collection.Manager.tables.BookTable;
import com.Bartalsky.Collection.Manager.tables.ComicTable;
import com.Bartalsky.Collection.Manager.tables.MovieTable;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index BOOK_INDEX = Internal.createIndex(DSL.name("Book_index"), BookTable.BOOK_TABLE, new OrderField[] { BookTable.BOOK_TABLE.BUCH }, false);
    public static final Index COMIC_INDEX = Internal.createIndex(DSL.name("Comic_index"), ComicTable.COMIC_TABLE, new OrderField[] { ComicTable.COMIC_TABLE.COMIC }, false);
    public static final Index MOVIE_INDEX = Internal.createIndex(DSL.name("Movie_index"), MovieTable.MOVIE_TABLE, new OrderField[] { MovieTable.MOVIE_TABLE.FILM }, false);
}