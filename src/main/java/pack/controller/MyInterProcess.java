package pack.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import pack.model.MoneyInter;

public class MyInterProcess implements MyInter {
	private MoneyInter inter; // moneyinter의 서브클래스중 그 누군가를 가져올생각 moneyimpl하나가 아니라 그래서 interface걸어준거임 money인터의
								// 서브클래스가 넘어오는부분(다형성)
	private int re[];

	public MyInterProcess(MoneyInter inter) { // 지역변수 inter를 맴버변수 inter로
		this.inter = inter;
	}

	public void inputMoney() {
		try {
			InputStreamReader reader = new InputStreamReader(System.in); // 표준입력
			BufferedReader breader = new BufferedReader(reader);
			int myMoney = 0;
			System.out.println("금액 입력 : ");
			String data = breader.readLine(); //키보드로부터 숫자입력
			myMoney = Integer.parseInt(data); //stream으로 받아서 캐스팅
			re = inter.calcMoney(myMoney); //re로 받은 숫자를 담음
			
			
		} catch (Exception e) {
			System.out.println("err" + e);
		}

	}
//클래스 생성 정보를 가지고있는 spring의 xml을 만듬. bean설정을 위한 xml파일 메타파일 이라고 부름
	public void showData() {
		StringBuffer sb = new StringBuffer();
		sb.append("만원 : " + re[0]+ "\n");
		sb.append("천원 : " + re[1]+ "\n");
		sb.append("백원 : " + re[2]+ "\n");
		sb.append("십원 : " + re[3]+ "\n");
		sb.append("일원 : " + re[4]+ "\n");
		System.out.println("결과는"+sb.toString());
		System.out.println("결과는"+sb);
		
	
		//stringbuffer 문자열 여러개 들어올대 씀
	}
}
