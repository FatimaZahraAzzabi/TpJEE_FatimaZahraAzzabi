package net.fz.pres;

import net.fz.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.fz");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES="+metier.calcule());

    }
}
