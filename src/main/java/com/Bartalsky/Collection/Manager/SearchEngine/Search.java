//package com.Bartalsky.Collection.Manager.SearchEngine;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.w3c.dom.Document;
//
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.transform.TransformerException;
//import java.sql.*;
//import java.util.concurrent.atomic.AtomicBoolean;
//@Component
//public class Search {
//
//    private final XMLParser xmlParser;
//    private final TableIInitiator tableIInitiator;
//
//    private static final Logger logger = LoggerFactory.getLogger(Search.class);
//
//    //    static final String URL = "jdbc:sqlite:C:/Users/Reha-TN/Desktop/Collection/Collection.db";
//    private final String URL = "jdbc:sqlite:C:/Users/Jan/Desktop/Collection/Collection.db";
//
//    public Search(XMLParser xmlParser, TableIInitiator tableIInitiator) {
//        this.xmlParser = xmlParser;
//        this.tableIInitiator = tableIInitiator;
//    }
//
//
//    public void performSearch(String query, TableView<DataItem> tableView, String table){
//
//        Platform.runLater(() -> {
//
//            final int timeout = 5000;
//            AtomicBoolean isRunning = new AtomicBoolean(true);
//
//            Task<Document> searchTask = new Task<Document>() {
//                @Override
//                protected Document call() throws Exception {
//                    try(Connection connection = DriverManager.getConnection(URL)) {
//                        PreparedStatement preparedStatement = connection.prepareStatement(query);
//                        ResultSet resultSet = preparedStatement.executeQuery();
//
//                        return xmlParser.createXml(resultSet);
//
//                    } catch (SQLException | TransformerException | ParserConfigurationException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            };
//
//            searchTask.setOnSucceeded((WorkerStateEvent event) -> {
//                Document searchResult = searchTask.getValue();
//                if (tableView != null) {
//                    Platform.runLater(() -> tableIInitiator.initialize(tableView, table, searchResult));
//                } else {
//                    logger.error("tableView Instanz ist null");
//                }
//                isRunning.set(false);
//            });
//
//            searchTask.setOnFailed((WorkerStateEvent event) -> {
//
//                Throwable exception = searchTask.getException();
//                exception.printStackTrace();
//                isRunning.set(false);
//            });
//
//
//            Thread timeoutThread = new Thread(() -> {
//                try {
//                    Thread.sleep(timeout);
//                    if(isRunning.get()) {
//                        searchTask.cancel();
//                        Platform.runLater(() -> logger.info("timeout erreicht"));
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//            timeoutThread.setDaemon(true);
//            timeoutThread.start();
//
//            new Thread(searchTask).start();
//
//            if (!timeoutThread.isAlive()) {
//                logger.error("Thread wurde nicht gestartet");
//            }
//        });
//    }
//}
