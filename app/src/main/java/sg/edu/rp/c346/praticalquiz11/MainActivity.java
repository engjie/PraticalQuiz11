package sg.edu.rp.c346.praticalquiz11;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etAccount;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAccount= findViewById(R.id.editTextAccount);
        btnsubmit = findViewById(R.id.buttonSubmit);


        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                final String ettext = etAccount.getText().toString();
                myBuilder.setTitle("Account Submission");

                myBuilder.setMessage("Submit: "+ettext);
                myBuilder.setNegativeButton("CANCEL", null);
                myBuilder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),ettext+" Submitted", Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });


            }




        }



