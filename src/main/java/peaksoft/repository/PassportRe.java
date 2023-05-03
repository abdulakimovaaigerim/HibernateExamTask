package peaksoft.repository;

import peaksoft.entities.Passport;

public interface PassportRe {
    String savePass(Passport passport);

    String deletePassById(Long id);

    String assignPassToClient(Long passId, Long clientId);

}
