package com.perasia.mvpdemo.model;


public interface IUser {
    String getName();

    String getPassword();

    int checkUserValidity(String name, String password);
}
