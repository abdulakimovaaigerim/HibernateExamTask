package peaksoft.service;

import peaksoft.entities.Passport;

public interface PassportService {
    String savePass(Passport passport);

    String deletePassById(Long id);

    String assignPassToClient(Long passId, Long clientId);
}
