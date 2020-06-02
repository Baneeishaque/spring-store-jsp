package ndk.banee.spring_jstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ndk.banee.spring_jstore.mapper")
public class SpringJStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJStoreApplication.class, args);
	}

}
