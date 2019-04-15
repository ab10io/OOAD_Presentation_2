package spring_demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjection {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		// Creating spring container :: Step-2
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from the spring container :: Step-3 // getBean("Bean ID", interface)
		Coach coach1 = context.getBean("myPianoCoach", Coach.class);
		Coach coach2 = context.getBean("myGuitarCoach", Coach.class);
		Coach coach3 = context.getBean("myHarmonicaCoach", HarmonicaCoach.class);
		
		// call the method on the bean
		System.out.println(coach1.getDailyPractice());
		System.out.println(coach1.getTodaysFortune());
		System.out.println(coach2.getDailyPractice());
		System.out.println(coach2.getTodaysFortune());
		System.out.println(coach3.getDailyPractice());
		System.out.println(coach3.getTodaysFortune());
		
		// close the context
		context.close();
	}

}
