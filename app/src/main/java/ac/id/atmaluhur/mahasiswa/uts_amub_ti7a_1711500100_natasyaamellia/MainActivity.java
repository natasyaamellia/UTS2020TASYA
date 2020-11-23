package ac.id.atmaluhur.mahasiswa.uts_amub_ti7a_1711500100_natasyaamellia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button BtnLogin , BtnRegister ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi tombol
        BtnLogin = findViewById(R.id.btnlogin);
        BtnRegister = findViewById(R.id.btnreg);

        //toast
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MainActivity.this, RegisterOneAct.class);
                startActivity(i);

            }
        });

        //intent
        BtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, RegisterOneAct.class);
                startActivity(i);
            }
        });


    }
}
