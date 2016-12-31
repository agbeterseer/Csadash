/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fetchr.csa.model;

/**
 *
 * @author terseer
 */
public class PreviousAddresses {
    private String address_id;
    private String address_name;

    public PreviousAddresses() {
    }

    public String getAddress_id() {
        return address_id;
    }

    public void setAddress_id(String address_id) {
        this.address_id = address_id;
    }

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    @Override
    public String toString() {
        return "PreviousAddresses{" + "address_id=" + address_id + ", address_name=" + address_name + '}';
    }
  
}
