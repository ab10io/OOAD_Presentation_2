This code represents the Dependency Injection using Spring Framework (NOT Spring Boot). It uses XML as well as Annotations for configuration.
### It shows various types of Injections:
- Constructor based dependency Injection - 
    First we define the dependency iterface and it's class. 
    Then we create a contructor for injection. Next we configure the dependency injection in Spring with the help of the config file.
    Finally we inject the dependency into the class uding constructor injection.
- Getter and Setter method based dependency Injection -
    Creating setter methods in class for injections.
    Configure the dependency injection in Spring config file (XML/ Annotations)
    Inject the dependencies in your class by calling setter methods.
    
The two approaches are almost similiar. Instead of using a constructor to set the dependency, we will use a setter method and have a default constructor.


### Class Description:
```
Coach – Interface

FortuneService – Dependency – Interface

PianoCoach – Constructor based injection

HarmonicaCoach – Setter method based injection

HappyFortuneService – Implementation of FortuneService

TrackCoach – Guitar Coach

DependencyInjection – main class

ApplicationContext.xml - XML Configuration file
```
```
Dependency :: FortuneService  
Dependent  :: Coach
``` 
### Spring development process steps:
  1) Load the spring configuration file and Creating spring container (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");)
  2) Retrieve the bean from the spring container :: getBean("Bean ID", interface) (Coach coach1 = context.getBean("myPianoCoach", Coach.class);)
  3) Call the method on the bean (coach1.getDailyPractice())
  4) Close the context (context.close();)
  
  
