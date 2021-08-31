# Decorator Design Pattern
 - Vấn Đề: muốn tạo một Object linh động và tùy biến được trong Runtime mà không dùng quá nhiều kế thừa nhiều bật.
 - Giải Quyết: tạo ra một abstract class và tách các loại muốn tùy biến ra từng Object riêng kế thừa abstract đó thì khi đó chỉ cần lấy dùng Object có thể xữ lý cùng Object base thông qua interface.
 - Ưu Điểm: có thể tạo ra một Object mới từ Object base trong Runtime tùy theo ý thích của client.

<img src="https://user-images.githubusercontent.com/67057523/131475679-8a8252ae-4690-406b-9b18-8950bbd50b6b.PNG"></img>