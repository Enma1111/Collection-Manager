package com.Bartalsky.Collection.Manager.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.sql.*;
@Component
public class DatabaseConnection {

    private  XMLParser xmlParser;
    private  PreparedStatementHelper preparedStatementHelper;


    //    static final String URL = "jdbc:sqlite:C:/Users/Jan/Desktop/Collection/Collection.db";
    static final String URL = "jdbc:sqlite:C:/Users/Reha-TN/Desktop/Collection/Collection.db";

    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);

    @Autowired
    public DataReadWrite(XMLParser xmlParser, PreparedStatementHelper preparedStatementHelper) {
        this.xmlParser = xmlParser;
        this.preparedStatementHelper = preparedStatementHelper;
    }

    public Document dataRead(String query){

        try(Connection connection = DriverManager.getConnection(URL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            return xmlParser.createXml(resultSet);

        } catch (SQLException | TransformerException | ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public void dataWrite(String query, String[] values)  {

        try (Connection connection = DriverManager.getConnection(URL)) {
            logger.info(query);

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatementHelper.insertPreparedStatement(preparedStatement, values);

            logger.info("A new row has been inserted.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void dataDelete(String query, String id) {
        try (Connection connection = DriverManager.getConnection(URL)) {

            logger.info(query);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatementHelper.deletePreparedStatement(preparedStatement,id);
            logger.info("Line has been Deleted");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
