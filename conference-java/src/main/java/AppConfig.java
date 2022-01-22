import com.utsavdj.repository.HibernateSpeakerRepositoryImpl;
import com.utsavdj.repository.SpeakerRepository;
import com.utsavdj.service.SpeakerService;
import com.utsavdj.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

  @Bean(name = "speakerService")
  @Scope(value = BeanDefinition.SCOPE_SINGLETON)
  public SpeakerService getSpeakerService() {
    SpeakerServiceImpl service = new SpeakerServiceImpl();
//    service.setSpeakerRepository(getSpeakerRepository());
//    SpeakerServiceImpl service = new SpeakerServiceImpl( getSpeakerRepository() );
    return service;
  }

  @Bean(name = "speakerServicePrototype")
  @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
  public SpeakerService getSpeakerServicePrototype() {
    SpeakerServiceImpl service = new SpeakerServiceImpl( getSpeakerRepository() );
    return service;
  }

  @Bean(name = "speakerRepository")
  public SpeakerRepository getSpeakerRepository() {
    return new HibernateSpeakerRepositoryImpl();
  }
}
