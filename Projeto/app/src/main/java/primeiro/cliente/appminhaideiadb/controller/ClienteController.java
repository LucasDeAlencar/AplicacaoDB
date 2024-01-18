package primeiro.cliente.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import primeiro.cliente.appminhaideiadb.api.AppUtil;
import primeiro.cliente.appminhaideiadb.datamodel.ClienteDataModel;
import primeiro.cliente.appminhaideiadb.datasource.AppDataBase;
import primeiro.cliente.appminhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase implements iCrud<Cliente>{

    ContentValues dadoDoObjeto;/*Serve para fazer alterações no banco de dados*/

    public ClienteController(@Nullable Context context) {
        super(context);

        Log.d(AppUtil.TAG,"ClientrController: Conectado ");
    }

    @Override
    public boolean incluir(Cliente obj) {
        /*Passa uma key e o o valor*/
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ClienteDataModel.NOME/*coluna*/,obj.getNome()/*Valor*/);
        dadoDoObjeto.put(ClienteDataModel.EMAIl/*coluna*/,obj.getEmail()/*Valor*/);

        return insert(ClienteDataModel.TABELA, dadoDoObjeto);
    }

    @Override
    public boolean alterar(Cliente obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ClienteDataModel.ID/*coluna*/,obj.getId()/*Valor*/);
        dadoDoObjeto.put(ClienteDataModel.NOME/*coluna*/,obj.getNome()/*Valor*/);
        dadoDoObjeto.put(ClienteDataModel.EMAIl/*coluna*/,obj.getEmail()/*Valor*/);

        return true;
    }

    @Override
    public boolean deletar(Cliente obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ClienteDataModel.ID/*coluna*/,obj.getId()/*Valor*/);

        return true;
    }

    @Override
    public List<Cliente> listar() {

        List<Cliente> lista = new ArrayList<>();
        return lista;

    }
}
