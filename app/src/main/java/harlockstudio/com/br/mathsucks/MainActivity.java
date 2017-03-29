package harlockstudio.com.br.mathsucks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText porcentagemInput;
    EditText valorInput;
    TextView resultadoTxt;
    Button calcularBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        porcentagemInput = (EditText) findViewById(R.id.editPorcentagem);
        valorInput = (EditText) findViewById(R.id.editValor);
        resultadoTxt = (TextView) findViewById(R.id.textResultado);
        calcularBtn = (Button) findViewById(R.id.btnCalcular);
        calcularBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float porcentagem = Float.parseFloat(porcentagemInput.getText().toString());
                float valor =  Float.parseFloat(valorInput.getText().toString());
                float resultado = ((valor/100)*porcentagem);
                resultadoTxt.setText(String.valueOf(resultado));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
