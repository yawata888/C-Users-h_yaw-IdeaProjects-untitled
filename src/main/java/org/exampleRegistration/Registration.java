package org.exampleRegistration;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Only Yahoo emails are considered valid.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && !userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid userName. It cannot be empty and must be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It cannot be empty, must be longer than 6 characters, and cannot contain the userName.");
        }
    }

}


