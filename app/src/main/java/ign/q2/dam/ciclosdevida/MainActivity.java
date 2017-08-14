package ign.q2.dam.ciclosdevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifeCycle";
    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Toast.makeText(this, "The onSaveInstanceState method is being executed", Toast.LENGTH_LONG).show();
        bundle.putString("VALUE", "¿Esto ha sido guardado?");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mainlayout);
        Log.d(TAG, "In the onCreate()event");

        if (savedInstanceState != null)
            Toast.makeText(this, savedInstanceState.getString("VALUE"), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Executing method onCreate", Toast.LENGTH_LONG).show();
    }


    public void onStart() {
        super.onStart();
        Log.d(TAG, "In the onStart() event");
    }

    public void onRestart() {
        super.onRestart();
        Log.d(TAG, "In the onRestart() event");
    }

    public void onResume() {
        super.onResume();
        Log.d(TAG, "In the onResume() event");
    }

    public void onPause() {
        super.onPause();
        Log.d(TAG, "In the onPause() event");
    }

    public void onStop() {
        super.onStop();
        Log.d(TAG, "In the onStop() event");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "In the onDestroy() event");

    }
}
