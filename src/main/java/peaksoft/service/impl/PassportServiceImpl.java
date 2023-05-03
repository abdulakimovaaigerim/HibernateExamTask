package peaksoft.service.impl;

import peaksoft.entities.Passport;
import peaksoft.repository.PassportRe;
import peaksoft.service.PassportService;

public class PassportServiceImpl implements PassportService {
    private PassportRe passportRe;
    @Override
    public String savePass(Passport passport) {
        return passportRe.savePass(passport);
    }

    @Override
    public String deletePassById(Long id) {
        return passportRe.deletePassById(id);
    }

    @Override
    public String assignPassToClient(Long passId, Long clientId) {
        return passportRe.assignPassToClient(passId, clientId);
    }
}
