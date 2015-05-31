package com.fayimora.signupform;

import java.io.Serializable;

/**
 * Created by fayimora on 31/05/15.
 */
public class User implements Serializable {
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
