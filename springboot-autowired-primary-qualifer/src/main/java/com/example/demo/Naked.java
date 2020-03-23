package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
@Primary là annotation đánh dấu trên một Bean, giúp nó luôn được ưu tiên lựa chọn trong trường hợp có nhiều Bean cùng loại trong Context.

Trong ví dụ ở trên, nếu chúng ta để Naked là primary. Thì chương trình sẽ chạy bình thường.

Cách thứ hai, là sử dụng Annotation @Qualifier.

@Qualifier xác định tên của một Bean mà bạn muốn chỉ định inject.
*/

@Primary
@Component
public class Naked implements Outfit {
    @Override
    public void wear() {
        System.out.println("Đang không mặc gì");
    }
}