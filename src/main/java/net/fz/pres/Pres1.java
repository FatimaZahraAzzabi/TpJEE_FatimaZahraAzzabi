package net.fz.pres;

import net.fz.dao.DaoImpl;
import net.fz.ext.DaoImplV2;
import net.fz.metier.IMetier;
import net.fz.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d= new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(dao);
        System.out.println("Res="+metier.calcule());
    }
}
