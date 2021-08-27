package ObserverPattern.Base;

import java.util.ArrayList;
import java.util.List;


/**
 * nơi quản lý thông báo trên các phương tiện
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();


    /**
     * thêm phương tiện cần thông báo tới
     * @param observer : phương tiện
     */
    public void attachObserver(Observer observer){
        this.observers.add(observer);
    }


    /**
     * tắt phương tiện thông báo tới
     * @param observer : phương tiện
     */
    public void detachObserver(Observer observer){
        this.observers.remove(observer);
    }

    /**
     * lần lượng chạy thông báo với các phương tiện trong mảng đã lưu
     * @param arg : Mảng những tham số muốn thêm để xữ lý task nếu cần.
     */
    public void notifyObservers(Object... arg){
        this.observers.forEach( obj -> obj.notify(arg));
    }
}
