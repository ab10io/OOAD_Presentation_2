package spring_demo2;

public class PianoCoach implements Coach{
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// constructor without argument
	public PianoCoach() {}
	
	// define a constructor for injection
	public PianoCoach(FortuneService theFortuneService) {		
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyPractice() {
		return "Move your fingers and you will rock!";		
	}

	@Override
	public String getTodaysFortune() {
		// Use fortuneService to get a fortune.
		return fortuneService.getFortune();
	}
}
