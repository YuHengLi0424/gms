package com.gms.gmsvenue;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {PageHelperAutoConfiguration.class})
@MapperScan(basePackages = "com.gms.gmsvenue.dao")
public class GmsVenueApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmsVenueApplication.class, args);
    }

}
