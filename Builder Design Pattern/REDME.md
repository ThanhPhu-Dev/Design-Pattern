# Builder Design Pattern.  
 - Vấn Đề: Constructor Một Object có nhiều param, param là những Object phức tạp, và chia nhỏ constructor thành từng phần (linh hoạt).
 - Giải Quyết: tạo các method set từng thuộc tính rồi build ra constructor chung.
 - Ưu Điểm: linh hoạt trong việc constructor, dể đọc code.