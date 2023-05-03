package peaksoft.service;

import peaksoft.entities.Bank;

public interface BankService {
    String saveBank(Bank bank);

    String deleteBankById(Long id);

    Bank getBankByName(String name);
}
