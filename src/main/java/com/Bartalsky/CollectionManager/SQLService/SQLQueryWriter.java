package com.Bartalsky.Collection.Manager.SQLService;


import com.Bartalsky.Collection.Manager.Helper.StringBuilderHelper;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SQLQueryWriter {

    private String query;
    private static final Logger logger = LoggerFactory.getLogger(SQLQueryWriter.class);
    private final StringBuilderHelper stringBuilderHelper;

    @Autowired
    public SQLQueryWriter(StringBuilderHelper stringBuilderHelper) {
        this.stringBuilderHelper = stringBuilderHelper;
    }


    public String readQuery(String tableName){
        query = "SELECT * FROM " + tableName + ";";
        logger.info(query);
        return query;
    }

    public String searchQuery(String tableName, @NotNull String searchTerm, List<String> colNames, String searchColumn){

        query = stringBuilderHelper.searchQueryBuilder(tableName,searchTerm, colNames, searchColumn);
        logger.info(query);
        return query;
    }

    public String saveQuery(List<String> insertColumnNames, String tableName){

        query = stringBuilderHelper.insertQueryBuilder(tableName,insertColumnNames);
        logger.info(query);
        return query;
    }

    public String deleteQuery(String tableName){

        query = "DELETE FROM " + tableName + " WHERE ID = ?;";
        logger.info(query);
        return query;
    }
}
