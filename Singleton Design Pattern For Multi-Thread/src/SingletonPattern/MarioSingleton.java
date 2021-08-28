package SingletonPattern;

import java.util.Random;

public class MarioSingleton {
    //index dủng để nhận biết tạo ra mấy instance
    private int index;

    private MarioSingleton(int index) {
        this.index = index;
    }

    /**
     * hàm instance được gọi từ bên ngoài
     * @return trả ra instance
     */
    public static MarioSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /**
     * Khi Singleton được tải vào bộ nhớ thì SingletonHelper chưa được tải vào.
     * Nó chỉ được tải khi và chỉ khi phương thức getInstance() được gọi
     */
    private static class SingletonHelper {
        private static final MarioSingleton INSTANCE = new MarioSingleton(new Random().nextInt());
    }

    public void SaysHi()
    {
        System.out.println("Hello everyone, I am Mario number " + index);
    }
}
