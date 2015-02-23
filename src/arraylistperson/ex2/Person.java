/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistperson.ex2;

import java.util.Objects;

/**
 *
 * @author asus
 */
public class Person {
    private String name ;
    private String family;
    private int height;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Person() {
        this.name =null;
        this.family = null;
        this.height = 0;
        this.gender = null;
    }

    public Person(String name, String family, int height, String gender) {
        this.name = name;
        this.family = family;
        this.height = height;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " " + family+" - "+height;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }else{
            Person search = (Person)obj; 
        boolean result = this.hashCode()==search.hashCode();
       return result;
        }
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.family);
        hash = 37 * hash + this.height;
        hash = 37 * hash + Objects.hashCode(this.gender);
        return hash;
    }
    
    
    
    
    
    
}
