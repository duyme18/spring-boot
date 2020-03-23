package com.example.demo;

import org.springframework.stereotype.Repository;

/*
@Repository Đánh dấu một Class Là tầng Repository, phục vụ truy xuất dữ liệu.
 */
@Repository
public class GirlRepositoryImpl implements GirlRepository {

    @Override
    public Girl getGirlByName(String name) {
        // Ở đây tôi ví dụ là database đã trả về
        // một cô gái với tên đúng như tham số

        // Còn thực tế phải query trong csđl nhé.
        return new Girl(name);
    }
}