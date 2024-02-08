package br.com.mdantas.dao;

import br.com.mdantas.domain.Client;

import java.util.Collection;

public interface IClientDAO {

    public Boolean register(Client client);
    public void delete(String cpf);
    public void change(Client client);
    public Client consult(String cpf);
    public Collection<Client> searchAll();
}
