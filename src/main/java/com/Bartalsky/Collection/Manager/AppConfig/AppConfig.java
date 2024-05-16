package com.Bartalsky.Collection.Manager.AppConfig;

import org.jooq.DAO;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    private final DataSource dataSource;

    @Value("${comic.table.name}")
    private String comicTableName;

    @Value("${movie.table.name}")
    private String movieTableName;

    @Value("${book.table.name}")
    private String bookTableName;

    public String getComicTableName() {
        return comicTableName;
    }

    public String getMovieTableName() {
        return movieTableName;
    }

    public String getBookTableName() {
        return bookTableName;
    }

    public AppConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public DSLContext dslContext(){
        return DSL.using(dataSource, SQLDialect.SQLITE);
    }
}
