/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fetchr.csa.model;

import java.util.List;



/**
 *
 * @author terseer
 */

public class CustomerData  {

   private String name;
   private String phone;
   private String alternativePhone;
   private String email;
   private String country;
   private String cus_state;
   private String city;
   private String street_one;
   private String street_two;
   private String street_three;
   private String postal_code;
   private String latitude;
   private String longitude;
   private List<PreviousAddresses> previous_addresses; 

    public String getCus_state() {
        return cus_state;
    }

    public void setCus_state(String cus_state) {
        this.cus_state = cus_state;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAlternativePhone() {
        return alternativePhone;
    }

    public void setAlternativePhone(String alternativePhone) {
        this.alternativePhone = alternativePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
 

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet_one() {
        return street_one;
    }

    public void setStreet_one(String street_one) {
        this.street_one = street_one;
    }

    public String getStreet_two() {
        return street_two;
    }

    public void setStreet_two(String street_two) {
        this.street_two = street_two;
    }

    public String getStreet_three() {
        return street_three;
    }

    public void setStreet_three(String street_three) {
        this.street_three = street_three;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<PreviousAddresses> getPrevious_addresses() {
        return previous_addresses;
    }

    public void setPrevious_addresses(List<PreviousAddresses> previous_addresses) {
        this.previous_addresses = previous_addresses;
    }
 
  

  

    
    
}
