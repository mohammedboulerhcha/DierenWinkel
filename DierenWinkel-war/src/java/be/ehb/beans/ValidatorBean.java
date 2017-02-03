/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.beans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * met behulp van https://www.mkyong.com/regular-expressions/how-to-validate-email-address-with-regular-expression/
 * @author mobapp10
 */
public class ValidatorBean{
    Pattern pattern;
    Matcher matcher;
    String emailREGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public ValidatorBean() {
        pattern = Pattern.compile(emailREGEX);
    }
    
    public boolean validate(final String s) {
		matcher = pattern.matcher(s);
		return matcher.matches();
    }
}
