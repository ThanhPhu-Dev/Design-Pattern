package ObserverPattern;

import ObserverPattern.Notifier.EmailNotifier;
import ObserverPattern.Notifier.FacebookNotifier;
import ObserverPattern.Notifier.YoutuberNotifier;

public class main {

    public static void main(String[] args) {
        VideoData videoData = new VideoData();

        EmailNotifier emailNotifier = new EmailNotifier(videoData);
        FacebookNotifier facebookNotifier = new FacebookNotifier(videoData);
        YoutuberNotifier youtuberNotifier = new YoutuberNotifier(videoData);

        videoData.setTitle("Observer Design Pattern");
        System.out.println("-------------Ngừng thông báo trên EMAIL---------------");
        videoData.detachObserver(emailNotifier);
        videoData.setTitle("Observer Design Pattern v2");
    }
}
