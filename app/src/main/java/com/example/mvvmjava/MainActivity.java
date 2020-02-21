package com.example.mvvmjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.mvvmjava.databinding.ActivityMainBinding;
import com.example.mvvmjava.veiwmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    MainViewModel mainViewModel;
    TextView textview2;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewmodel(mainViewModel);
        binding.setLifecycleOwner(this);

        init();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(mainViewModel.name.getValue());

            }
        });

        textView.setText(mainViewModel.name.getValue());
    }

    private void init() {
        textView = findViewById(R.id.text);
         editText = findViewById(R.id.edit_text);
         button = findViewById(R.id.btn);

    }
}
