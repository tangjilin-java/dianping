package ab.tjl.dianping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = {"ab.tjl.dianping"})//指定扫描包范围，在大型项目中包的基层很多，默认是全部扫描，这样就会浪费资源
@MapperScan("ab.tjl.dianping.dal")
@EnableAspectJAutoProxy(proxyTargetClass = true)//开启解析aop的配置
public class DianpingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DianpingApplication.class, args);
    }

}
