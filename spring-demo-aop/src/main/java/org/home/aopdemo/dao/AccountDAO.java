package org.home.aopdemo.dao;

import org.home.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public void addAccount(Account account, boolean vipFlag){
        System.out.println(getClass() + ": doing my db work: adding an account");
    }

    public boolean doWork(){
        System.out.println(getClass() + ": doWork()");
        return false;
    }

    public String getName() {
        System.out.println(getClass() + ": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": in setNme()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
