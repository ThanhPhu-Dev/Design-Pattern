# Singleton Design Pattern For Multi-thread (Bill Pugh Singleton).
 - Thuộc loại CreationalPatterns.
 - Vấn Đề: Tạo một class một lần duy nhất trong cả chương trình theo cơ chế Lazy Loading có sử dụng Multi-Thread.
 - Giải Quyết: Bill Pugh Singleton với cách này sẽ tọa ra static nested class với vai trò là một Helper khi muốn tách biệt một chức năng cho một class function rõ ràng hơn.
 - Ưu Điểm: xữ lý được việc khởi tạo instance của singleton trong multi-thread, triển khai nhanh và hiệu quả nhất và được sử dụng rộng rãi nhất.