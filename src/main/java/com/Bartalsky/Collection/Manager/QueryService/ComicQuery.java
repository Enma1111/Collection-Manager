package com.Bartalsky.Collection.Manager.QueryService;

import com.Bartalsky.Collection.Manager.tables.ComicTable;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Component
public class ComicQuery {

    private final DSLContext dslContext;

    @Autowired
    public ComicQuery(DSLContext dslContext) {
        this.dslContext = dslContext;
    }


    public Result<Record> loadComics(String tableName) {

        return dslContext.select().from(tableName).fetch();
    }
}
