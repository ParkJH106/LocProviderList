package kr.ac.smu.smart0356.locproviderlist;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity implements View.OnClickListener{
    TextView mTextView;
    LocationManager locMgr;
    List<String> locProviders;
    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.txtOutput);
        mbutton = findViewById(R.id.button);
        locMgr = (LocationManager) getSystemService((LOCATION_SERVICE));

        mbutton.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        locProviders = locMgr.getAllProviders();
        String s = "";

        for(String str : locProviders) {
            str += "Loc.Provider: " + locProviders + "\n"
                    + "Status: " + locMgr.isProviderEnabled(locProviders + "\n\n");
            mTextView.setText(str);
        }

    }

}
