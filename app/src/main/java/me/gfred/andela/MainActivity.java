package me.gfred.andela;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Objects.requireNonNull(getSupportActionBar()).setTitle("ALC 4.0 Phase 1");
    }

    @OnClick(R.id.button_about_alc)
    void launchWebview() {
        Intent intent = new Intent(MainActivity.this, AboutAlcActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.button_my_profile)
    void launchProfile() {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);

    }
}
