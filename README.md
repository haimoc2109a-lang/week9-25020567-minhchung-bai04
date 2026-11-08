# Bài 4 - Matrix Strategy

Workflow chạy `mvn verify` song song trên Ubuntu, Windows, macOS. Bản cuối sử dụng `Path.of("reports", "result.txt")` nên không phụ thuộc dấu phân cách hệ điều hành.

**Cách tái hiện lỗi trước khi sửa:** trong `ReportPath.outputFile()`, tạm thay lệnh `return` thành `return Path.of("reports\\result.txt");` (literal Java chứa hai dấu backslash để biểu diễn một `\`). Push: Linux/macOS xem `reports\result.txt` là một tên, `getNameCount()` bằng 1 và test đỏ; Windows coi `\` là dấu phân cách và test xanh. Lưu ảnh/log matrix thất bại. Khôi phục `Path.of("reports", "result.txt")`, push và lưu matrix xanh. Đoạn lỗi cố ý **không có trong mã nộp cuối cùng**.
