package mx.ed.tecnm.chihuahua2.bluet;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothA2dp;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import ingenieria.jhr.bluetoothjhr.BluetoothJhr;

public class MainActivity extends AppCompatActivity {

    ListView dispositivos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dispositivos = findViewById(R.id.dispositivos);

        final BluetoothJhr bluetoothJhr = new BluetoothJhr(this,dispositivos,Main2Activity.class);

        bluetoothJhr.onBluetooth();

        dispositivos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                bluetoothJhr.bluetoothSeleccion(i);
            }
        });

    }
}