package net.fz.pres;

import net.fz.dao.IDao;
import net.fz.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    // FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException,NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
    public static void main(String[] args) throws Exception {
        //instance dynamique
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName=sc.nextLine();
        Class cDao =Class.forName(daoClassName);
        IDao d=(IDao) cDao.newInstance();

        String metierClassName=sc.nextLine();
        Class cMetier =Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(d);
        //IMetier metier=(IMetier)cMetier.getConstructor().newInstance();
        //Method setDao=cMetier.getMethod("setDao",IDao.class);
        //setDao.invoke(metier,d);
        System.out.println("Res="+metier.calcule());

    }

}
