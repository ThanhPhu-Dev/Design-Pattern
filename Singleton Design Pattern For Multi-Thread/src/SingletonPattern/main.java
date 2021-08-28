package SingletonPattern;

public class main {

    public static void main(String[] args) {
        //tạo ra 2 thread và cho nó chạy đồng bộ nếu index nó giống nhau nghĩa là chỉ có 1 object được tạo trong
        //hệ thống
        Thread t1 = new Thread(() -> MarioSingleton.getInstance().SaysHi());
        Thread t2 = new Thread(() -> MarioSingleton.getInstance().SaysHi());

        t1.start();
        t2.start();
    }
}
