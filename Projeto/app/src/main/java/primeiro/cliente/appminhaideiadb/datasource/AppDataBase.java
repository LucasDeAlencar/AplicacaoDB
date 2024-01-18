package primeiro.cliente.appminhaideiadb.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import primeiro.cliente.appminhaideiadb.api.AppUtil;
import primeiro.cliente.appminhaideiadb.datamodel.ClienteDataModel;
import primeiro.cliente.appminhaideiadb.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "AppMinhaIdeia.sqlite";
    public static final int DB_VERSION = 1;
    SQLiteDatabase db;

    public AppDataBase(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();/*Permite a escrita no banco de dados*/
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTabela());
        db.execSQL(ProdutoDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }

    /* Método para incluir dados no banco de dados */
    public boolean insert(String tabela, ContentValues dados){

        db = getWritableDatabase();

        boolean retorno = false;

        try{
            retorno = db.insert(tabela,null,dados) > 0/*Caso seja maior que 0 quer dizer que execulto(retorna true)*/;
        }catch (Exception e){
            Log.d(AppUtil.TAG,"insert:"+e.getMessage());
        }

        return retorno;
    }

    /* Método para remover dados no banco de dados */
    public boolean deleteByID(String tabela,int id){

        db = getWritableDatabase();

        boolean retorno = false;

        try{
            retorno = db.delete(tabela,"id = ?",new String[]{String.valueOf(id)}) > 0;
        }catch (Exception e){
            Log.d(AppUtil.TAG,"delete:"+e.getMessage());
        }

        return retorno;
    }
}
