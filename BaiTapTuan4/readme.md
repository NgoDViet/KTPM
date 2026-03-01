Performance Testing Report – Apache JMeter
1. Giới thiệu
Tài liệu này mô tả quá trình kiểm thử hiệu năng website bằng Apache JMeter với ba kịch bản khác nhau:

Kịch bản cơ bản
Kịch bản tải nặng
Kịch bản tùy chỉnh (chạy theo thời gian)

Mục tiêu là đánh giá thời gian phản hồi, throughput và tỷ lệ lỗi của hệ thống khi có nhiều người dùng truy cập đồng thời.

2. Môi trường kiểm thử
Công cụ: Apache JMeter
Giao thức: HTTPS
Phương thức: GET

Listener sử dụng:
View Results Tree
Summary Report
Aggregate Report

3. Kịch bản 1 – Cơ bản
Cấu hình
Number of Threads: 10
Ramp-up Period: 10 giây
Loop Count: 5
Phương thức: HTTP GET
Truy cập trang chủ website

4. Kịch bản 2 – Tải nặng
Cấu hình
Number of Threads: 50
Ramp-up Period: 30 giây
Loop Count: 5
Phương thức: HTTP GET
Truy cập trang con

5. Kịch bản 3 – Tùy chỉnh (Chạy theo thời gian)
Cấu hình
Number of Threads: 20
Duration: 60 giây
Loop Count: infinite
Sử dụng HTTP Request Defaults để cấu hình URL cơ sở
Thực hiện GET đến 2 trang con khác nhau


Average Response Time: (ghi số liệu)

Error %: (ghi số liệu)
