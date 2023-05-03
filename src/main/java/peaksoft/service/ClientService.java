package peaksoft.service;

import peaksoft.entities.Client;

public interface ClientService {
    String saveClient(Client client);

    String deleteClientById(Long id);

    Client getClientById(Long id);
}
