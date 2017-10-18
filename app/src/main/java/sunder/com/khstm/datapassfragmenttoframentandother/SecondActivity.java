package sunder.com.khstm.datapassfragmenttoframentandother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
String message,message1="2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);




        //fetch data from ReceptionHomeFragment
        Intent intent = getIntent();
        message = intent.getStringExtra("Regular_visitor");
        Toast.makeText(this, "Hello:"+message, Toast.LENGTH_SHORT).show();


        //read how to send data same activity to fragment on javatpoint






    }

    //another way fetch data activity to fragment

    public String getMyData() {
        return message1;
    }

    //some way are interface and sharedPrefrence
}
