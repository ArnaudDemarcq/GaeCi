/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.test.pages;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author arnaud
 */
public class DatastoreTestPage extends PocMainPage {

    private static final Logger logger = LoggerFactory.getLogger(DatastoreTestPage.class);

    public DatastoreTestPage() {
        super();
        testCreateEmployee();





    }

    private void testCreateEmployee() {
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();


        Entity employee = new Entity("Employee");

        employee.setProperty("firstName", "Antonio");
        employee.setProperty("lastName", "Salieri");

        Date hireDate = new Date();
        employee.setProperty("hireDate", hireDate);

        employee.setProperty("attendedHrTraining", true);


        datastore.put(employee);
    }
}
