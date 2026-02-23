package net.fz.pres;

import net.fz.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpingXML {
    public static void main(String[] args) {
        ApplicationContext springContext=
                new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=(IMetier) springContext.getBean("metier");
        System.out.println("Res="+metier.calcule());
    }
}
