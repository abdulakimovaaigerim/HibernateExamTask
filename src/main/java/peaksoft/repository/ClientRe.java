package peaksoft.repository;

import peaksoft.entities.Client;

public interface ClientRe {
    String saveClient(Client client);

    String deleteClientById(Long id);

    Client getClientById(Long id);
}
