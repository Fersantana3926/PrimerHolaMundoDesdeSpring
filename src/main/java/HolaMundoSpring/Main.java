package HolaMundoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HolaMundoS holaSpring = (HolaMundoS) context.getBean("holaMundoSpring");

        String texto = holaSpring.holaMundo();

        System.out.println(texto);

    }

}
