package spring_demo2;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you are gonna get selected!";
	}

}
