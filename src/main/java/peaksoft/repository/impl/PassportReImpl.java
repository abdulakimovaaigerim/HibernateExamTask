package peaksoft.repository.impl;

import jakarta.persistence.EntityManager;
import peaksoft.config.Config;
import peaksoft.entities.Client;
import peaksoft.entities.Passport;
import peaksoft.repository.PassportRe;

public class PassportReImpl implements PassportRe {
    private final EntityManager entityManager= Config.getEntityManager();

    @Override
    public String savePass(Passport passport) {
        entityManager.getTransaction().begin();
        entityManager.persist(passport);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "Successfully saved on database!";
    }

    @Override
    public String deletePassById(Long id) {
        entityManager.getTransaction().begin();
        Passport passport = entityManager.find(Passport.class, id);
        entityManager.remove(passport);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "Successfully deleted";
    }

    @Override
    public String assignPassToClient(Long passId, Long clientId) {
        entityManager.getTransaction().begin();
        Passport passport = entityManager.find(Passport.class, passId);
        Client client = entityManager.find(Client.class, passId);
        passport.setClient(client);
        client.setPassport(passport);
        entityManager.merge(passport);
        entityManager.merge(client);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "Successfully assign";
    }
}
