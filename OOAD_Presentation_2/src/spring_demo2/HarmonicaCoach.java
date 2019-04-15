package spring_demo2;

public class HarmonicaCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailString;
	private String team;

	// default no-arg constructor
	public HarmonicaCoach() {}
	
	// Setter method for the literal injection
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyPractice() {
		return "Breathe more, play more!";
	}

	// setter method for injection.
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getTodaysFortune() {
		return fortuneService.getFortune();
	}

}
