package controller;

import model.Database;

import java.sql.SQLException;

public class controller {

    private Database db = new Database();


    public void connect() throws Exception {
        db.connect();
    }

    public void disconnect() {
        db.disconnect();
    }


    public void save(String value, double value1, int value2, double value3, double value4, double value5) throws SQLException {
        db.save(value,value1,value2,value3,value4,value5);
    }
}
