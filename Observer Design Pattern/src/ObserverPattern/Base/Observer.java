package ObserverPattern.Base;

/**
 * lớp cha các phương tiện.
 */
public abstract class Observer {
    /**
     * subject: phương tiện.
     */
    protected Subject subject;

    /**
     * bắt các phương tiện extend phải chạy thông báo
     * @param arg nhưng tham số cần để xữ lý task nếu cần.
     */
    public abstract void notify(Object... arg);
}
