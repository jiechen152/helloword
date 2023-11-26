package iweb.com.test1;

import java.io.*;
import java.lang.reflect.Constructor;

/**在反射的思想中 万物皆是对象
 * 构造方法 方法 成员变量 等都可以当做变量
 * 配置优于实现 约定优于配置
 *
 * @author rui
 * @date 2023/11/25 9:16
 */
public class TestStudent {
    //设计一个方法，能够根据配置文件中所记录的信息创建一个person接口的子类对象
    //并且使用这个对象调用eat方法，在代码不变的情况下，修改配置文件 达到调用不同eat的目的
    public static Person getInstance() throws Exception{

        File f =new File("D:\\ieda_workspace\\d1115_javad11\\d1125_javad15\\src\\main\\java\\iweb\\com\\test1\\person.config");
        // FileInputStream fis =new FileInputStream(f);
        // byte[]all = new byte[(int)f.length()];
        // fis.read(all);
        // String str =new String();
        // String str1 =new String();
        // String str2 =new String();
        // for (byte x:all) {
        //    str+=(char) x;
        // }

        try(BufferedReader bufferedReader =new BufferedReader(new FileReader(f))){
            String line;

            line=bufferedReader.readLine();
            String classn =line.substring(line.indexOf("iweb"));
            System.out.println(classn);
            Class c1 =Class.forName(classn);
            Person s = (Person) c1.newInstance();
             return s;


        }catch (Exception e){//e.printStackTrace();
             }
        return null;
        // if(str.startsWith("classname=")) {
        //     str1 = str.substring(0, str.indexOf("="));
        //      str2 = str.substring(str1.length() + 1, str.length());
        // }
        // fis.close();

      //  Class c1 =Class.forName(str2);
       // Person s = (Person) c1.newInstance();
       // return s;
    }


    public static void main(String[] args) throws Exception{

        getInstance().eat();


        // Class c1 =Class.forName("iweb.com.test1.Student");
        // //根据类对象获取对应的构造器对象(获取的是无参构造方法的反射对象)
        // Constructor<Student>c =c1.getConstructor();
        // //利用无参构造方法完成对象的实例化
        // Student s =c.newInstance();
        // //查看对象属性
        // System.out.println(s.toString());
        // //获取有参构造函数的反射对象
        // Constructor<Student>cc =c1.getConstructor(String.class);
        // //利用有参创建对象
        // Student s1 =cc.newInstance("qs");
        // //查看对象属性
        // System.out.println(s1.toString());
    }
}
