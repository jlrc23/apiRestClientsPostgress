package net.viamcom.apirest.models.services;

import net.viamcom.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente findByid(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);

}
