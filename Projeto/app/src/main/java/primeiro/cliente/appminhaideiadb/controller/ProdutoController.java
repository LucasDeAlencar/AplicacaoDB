package primeiro.cliente.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import primeiro.cliente.appminhaideiadb.datamodel.ClienteDataModel;
import primeiro.cliente.appminhaideiadb.datamodel.ProdutoDataModel;
import primeiro.cliente.appminhaideiadb.datasource.AppDataBase;
import primeiro.cliente.appminhaideiadb.model.Produto;

public class ProdutoController extends AppDataBase implements iCrud<Produto>{

    ContentValues dadoDoObjeto;

    public ProdutoController(@Nullable Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.NOME,obj.getNome());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());

        return insert(ClienteDataModel.TABELA, dadoDoObjeto);
    }

    @Override
    public boolean alterar(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.ID,obj.getId());
        dadoDoObjeto.put(ProdutoDataModel.NOME,obj.getNome());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());

        return false;
    }

    @Override
    public boolean deletar(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.ID,obj.getId());

        return false;
    }

    @Override
    public List<Produto> listar() {

        List<Produto> lista = new ArrayList<>();

        return lista;
    }
}
