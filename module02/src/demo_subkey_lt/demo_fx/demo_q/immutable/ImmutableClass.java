package demo_subkey_lt.demo_fx.demo_q.immutable;

import java.util.Date;

public final class ImmutableClass {
    private String first_name;
    private String last_name;
    private Date dateOfBirth;

    public ImmutableClass(String first_name, String last_name, Date dob) {
        this.first_name = first_name;
        this.last_name = last_name;
        dateOfBirth = dob;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
/**
 * https://stackjava.com/java/immuable-la-gi.html
 * 2. Tại sao lại dùng Immutable
 * Giống như ví dụ với String bên trên, ta thấy được sử dụng immutable sẽ tránh được sự thay đổi lẫn nhau khi đa tham chiếu (str1 và str2 cùng tham chiếu tới 1 vùng nhớ nhưng khi str1 thay đổi thì str2 sẽ không thay đổi)
 * Thread Safe: Khi sử dụng immutable object ta sẽ không cần phải lo tới việc nhiều thread cùng làm thay đổi giá trị của 1 object
 * Sử dụng các immutable object làm tham số của method sẽ không sợ nó bị thay đổi sau khi method kết thúc
 * Sử dụng immutable object để làm key trong HashMap hoặc đẩy vào HashTable mà không gặp vấn đề gì khi lấy ra.
 * 3. Cách tạo 1 Class Immutable
 * Phải là final class (không thể thừa kế bởi class khác)
 * Các field phải là private final
 * Không có các method làm thay đổi trạng thái của các field (Ví dụ: chỉ có hàm get, không có các hàm set)
 * Nếu có field nào là Object thì field đó cũng phải là 1 immutable Object hoặc khi khởi tạo/lấy ra field đó ta phải clone ra 1 bản khác.
 * (Xem thêm: https://stackjava.com/java-core)
 */
