package ObserverPattern.Notifier;

import ObserverPattern.Base.Observer;
import ObserverPattern.Base.Subject;
import ObserverPattern.VideoData;

/**
 * Thông báo Trên youtube.
 */
public class YoutuberNotifier extends Observer {

    /**
     * @param subject : nhận vào đó là đối tượng nào
     * lấy subject bỏ vào subject ở class cha để lưu sử dụng method notify đồng thời attachObserver để biết
     * thông báo qua phương tiện gì.
     */
    public YoutuberNotifier(Subject subject){
        this.subject = subject;
        super.subject.attachObserver(this);
    }

    /**
     * Thông báo khi subject có sự thay đổi.
     * @param arg nhưng tham số cần để xữ lý task nếu cần.
     */
    @Override
    public void notify(Object... arg) {
        if(subject instanceof VideoData){
            System.out.println("Thông báo cho tất cả người theo dỏi trên YOUTUBE về sự thay đổi " +
                    "\n \tTitle: " + ((VideoData) subject).getTitle() +
                    "\n \tDescription: "+ ((VideoData) subject).getDescription() +
                    "\n \tfileName: "+ ((VideoData) subject).getFileName());
        }
    }
}
