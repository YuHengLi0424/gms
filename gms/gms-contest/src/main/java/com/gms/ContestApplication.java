/**
 * @author wjw
 * @date 2020/6/9 0:22
 */
package com.gms;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude = {PageHelperAutoConfiguration.class})
@MapperScan(basePackages="com.gms.contest.dao")
public class ContestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContestApplication.class, args);
    }
}
