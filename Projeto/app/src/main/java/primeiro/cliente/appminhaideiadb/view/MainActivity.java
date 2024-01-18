package primeiro.cliente.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import primeiro.cliente.appminhaideiadb.R;
import primeiro.cliente.appminhaideiadb.api.AppUtil;
import primeiro.cliente.appminhaideiadb.controller.ClienteController;
import primeiro.cliente.appminhaideiadb.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");

        clienteController = new ClienteController(getApplicationContext());

        Cliente cliente = new Cliente(1,"Nathan","nathaniel3492@gmail.com");

        if(clienteController.incluir(cliente)){

            Toast.makeText(MainActivity.this,"Incluido com sucesso",Toast.LENGTH_LONG);

        }else {
            Toast.makeText(MainActivity.this,"Não foi possivel fazer a inclução",Toast.LENGTH_LONG);

        }


    }
}