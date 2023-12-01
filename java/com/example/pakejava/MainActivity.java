package com.example.pakejava;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        buttonLogin = findViewById(R.id.button);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    // Mengambil nilai input dari EditText
                    String username = editTextUsername.getText().toString().trim();
                    String password = editTextPassword.getText().toString().trim();

                    // Memeriksa apakah username dan password sesuai dengan yang diharapkan
                    if (username.equals("admin") && password.equals("admin")) {
                        // Jika sesuai, alihkan ke halaman dashboard admin
                        Intent intent = new Intent(MainActivity.this, DashboardAdminActivity.class);
                        startActivity(intent);
                        finish(); // Menutup activity saat ini
                    } else if (username.equals("dokter") && password.equals("dokter")) {
                        // Jika sesuai, alihkan ke halaman dashboard dokter
                        Intent intent = new Intent(MainActivity.this, DashboardDokterActivity.class);
                        startActivity(intent);
                        finish();
                    } else if (username.equals("pasien") && password.equals("pasien")) {
                        // Jika sesuai, alihkan ke halaman dashboard pasien
                        Intent intent = new Intent(MainActivity.this, DashboardPasienActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        // Jika tidak sesuai, tampilkan pesan kesalahan
                        Toast.makeText(MainActivity.this, "Login Gagal. Coba lagi.", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Terjadi kesalahan: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
