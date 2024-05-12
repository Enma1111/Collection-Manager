package com.Bartalsky.Collection.Manager.AppConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

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
}
