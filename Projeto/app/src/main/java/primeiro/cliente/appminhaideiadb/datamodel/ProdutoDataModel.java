package primeiro.cliente.appminhaideiadb.datamodel;

import android.database.sqlite.SQLiteOpenHelper;

public class ProdutoDataModel {

    public static final String TABELA = "produto";


    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String FORNECEDOR = "fornecedor";


    public static String query = "";


    public static String criarTabela(){
        query += "CREATE TABLE IF NOT EXISTS" + TABELA +" ("+
                ID+" integer primary key autoincrement, "+
                NOME+" text, "+
                FORNECEDOR+" text"+")";

        return query;
    }


}
