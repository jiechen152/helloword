package iweb.com.test4;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author rui
 * @date 2023/11/25 11:48
 */
public class DBUtil {
    private static DataSource dataSource;
    static {

        try {
            //读取配置文件
            Properties properties =new Properties();
            properties.load(new FileInputStream("D:\\ieda_workspace\\d1115_javad11\\d1125_javad15\\src\\main\\java\\iweb\\com\\test4\\db.properties"));
            //利用反射完成DataSource类的实例化
            Class dClass = DataSource.class;
            Constructor<DataSource> c1 =dClass.getConstructor();
            dataSource=c1.newInstance();
            //加载jdbc驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取set方法
            Method m =dClass.getMethod("setConn", Connection.class);
            Connection c = DriverManager.getConnection(
                    (String)properties.get("url"),(String)properties.get("username"),(String)properties.get("password"));

            //完成对象绑定
            m.invoke(dataSource,c);

        } catch (Exception e) {
            e.printStackTrace();
        }




    }
    public static DataSource getDataSource(){
        return dataSource;
    }
}
