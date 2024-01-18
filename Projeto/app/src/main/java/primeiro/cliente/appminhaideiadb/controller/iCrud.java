package primeiro.cliente.appminhaideiadb.controller;

import java.util.List;

public interface iCrud<T> {

    public boolean incluir(T obj);

    public boolean alterar(T obj);

    public boolean deletar(int id);

    public List<T> listar();
}
