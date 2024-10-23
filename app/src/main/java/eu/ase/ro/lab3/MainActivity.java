package eu.ase.ro.lab3;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menu_option_1) {
            Toast.makeText(getApplicationContext(),
                    R.string.option1, Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.menu_option_2) {
            Toast.makeText(getApplicationContext(),
                    R.string.option2, Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}