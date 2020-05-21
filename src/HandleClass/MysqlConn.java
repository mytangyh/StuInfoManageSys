/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandleClass;

/**
 *
 * @author asus
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author asus
 */
public class MysqlConn {

    private static Connection conn = null;

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String passwd = "root";
            String url = "jdbc:mysql://localhost:3306/stu?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8";
            conn = DriverManager.getConnection(url, user, passwd);

        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return conn;

    }
}