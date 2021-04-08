package www.studyviewer.fragementexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import www.studyviewer.fragementexample.Fragment.FirstFragment;
import www.studyviewer.fragementexample.Fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {
    Button first, second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragementfirst();

        first = findViewById(R.id.btn_first);
        second = findViewById(R.id.btn_second);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragementfirst();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, secondFragment);
                transaction.commit();

            }
        });
    }
    private void fragementfirst() {
        FirstFragment firstFragment = new FirstFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.linearlayout,firstFragment);
        transaction.commit();

    }

}