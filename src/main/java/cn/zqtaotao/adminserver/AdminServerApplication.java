package cn.zqtaotao.adminserver;

import cn.zqtaotao.adminserver.dao.annotation.MybatisDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
// 开启事务支持
@EnableTransactionManagement
@EnableCaching
@MapperScan(basePackages = "cn.zqtaotao.adminserver.dao.mapper", annotationClass = MybatisDao.class)
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }
}
