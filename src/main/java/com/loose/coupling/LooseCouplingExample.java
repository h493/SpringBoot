package com.loose.coupling;

public class LooseCouplingExample {

    public static void main(String[] args) {
        UserDataProvider dataBaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(dataBaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithMS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithMS.getUserInfo());
    }
}
