package com.example.ayamoneim.myappportfolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        setLibraryAppButtonListener(view);
        setSpotifyStreamerAppButtonListener(view);
        setXYZReaderButtonListener(view);
        setCapstoneButtonListener(view);
        setBuildItBiggerAppButtonListener(view);
        setScoresAppButtonListener(view);
        return view;
    }

    public void setLibraryAppButtonListener(View view){
        Button button = (Button) view.findViewById(R.id.library_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getActivity().getApplicationContext();
                CharSequence text = "Library App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
    public void setSpotifyStreamerAppButtonListener(View view){
        Button button = (Button) view.findViewById(R.id.spotify_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getActivity().getApplicationContext();
                CharSequence text = "Spotify Streamer App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
    public void setXYZReaderButtonListener(View view){
        Button button = (Button) view.findViewById(R.id.xyz_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getActivity().getApplicationContext();
                CharSequence text = "XYZ Reader App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
    public void setCapstoneButtonListener(View view){
        Button button = (Button) view.findViewById(R.id.capstone_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getActivity().getApplicationContext();
                CharSequence text = "Capstone: My Own App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
    public void setBuildItBiggerAppButtonListener(View view){
        Button button = (Button) view.findViewById(R.id.build_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getActivity().getApplicationContext();
                CharSequence text = "Build It Bigger App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    public void setScoresAppButtonListener(View view){
        Button button = (Button) view.findViewById(R.id.scores_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getActivity().getApplicationContext();
                CharSequence text = "Scores App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

}
