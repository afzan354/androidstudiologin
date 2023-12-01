package com.example.pakejava;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardDokterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_dokter);

        Button buttonLogout = findViewById(R.id.buttonLogout);

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi logout, mengarahkan kembali ke halaman login
                Intent intent = new Intent(DashboardDokterActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup activity saat ini
            }
        });
    }
}
