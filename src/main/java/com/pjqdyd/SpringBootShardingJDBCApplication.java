package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**   
 * @Description:  [启动主类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@SpringBootApplication
@MapperScan(basePackages = "com.pjqdyd.mapper")
public class SpringBootShardingJDBCApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBootShardingJDBCApplication.class);
    }
}
