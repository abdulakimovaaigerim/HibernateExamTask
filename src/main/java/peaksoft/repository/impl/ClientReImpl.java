package peaksoft.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import peaksoft.config.Config;
import peaksoft.entities.Client;
import peaksoft.repository.ClientRe;

public class ClientReImpl implements ClientRe {
    private final EntityManager entityManager= Config.getEntityManager();

    @Override
    public String saveClient(Client client) {
        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "Successfully saved on database!";
    }

    @Override
    public String deleteClientById(Long id) {
        entityManager.getTransaction().begin();
        Client client = entityManager.find(Client.class, id);
        entityManager.remove(client);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "Successfully deleted!";
    }

    @Override
    public Client getClientById(Long id) {
        entityManager.getTransaction().begin();
        Client client = entityManager.find(Client.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();

        return client;
    }
}
