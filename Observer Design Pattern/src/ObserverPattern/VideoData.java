package ObserverPattern;

import ObserverPattern.Base.Subject;

public class VideoData extends Subject {
    private String title;
    private String description;
    private String fileName;

    public String getTitle() {
        return title == null ? "": title;
    }

    public void setTitle(String title) {
        this.title = title;
        videoDataChanged();
    }

    public String getDescription() {
        return description == null ? "" : description;
    }

    public void setDescription(String description) {
        this.description = description;
        videoDataChanged();
    }

    public String getFileName() {
        return fileName == null ? "" : fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        videoDataChanged();
    }

    /**
     * khi chạy các lệnh setter sẽ gọi hàm này để chạy thông báo (gọi qua method bên observer)
     */
    public void videoDataChanged(){
        super.notifyObservers();
    }
}
