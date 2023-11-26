package iweb.com.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**Method 方法的反射对象
 * @author rui
 * @date 2023/11/25 10:42
 */
public class Test {
    public static void main(String[] args) throws Exception{
     //借助反射获取相关的set方法的对象
        // 并最终调用sell方法
        Class pClass=Class.forName("iweb.com.test2.Product");
        Constructor<Product> c =pClass.getConstructor();
        Product p =c.newInstance();
        Method setIdMethod =pClass.getMethod("setId",Integer.class);
        Method setNameMethod =pClass.getMethod("setName",String.class);
        Method setPriceMethod=pClass.getMethod("setPrice", Float.class);
        //invoke第一个参数是给谁传递，第二个参数是内容
        setIdMethod.invoke(p,1);
        setNameMethod.invoke(p,"眉笔");
        setPriceMethod.invoke(p,79.0f);
        Method sellMethod=pClass.getMethod("sell");
        sellMethod.invoke(p);
        //p.sell();

    }
}
