package iweb.com.test4;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author rui
 * @date 2023/11/25 11:19
 */
public class Test {
   //  static String url;
   // static String username;
   //  static String password;
   //
   //  public static Connection getConnection() throws Exception{
   //
   //      return DriverManager.getConnection(url,username,password);
   //  }
   //  public static void main(String[] args) throws Exception{
   //
   //
   //      File f = new File("D:\\ieda_workspace\\d1115_javad11\\d1125_javad15\\src\\main\\java\\iweb\\com\\test4\\db.properties");
   //      Properties springConfig = new Properties();
   //      springConfig.load(new FileInputStream(f));
   //
   //      url =(String) springConfig.get("url");
   //      username =(String) springConfig.get("username");
   //      password =(String) springConfig.get("password");
   //
   //      System.out.println(url);
   //      System.out.println(username);
   //      System.out.println(password);
   //
   //
   //  }


    public static void main(String[] args) {
        System.out.println(DBUtil.getDataSource().getConn());
    }

}
