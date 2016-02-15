package com.ernietech.myappportfolio;

import android.app.Activity;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MyAppPortfolio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new ButtonViewFragment())
                    .commit();
        }
    }

    // Listeners for buttons
    private static final String toastPrefix = "This button will launch ";

    public void makeToast1(View view){
        Toast.makeText(getApplicationContext(), toastPrefix + getString(R.string.spotify_streamer),
                Toast.LENGTH_SHORT).show();
        return;
    }

    public void makeToast2(View view){
        Toast.makeText(getApplicationContext(), toastPrefix + getString(R.string.scores_app),
                Toast.LENGTH_SHORT).show();
        return;
    }

    public void makeToast3(View view){
        Toast.makeText(getApplicationContext(), toastPrefix + getString(R.string.library_app),
                Toast.LENGTH_SHORT).show();
        return;
    }

    public void makeToast4(View view){
        Toast.makeText(getApplicationContext(), toastPrefix + getString(R.string.build_it_bigger),
                Toast.LENGTH_SHORT).show();
        return;
    }

    public void makeToast5(View view){
        Toast.makeText(getApplicationContext(), toastPrefix + getString(R.string.xyz_reader),
                Toast.LENGTH_SHORT).show();
        return;
    }

    public void makeToast6(View view){
        Toast.makeText(getApplicationContext(), toastPrefix + getString(R.string.capstone),
                Toast.LENGTH_SHORT).show();
        return;
    }

    public static class ButtonViewFragment extends Fragment {
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//            return super.onCreateView(inflater, container, savedInstanceState);
            //inflate fragment
            return inflater.inflate(R.layout.fragment_app_launcher, container, false);
        }
    }
}
