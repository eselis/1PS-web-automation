package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {

    public static String generateRandomInputString(){
        return RandomStringUtils.random(10,true,false);
    }
    public static String generateRandomPhoneNumber(){
        return "+371" + RandomStringUtils.random(8, false, true);
    }
    public static String generateRandomEmail(){
        return RandomStringUtils.random(5, true, false) +
                "." + RandomStringUtils.random(5, true,false) +
                "@" + RandomStringUtils.random(10, true, false) +
                ".com";
    }
}
