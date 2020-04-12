package android.example.fragmentexample2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SecondActivity extends AppCompatActivity {

    private Button mButton;
    private Boolean isFragmentDisplayed = false;
    static final String STATE_FRAGMENT = "state_of_fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurePrevButton();
//        mButton = findViewById(R.id.open_button);
//
//        mButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!isFragmentDisplayed) {
//                    displayFragment();
//                } else {
//                    closeFragment();
//                }
//            }
//        });
//
//        if (savedInstanceState != null) {
//            isFragmentDisplayed = savedInstanceState.getBoolean(STATE_FRAGMENT);
//            if (isFragmentDisplayed) {
//                mButton.setText(R.string.close);
//            }
//        }
    }

    private void configurePrevButton() {
        Button prevButton = findViewById(R.id.prev_button);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
//    public void displayFragment() {
//        SimpleFragment simpleFragment = SimpleFragment.newInstance();
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        fragmentTransaction.add(R.id.fragment_container, simpleFragment).addToBackStack(null).commit();
//
//        mButton.setText(R.string.close);
//
//        isFragmentDisplayed = true;
//    }
//
//    public void closeFragment() {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        SimpleFragment simpleFragment = (SimpleFragment) fragmentManager.findFragmentById(R.id.fragment_container);
//
//        if (simpleFragment != null) {
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            fragmentTransaction.remove(simpleFragment).commit();
//        }
//
//        mButton.setText(R.string.open);
//
//        isFragmentDisplayed = false;
//    }
//
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//        savedInstanceState.putBoolean(STATE_FRAGMENT, isFragmentDisplayed);
//        super.onSaveInstanceState(savedInstanceState);
//    }
}
