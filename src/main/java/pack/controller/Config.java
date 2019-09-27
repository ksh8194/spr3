package pack.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pack.model.MoneyImpl;

//Annotation을 롱해 환경설정
@Configuration

public class Config {
	
	@Bean
	public MyInterProcess myInterProcess() {
//		MoneyImpl moneyImpl = new MoneyImpl();
//		return new MyInterProcess(moneyImpl); // MyInterprocess에다가 생성자를 통해 moneyImpl 넣어줌??
		
		return new MyInterProcess(moneyImpl()); 
	}

	@Bean
	public MoneyImpl moneyImpl() {
		return new MoneyImpl();     //방법2
	}

}
