Link github: https://github.com/thinhotwp1/BuilderPattern.git
Link drive: https://docs.google.com/document/d/1CfNFkMVRuYn3pqFoLUFoBRSRXOed80m_a3frffrjCbU/edit?usp=sharing

Builder Pattern:
Builder pattern được sử dụng để xử lý các vấn đề còn tồn tại với  Factory Pattern và Abstract Factory Pattern khi mà Object có nhiều thuộc tính.
Có ba vấn đề chính với  Factory Pattern và Abstract Factory Pattern khi Object có nhiều thuộc tính:
Quá nhiều tham số phải truyền vào từ phía client tới Factory Class
Một số tham số có thể là tùy chọn nhưng trong Factory Pattern, chúng ta phải gửi tất cả tham số, với tham số tùy chọn nếu ko nhập gì thì sẽ truyền là null.
Nếu một Object có quá nhiều thuộc tính thì việc tạo sẽ phức tạp.
Chúng ta có thể sử lý những vấn đề này với một số lượng lớn các tham số bằng việc cung cấp một hàm khởi tạo với những tham số bắt buộc và các method getter/setter để cài đặt các tham số tùy chọn. Vấn đề với hướng tiếp cận này là trạng thái của Object sẽ không nhất quán cho tới khi tất cả các thuộc tính được cài đặt một cách rõ ràng
Builder pattern xử lý các vấn đề này bằng việc cung cấp một cách xây dựng đối tượng từng bước một và cung cấp một method để trả về đối tượng cuối cùng.

Một số ví dụ sử dụng Builder Pattern trong JDK:
java.lang.StringBuilder#append() (unsynchronized)
java.lang.StringBuffer#append() (synchronized)


Ở ví dụ trong link github, tạo một hóa đơn bằng builder pattern, đầu tiên tạo 1 interface chứa các hàm builder và implement ở HoaDonImple
HoaDonImpl sẽ có hàm build trả về các giá trị của hóa đơn, và tạo ra 1 object HoaDon với các thuộc tính mà hàm builder trả về, có thể code để builder hỗ trợ factory khi có các tham số mặc định khi client khởi tạo object bằng factory thì có thể dùng builder để build những tham số mặc định này.
