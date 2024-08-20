package com.codekul.july26batch;

//import com.codekul.july26batch.di.Company;
//import com.codekul.july26batch.di.Employee;
import com.codekul.july26batch.aop.Boy;
import com.codekul.july26batch.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class July26batchApplication {

	public static void main(String[] args)  {
		ConfigurableApplicationContext context = SpringApplication.run(July26batchApplication.class, args);
//		Vodafone vodafone = context.getBean(Vodafone.class);
//		vodafone.calling();
//		vodafone.msg();

//		Company company = context.getBean(Company.class);
//		company.getEmployee();
		Boy boy = context.getBean(Boy.class);
		boy.studyBoy();
	}

	@GetMapping("hello")
	public String getHello(){
		return "Hello Spring";
	}

}
