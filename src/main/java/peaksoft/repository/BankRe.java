package peaksoft.repository;

import peaksoft.entities.Bank;

public interface BankRe {

    String saveBank(Bank bank);

    String deleteBankById(Long id);

    Bank getBankByRegionName(String name);

}
