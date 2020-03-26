package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component // Là 1 spring bean
// @PropertySource("classpath:application.yml") // Đánh dấu để lấy config từ trong file application.yml
@ConfigurationProperties(prefix = "hdd") // Chỉ lấy các config có tiền tố là "hdd"
public class HDDAppProperties {
    private String email;
    private String googleAnalyticsId;
    private List<String> authors;

    private Map<String, String> exampleMap;
}
