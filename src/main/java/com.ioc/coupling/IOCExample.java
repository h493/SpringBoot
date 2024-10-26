package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationIOLooseCouplingExample.xml");

       // UserDataProvider dataBaseProvider = new UserDatabaseProvider();
      //  UserManager userManagerWithDB = new UserManager(dataBaseProvider);
        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

//        UserDataProvider webServiceProvider = new WebServiceDataProvider();
//        UserManager userManagerWithMS = new UserManager(webServiceProvider);
        UserManager userManagerWithMS = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(userManagerWithMS.getUserInfo());
    }
}
