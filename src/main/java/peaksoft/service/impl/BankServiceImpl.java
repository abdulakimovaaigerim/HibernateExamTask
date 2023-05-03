package peaksoft.service.impl;

import peaksoft.entities.Bank;
import peaksoft.repository.BankRe;
import peaksoft.service.BankService;

public class BankServiceImpl implements BankService {

    private  BankRe bankRe;


    @Override
    public String saveBank(Bank bank) {
        return bankRe.saveBank(bank);
    }

    @Override
    public String deleteBankById(Long id) {
        return bankRe.deleteBankById(id);
    }

    @Override
    public Bank getBankByName(String name) {
        return bankRe.getBankByRegionName(name);
    }
}
