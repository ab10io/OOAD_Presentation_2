package spring_demo2;

public class GuitarCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// constructor without argument
	public GuitarCoach() {}
	
	public GuitarCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyPractice() {
		return "Practice more chords!";
	}

	@Override
	public String getTodaysFortune() {
		return fortuneService.getFortune();
	}

}
