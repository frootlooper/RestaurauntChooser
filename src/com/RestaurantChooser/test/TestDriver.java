package com.RestaurantChooser.test;

import com.RestaurantChooser.data.Database;
import com.RestaurantChooser.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Frootlooper on 6/2/2016.
 */
public class TestDriver {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");

        User u = (User)context.getBean("user");
        u.setFirstName("Bob");
        System.out.println(u.getFirstName());

        Database db = new Database();

        ((FileSystemXmlApplicationContext)context).close();
    }
}
