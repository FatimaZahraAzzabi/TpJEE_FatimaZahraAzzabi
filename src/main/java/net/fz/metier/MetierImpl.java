package net.fz.metier;

import net.fz.dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;//couplage faible depand d'une interface et pas une classe
    @Override
    public double calcule() {
        double t=dao.getData();
        double res=t*12*Math.PI/2*Math.cos(t);
        return res;
    }
    /*
    pour injecter dans la var dao un objet
    de type IDao=> objet d'une classe qui implemente IDAO
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {

    }
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
}
