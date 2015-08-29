package com.example.rlmendez.propinas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class propinas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propinas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_propinas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Calculo(View Propina_Valor){
        Spinner tip_cliente = (Spinner)findViewById(R.id.tipo_cliente);
        String tipo = tip_cliente.getSelectedItem().toString();

        EditText Valor = (EditText)findViewById(R.id.Valor_Compra);
        TextView V_Propina = (TextView)findViewById(R.id.Valor_PropinaP);

        String val = Valor.getText().toString();
        int num = Integer.parseInt(val);

        double VP = 0;

        if (tipo=="VIP"){
           VP = num*0.03;
        }//if
        else{
            if (tipo=="Frecuente"){
                VP = num*0.08;
            }//if
            else {
            if (tipo=="Casual"){
                VP = num*0.1;
                                }//if
                }//else
            }//else

        String cadena = String.valueOf(VP);

        V_Propina.setText("$ "+cadena+"=");


    }//void

}
