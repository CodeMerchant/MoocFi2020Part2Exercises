/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class CountryLiteracy {
    private String country;
    private String gender;
    private String theme;
    private String ageGroup;
    private int year;
    private String literacyPercentage;

    public CountryLiteracy(String theme,String ageGroup, String gender,String country,int year, String literacyPercentage) {
        this.country = country;
        this.gender = gender;
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.year = year;
        this.literacyPercentage = literacyPercentage;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public String getLiteracyPercentage() {
        return literacyPercentage;
    }
    
    @Override
    public String toString(){
        return this.getCountry() + " (" + this.getYear() + "), " + this.getGender() + ", " + this.getLiteracyPercentage();
    }
    
    
}
