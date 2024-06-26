package com.Bartalsky.Collection.Manager.Helper;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StringBuilderHelper {

    private static final Logger logger = LoggerFactory.getLogger(StringBuilderHelper.class);

    public String insertQueryBuilder(String table, @NotNull List<String> insertColumnNames){

        StringBuilder insertQuery = new StringBuilder("INSERT INTO " + table + "(");
        StringBuilder values = new StringBuilder("VALUES (");

        for (int i = 0; i < insertColumnNames.size(); i++) {
            insertQuery.append(insertColumnNames.get(i));
            values.append("?");
            if (i < insertColumnNames.size() - 1) {
                insertQuery.append(", ");
                values.append(", ");
            }
        }

        insertQuery.append(") ");
        values.append(")");

        return insertQuery + values.toString();
    }

    public String searchQueryBuilder(String table, String searchTerm, @NotNull List<String> colNames , String searchColumn) {

        StringBuilder select = new StringBuilder("SELECT ");
        StringBuilder virtualTable = new StringBuilder(table + "_fts");
        StringBuilder bm25weigthing = new StringBuilder(", 2.0, 0.75, 0, 0, 0, 0, 0) AS bm25_score,");
        StringBuilder from = new StringBuilder(" FROM ");
        StringBuilder searchTable = new StringBuilder(table + " t ");
        StringBuilder innerJoin = new StringBuilder("INNER JOIN ");
        StringBuilder on = new StringBuilder(" s ON s." + searchColumn + "_ID" + " = t.ID");
        StringBuilder where = new StringBuilder(" WHERE ");
        StringBuilder match = new StringBuilder(" MATCH '" + searchTerm + "*';");
        StringBuilder bm25 = new StringBuilder("bm25(").append(virtualTable).append(bm25weigthing);
        StringBuilder tableColumns = new StringBuilder();
        for (int i = 0; i < colNames.size(); i++) {
            tableColumns.append("t.").append(colNames.get(i));
            if (i < colNames.size() -1) {
                tableColumns.append(", ");
            }

        }


        StringBuilder query = new StringBuilder();
        query.append(select).append(bm25)
                .append(tableColumns).append(from)
                .append(searchTable).append(innerJoin)
                .append(virtualTable).append(on)
                .append(where).append(virtualTable)
                .append(match);
        logger.info(query.toString());
        return query.toString();
    }
}
