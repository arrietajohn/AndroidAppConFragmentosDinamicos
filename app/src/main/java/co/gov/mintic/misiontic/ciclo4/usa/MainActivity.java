package co.gov.mintic.misiontic.ciclo4.usa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import co.gov.mintic.misiontic.ciclo4.usa.fragmentos.FragmentoContadorClick;

public class MainActivity extends AppCompatActivity {

    int cuentFragmentos = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregarFragmentos(View view) {
        FragmentManager controladorFrag = getSupportFragmentManager();
        FragmentTransaction transaccionFrag = controladorFrag.beginTransaction();
        cuentFragmentos++;
        FragmentoContadorClick f = new FragmentoContadorClick(cuentFragmentos+"");
        transaccionFrag.add(R.id.contenedorFagmentos, f);
        transaccionFrag.commit();
    }
}