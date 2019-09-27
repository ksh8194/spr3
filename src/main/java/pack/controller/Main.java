package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("app_init.xml"); // resource를 찾아가는 부분
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class); //메타파일을 xml로 해도되고  annotation을 통해 class로 해도 됨
		
		
		 
		MyInter myInter = (MyInter)context.getBean("myInterProcess");//id , name 등등 아무거나로 다 접근가능
		myInter.inputMoney(); //금액을 집어넣음
		myInter.showData();
		

	}

}
