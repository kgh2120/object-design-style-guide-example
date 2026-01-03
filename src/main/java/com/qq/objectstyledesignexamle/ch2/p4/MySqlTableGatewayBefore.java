package com.qq.objectstyledesignexamle.ch2.p4;

public class MySqlTableGatewayBefore {

    private final String host;
    private final int port;
    private final String username;
    private final String database;
    private final String db;

    public MySqlTableGatewayBefore(String host, int port, String username, String database, String db) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.database = database;
        this.db = db;
    }
}
