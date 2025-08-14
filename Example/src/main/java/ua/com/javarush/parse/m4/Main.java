package ua.com.javarush.parse.m4;

import org.hibernate.SessionFactory;
import ua.com.javarush.parse.m4.redis.CityCountry;
import ua.com.javarush.parse.m4.redis.Language;
import ua.com.javarush.parse.m4.util.HibernateUtil;
import ua.com.javarush.parse.m4.util.RedisUtil;

import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        RedisUtil redisUtil = RedisUtil.getInstance();

//        Set<Language> langs = new HashSet<>();
//
//        langs.add(new Language("uk", true, new BigDecimal("99.9")));
//        langs.add(new Language("uk", true, new BigDecimal("99.9")));
//
//        CityCountry cc = new CityCountry();
//        cc.setId(1);
//        cc.setName("Kyiv");
//        cc.setDistrict("Kyiv City");
//        cc.setPopulation(2963199);
//        cc.setCountryCode("UKR");
//        cc.setAlternativeCountryCode("UA");
//        cc.setCountryName("Ukraine");
//        cc.setContinent("Europe");
//        cc.setCountryRegion("Eastern Europe");
//        cc.setCountrySurfaceArea(new BigDecimal("603628.0"));
//        cc.setCountryPopulation(41000000);
//        cc.setLanguages(langs);
//
//
//        List<CityCountry> list = new ArrayList<>();

//        list.add(cc);
//
//        redisUtil.pushToRedis(list);


        List<Integer> ids = new ArrayList<>();
        ids.add(1);

        redisUtil.testRedisData(ids);

    }




}