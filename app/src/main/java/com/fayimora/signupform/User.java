package com.fayimora.signupform;

/**
 * Created by fayimora on 31/05/15.
 */
public class User {
    private String mUsername;
    private String mPassword;

    protected User(String username, String password){
        mUsername = username;
        mPassword = password;
    }

    public String getUsername() {
        return mUsername;
    }

    public String getPassword() {
        return mPassword;
    }
}
