package iweb.com.test5;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * @author rui
 * @date 2023/11/25 14:03
 */


@Target({METHOD,TYPE}) //指定该注解在哪里使用
@Retention(RUNTIME) //注解存活时间 这个参数是枚举类
@Documented  //该注解可以自动生成javadoc文档
@Inherited  //该注解可以被继承
//@Repeatable() 1.8新增元注解 表示同一个位置 当前自定义注解可以出现多次
public @interface JDBCConfig {
    //注解的属性
    String url();
    String username();
    String password();
}
