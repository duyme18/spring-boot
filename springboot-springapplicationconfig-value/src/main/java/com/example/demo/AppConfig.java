package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // Lấy giá trị config từ file application.properties
//    @Value được sử dụng trên thuộc tính của class, Có nhiệm vụ lấy thông tin từ file properties và gán vào biến.
    @Value("${hdd.mysql.url}")
    String mysqlUrl;

    @Bean
    DatabaseConnector mysqlConfigure(){
        DatabaseConnector mySqlConnector = new MySqlConnector();
        // set url
        System.out.println("Config Mysql Url: "+mysqlUrl);
        mySqlConnector.setUrl(mysqlUrl);
        //set username, password, format, .. .
        return mySqlConnector;
    }
}
