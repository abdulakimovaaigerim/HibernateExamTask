package peaksoft.config;

import jakarta.persistence.EntityManager;
import org.hibernate.cfg.Configuration;
import peaksoft.entities.Bank;
import peaksoft.entities.Client;
import peaksoft.entities.Passport;
import peaksoft.entities.Region;

import static org.hibernate.cfg.AvailableSettings.*;

public class Config {
    public static EntityManager getEntityManager() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/task2");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "postgres");
        configuration.setProperty(HBM2DDL_AUTO, "update");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        configuration.setProperty(SHOW_SQL, "true");
        configuration.addAnnotatedClass(Bank.class);
        configuration.addAnnotatedClass(Client.class);
        configuration.addAnnotatedClass(Region.class);
        configuration.addAnnotatedClass(Passport.class);

        return configuration.buildSessionFactory().createEntityManager();
    }

}
