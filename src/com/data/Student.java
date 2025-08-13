package com.data;

public class Student {
    public  int age; // 0
    public Integer money; // mặc định là null
    public String address; // đối tượng mặc định là null
    public boolean isActive; // mặc định là false
    public double score; // 0.0

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", money=" + money +
                ", address='" + address + '\'' +
                ", isActive=" + isActive +
                ", score=" + score +
                '}';
    }
}
// collection có nhưng đối tượng như list set map
/* list : làm việc với object tybe không làm việc với kiểu dữ liệu nguyên thủy
 set : khác list không lưu giá trị trùng lặp:
 map : kiểu collection dạng key và value :(key không nhất thiết chuỗi hay một số )

một số method của collection
size trả về số lượng phần từ
add, thêm phần từ
get lấy giá trị phần tử có giá trị là index
remove xóa đi một lần từ
clear xóa tất cả phần tử*/

