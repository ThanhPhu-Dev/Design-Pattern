# Factory Method Design Pattern (Level 1)
 - Thuộc loại CreationalPatterns.
 - Vấn Đề: Trong Runtime muốn tạo ra 1 Object tùy biến theo logic.
 - Giải Quyết: Tạo ra các method làm nhiệm vụ khởi tạo.
 - Ưu Điểm: Tạo ra 1 Object trong Runtime theo logic.

# Factory Abstract Design Pattern (Level 2)
 - Thuộc loại CreationalPatterns.
 - Vấn Đề: Khi có quá nhiều Object cần phân loại theo cụm nhưng dùng Factory method lại 
   chưa làm được tùy biến tạo các phân loại đó theo method (nghĩa là muốn tạo ra phần loại tùy biến trong Runtime)
 - Giải Quyết: tạo ra 1 class abstract hoặc interface quản lý tạo các method được tạo tùy biến theo logic.
 - Ưu Điểm: Khi hệ thống nhiều Object và muốn phân thành cụm, nếu hệ thống đơn giản nên dùng factory method.