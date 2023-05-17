package sg.edu.rp.c346.id22016635.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView modC203;
    TextView modC206;
    TextView modC218;
    TextView modC235;
    TextView modC346;
    TextView modG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modC203 = findViewById(R.id.modC203);
        modC206 = findViewById(R.id.modC206);
        modC218 = findViewById(R.id.modC218);
        modC235 = findViewById(R.id.modC235);
        modC346 = findViewById(R.id.modC346);
        modG953 = findViewById(R.id.modG953);

        modC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleSelect.class);
                intent.putExtra("code","C203");
                intent.putExtra("name","Web AppIn Development in php");
                intent.putExtra("acadYear",2023);
                intent.putExtra("sem",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W65C");
                startActivity(intent);
            }
        });

        modC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleSelect.class);
                intent.putExtra("code","C206");
                intent.putExtra("name","Software Development Process");
                intent.putExtra("acadYear",2023);
                intent.putExtra("sem",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W65C");
                startActivity(intent);
            }
        });

        modC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleSelect.class);
                intent.putExtra("code","C218");
                intent.putExtra("name","UI/UX Design for apps");
                intent.putExtra("acadYear",2023);
                intent.putExtra("sem",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W65C");
                startActivity(intent);
            }
        });

        modC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleSelect.class);
                intent.putExtra("code","C235");
                intent.putExtra("name","IT Security and Management");
                intent.putExtra("acadYear",2023);
                intent.putExtra("sem",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W65C");
                startActivity(intent);
            }
        });

        modC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleSelect.class);
                intent.putExtra("code","C346");
                intent.putExtra("name","Mobile App Development");
                intent.putExtra("acadYear",2023);
                intent.putExtra("sem",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","E63A");
                startActivity(intent);
            }
        });

        modG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleSelect.class);
                intent.putExtra("code","G953");
                intent.putExtra("name","Life Skills III");
                intent.putExtra("acadYear",2023);
                intent.putExtra("sem",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","HB02");
                startActivity(intent);
            }
        });
    }
}