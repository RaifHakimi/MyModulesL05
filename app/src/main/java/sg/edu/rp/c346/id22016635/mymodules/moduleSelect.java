package sg.edu.rp.c346.id22016635.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class moduleSelect extends AppCompatActivity {

    TextView modCode;
    TextView modName;
    TextView acadYear;
    TextView semester;
    TextView modCredit;
    TextView modVenue;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_select);
        modCode = findViewById(R.id.mCode);
        modName = findViewById(R.id.mName);
        acadYear = findViewById(R.id.mYear);
        semester = findViewById(R.id.mSem);
        modCredit = findViewById(R.id.mCred);
        modVenue = findViewById(R.id.mVenue);
        btn = findViewById(R.id.buttonBack);


        Intent intentReceived = getIntent();
        modCode.setText("yes" + intentReceived);
           String code = intentReceived.getStringExtra("code");
           String name = intentReceived.getStringExtra("name");
           int acadYr = intentReceived.getIntExtra("acadYear",0);
           int sem = intentReceived.getIntExtra("sem",0);
           int cred = intentReceived.getIntExtra("credit",0);
           String venue = intentReceived.getStringExtra("venue");

           modCode.setText("Module Code: "+code);
           modName.setText("Module Name: "+name);
           acadYear.setText("Academic Year: "+acadYr);
           semester.setText("Semester: "+sem);
           modCredit.setText("Module Credit: "+cred);
           modVenue.setText("Venue: "+venue);

            //modCode.setText("Double value received is: " + value);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
