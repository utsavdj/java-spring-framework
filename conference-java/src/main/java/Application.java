import com.utsavdj.service.SpeakerService;
import com.utsavdj.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main (String args[]) {
    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//    SpeakerService service = new SpeakerServiceImpl();

    System.out.println("===================Singleton=======================");
    SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

    System.out.println(service);

    System.out.println(service.findAll().get(0).getFirstName());

    // Singleton memory ref/ obj address example
    SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

    System.out.println(service2);

    // Prototype memory ref/ obj address example
    System.out.println("===================PROTOTYPE=======================");
    SpeakerService service3 = appContext.getBean("speakerServicePrototype", SpeakerService.class);
    System.out.println(service3);
    SpeakerService service4 = appContext.getBean("speakerServicePrototype", SpeakerService.class);
    System.out.println(service4);
  }
}
