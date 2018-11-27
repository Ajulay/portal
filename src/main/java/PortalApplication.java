import com.example.AppConfig;
import com.example.portal.Shortgun;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PortalApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Shortgun shortgun = context.getBean(Shortgun.class);
        shortgun.doShot();
    }
}
