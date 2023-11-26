package iweb.com.test3;

/**
 * @author rui
 * @date 2023/11/25 11:02
 */
public class UserServiceImpl2 implements UserService{

    @Override
    public void login() {
        System.out.println("扫码登录");
    }

    @Override
    public void register() {
        System.out.println("扫码注册");
    }
}
