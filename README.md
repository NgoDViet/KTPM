Mô tả bài toán:

Dự án xây dựng lớp StudentAnalyzer để xử lý danh sách điểm sinh viên (List<Double>).
Hệ thống gồm hai phương thức:

countExcellentStudents(List<Double> scores)
Đếm số học sinh giỏi (điểm >= 8.0).
Bỏ qua các điểm không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10).
Nếu danh sách rỗng thì trả về 0.

calculateValidAverage(List<Double> scores)
Tính trung bình các điểm hợp lệ (từ 0 đến 10).
Bỏ qua các điểm không hợp lệ.
Nếu không có điểm hợp lệ hoặc danh sách rỗng thì trả về 0.

Yêu cầu kỹ thuật:
Điều kiện 1: Nếu điểm < 0 hoặc > 10 thì bỏ qua.
Điều kiện 2: Nếu danh sách rỗng thì trả về 0.
Vòng lặp 1: Duyệt danh sách để đếm học sinh giỏi.
Vòng lặp 2: Duyệt danh sách để tính trung bình điểm hợp lệ.

Cách chạy chương trình

Mở project bằng IntelliJ IDEA.
Mở file StudentAnalyzer.java.
Chương trình không có hàm main, được kiểm thử bằng JUnit.

Cách chạy kiểm thử

Chuột phải vào file StudentAnalyzerTest.java.
Chọn Run 'StudentAnalyzerTest'.

Nếu test chạy thành công sẽ hiển thị màu xanh.
Nếu test thất bại sẽ hiển thị màu đỏ và thông báo lỗi.

Các trường hợp kiểm thử

Trường hợp bình thường:
Danh sách có nhiều điểm hợp lệ và không hợp lệ.
Danh sách toàn bộ điểm hợp lệ.

Trường hợp biên:
Danh sách rỗng.
Danh sách chỉ chứa giá trị 0 hoặc 10.
Trường hợp ngoại lệ:
Có điểm nhỏ hơn 0.
Có điểm lớn hơn 10.
