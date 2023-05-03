package peaksoft.repository.impl;

import jakarta.persistence.EntityManager;
import peaksoft.config.Config;
import peaksoft.entities.Bank;
import peaksoft.entities.Client;
import peaksoft.entities.Region;
import peaksoft.repository.BankRe;

public class BankReImpl implements BankRe {
    private final EntityManager entityManager = Config.getEntityManager();


    @Override
    public String saveBank(Bank bank) {
        entityManager.getTransaction().begin();
        entityManager.persist(bank);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "Successfully saved on database!";
    }

    @Override
    public String deleteBankById(Long id) {
        entityManager.getTransaction().begin();
        Bank bank = entityManager.find(Bank.class, id);
        entityManager.remove(bank);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "Successfully deleted!";
    }

    @Override
    public Bank getBankByRegionName(String name) {
        entityManager.getTransaction().begin();
//        entityManager.createQuery("select b name from Bank b join Region regionName r on b.id = Bank.");
        entityManager.getTransaction().commit();
        entityManager.close();

        return null;
    }
}
