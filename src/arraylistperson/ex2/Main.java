/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistperson.ex2;

/**
 *
 * @author asus
 */
public class Main {
    
    public static void main(String[] args) {
       Person me = new Person();
       me.setName("hamid");
       me.setFamily("hamid");
       me.setGender("male");
       me.setHeight(193);
       
       Person me1 = new Person();
       me1.setName("hamid1");
       me1.setFamily("hamid");
       me1.setGender("male");
       me1.setHeight(193);
        
        
        System.out.println(me.equals(me1));
    }
}
