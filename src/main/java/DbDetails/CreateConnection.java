package DbDetails;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
    private static Connection con;

    static {
        try {
            Class.forName(DbInfo.driver);
            con = DriverManager.getConnection(DbInfo.url, DbInfo.uname, DbInfo.password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getCon() {
        return con;
    }
}
