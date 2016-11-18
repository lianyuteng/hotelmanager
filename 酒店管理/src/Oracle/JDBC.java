/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class JDBC {

    private final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
    private final String DBURL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private final String DBUSER = "scott";
    private final String DBPASSWORD = "tiger";
    private Connection conn = null;

    public JDBC() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    //关闭数据库
    public void close() {
        try {
            this.conn.close();
        } catch (Exception e) {
        }

    }

}
