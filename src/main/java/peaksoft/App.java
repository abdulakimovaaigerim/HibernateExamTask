package peaksoft;

import peaksoft.entities.Bank;
import peaksoft.entities.Client;
import peaksoft.entities.Passport;
import peaksoft.entities.Region;
import peaksoft.repository.BankRe;
import peaksoft.repository.ClientRe;
import peaksoft.repository.PassportRe;
import peaksoft.repository.RegionRe;
import peaksoft.repository.impl.BankReImpl;
import peaksoft.repository.impl.ClientReImpl;
import peaksoft.repository.impl.PassportReImpl;
import peaksoft.repository.impl.RegionReImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        BankRe bankRe = new BankReImpl();
//        System.out.println(bankRe.saveBank(new Bank("KYRGYLOHF", "ALFHLUG")));
//        System.out.println(bankRe.deleteBankById(3L));



        ClientRe clientRe = new ClientReImpl();
//        System.out.println(clientRe.saveClient(new Client("Aigerim Bektenova", "+996700875997")));
//        System.out.println(clientRe.getClientById(2L));
//        System.out.println(clientRe.deleteClientById(2L));

        RegionRe regionRe = new RegionReImpl();
//        System.out.println(regionRe.saveRegion(new Region("Batken")));
//        System.out.println(regionRe.getAllRegions());
//        System.out.println(regionRe.updateRegion(2L, new Region("Jalal_Abad")));

        PassportRe passportRe = new PassportReImpl();
//        System.out.println(passportRe.savePass(new Passport("p987654")));
//        System.out.println(passportRe.deletePassById(2L));
        System.out.println(passportRe.assignPassToClient(1L, 1L));


    }
}
