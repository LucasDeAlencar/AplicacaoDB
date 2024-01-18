package primeiro.cliente.appminhaideiadb.datamodel;

/*Esta classe representara uma tabela no SQL*/
public class ClienteDataModel {

    /*Este vai ser o nome da tabela*/
    public static final String TABELA = "cliente";

    /*Estás variaveis vão representar as colunas*/
    public static final String ID = "id";// Integer
    public static final String NOME = "nome";// text
    public static final String EMAIl = "email";// text

    /*Criação da query par a tabela dos banco de dados*/
    public static String queryCriarTabela = "";

    /*Método para gerar o Script para criar a tabela*/
    public static String criarTabela(){

        queryCriarTabela += "CREATE TABLE IF NOT EXISTS " + TABELA +"("+
        ID+" integer primary key autoincrement, "+
        NOME+" text, "+
        EMAIl+" text"+")";

        return queryCriarTabela;
    }

}
