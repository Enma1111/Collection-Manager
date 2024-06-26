package com.Bartalsky.Collection.Manager.Helper;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
@Component
public class PreparedStatementHelper {

    public void insertPreparedStatement(PreparedStatement preparedStatement, String @NotNull [] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            preparedStatement.setString(i + 1, values[i]);
        }
        preparedStatement.addBatch();

        preparedStatement.executeBatch();
    }

    public void deletePreparedStatement(@NotNull PreparedStatement preparedStatement, String id) throws SQLException {
        preparedStatement.setString(1, id);
        preparedStatement.executeUpdate();
    }
}
