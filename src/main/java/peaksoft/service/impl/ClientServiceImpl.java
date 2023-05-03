package peaksoft.service.impl;

import peaksoft.entities.Client;
import peaksoft.repository.ClientRe;

public class ClientServiceImpl implements ClientRe {
    private ClientRe clientRe;
    @Override
    public String saveClient(Client client) {
        return clientRe.saveClient(client);
    }

    @Override
    public String deleteClientById(Long id) {
        return clientRe.deleteClientById(id);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRe.getClientById(id);
    }
}
