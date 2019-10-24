package company.com.service.item.impl.beverage.beverage_Bridge.impl;


import company.com.domain.item.impl.beverage.beverage_Bridge.Beverage_Alcohol;
import company.com.repository.item.impl.beverage.beverage_Bridge.Beverage_AlcoholInt;
import company.com.service.item.impl.beverage.beverage_Bridge.Beverage_AlcoholServiceInt;
import org.springframework.stereotype.Service;

import java.util.List;

//a bridge class between beverage and all the Alcohole Item
@Service
public class Beverage_AlcoholServ implements Beverage_AlcoholServiceInt {
    private static Beverage_AlcoholServ beverage_alcoholRep;

    private Beverage_AlcoholServ() {
    }
    public static Beverage_AlcoholServ getBeverage_alcoholRep(){
        if(beverage_alcoholRep==null){
            beverage_alcoholRep=new Beverage_AlcoholServ();
        }return beverage_alcoholRep;
    }


    @Override
    public Beverage_Alcohol create(Beverage_Alcohol beverage_alcohol) {
        return null;
    }

    @Override
    public Beverage_Alcohol update(Beverage_Alcohol beverage_alcohol) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
    @Override
    public Beverage_Alcohol read(String id) {
        return null;
    }

    @Override
    public List<Beverage_Alcohol> readAll() {
        return null;
    }
}
