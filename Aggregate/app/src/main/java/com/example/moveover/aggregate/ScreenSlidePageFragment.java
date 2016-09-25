package com.example.moveover.aggregate;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ScreenSlidePageFragment extends Fragment {
    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlidePageFragment create(int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlidePageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    SeekBar seek;
    TextView scale;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_page, container, false);

        // Set the title view to show the page number.
        if (mPageNumber == 0) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q1)
            );
        }

        if (mPageNumber == 1) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q2)
            );
        }

        if (mPageNumber == 2) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q3)
            );
        }

        if (mPageNumber == 3) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q4)
            );
        }

        if (mPageNumber == 4) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q5)
            );
        }

        if (mPageNumber == 5) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q6)
            );
        }

        if (mPageNumber == 6) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q7)
            );
        }

        if (mPageNumber == 7) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q8)
            );
        }

        if (mPageNumber == 8) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q9)
            );
        }

        if (mPageNumber == 9) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q10)
            );
        }

        if (mPageNumber == 10) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q11)
            );
        }

        if (mPageNumber == 11) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q12)
            );
        }

        if (mPageNumber == 12) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q13)
            );
        }

        if (mPageNumber == 13) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q14)
            );
        }

        if (mPageNumber == 14) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q15)
            );
        }

        if (mPageNumber == 15) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q16)
            );
        }

        if (mPageNumber == 16) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q17)
            );
        }

        if (mPageNumber == 17) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q18)
            );
        }

        if (mPageNumber == 18) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q19)
            );
        }

        if (mPageNumber == 19) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q20)
            );
        }

        if (mPageNumber == 20) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    "Question " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
                            + "\n" + getResources().getString(R.string.Q21)
            );
        }
        if (mPageNumber == 21) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    getResources().getString(R.string.Q22)
            );
        }


        seek = (SeekBar) rootView.findViewById(R.id.seekBar2);

        scale = (TextView) rootView.findViewById(R.id.scaling);

        seek.setMax(5);

        scale.setText(seek.getProgress() + "/" + seek.getMax());

        // QUESTION


        seek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progressed;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressed = progress;
                        scale.setText(progress + "/" + seek.getMax());
                        if(mPageNumber == 0) {
                            MainActivity.mySurvey.set_stress(progressed);
                        }
                        if(mPageNumber == 1) {
                            MainActivity.mySurvey.set_anxiety(progressed);
                        }
                        if(mPageNumber == 2) {
                            MainActivity.mySurvey.set_worried_future(progressed);
                        }
                        if(mPageNumber == 3) {
                            MainActivity.mySurvey.set_depressed(progressed);
                        }
                        if(mPageNumber == 4) {
                            MainActivity.mySurvey.set_hours_work(progressed);
                        }
                        if(mPageNumber == 5) {
                            MainActivity.mySurvey.set_hours_sleep(progressed);
                        }
                        if(mPageNumber == 6) {
                            MainActivity.mySurvey.set_asleep_class(progressed);
                        }
                        if(mPageNumber == 7) {
                            MainActivity.mySurvey.set_all_nighters(progressed);
                        }
                        if(mPageNumber == 8) {
                            MainActivity.mySurvey.set_hours_exercise(progressed);
                        }
                        if(mPageNumber == 9) {
                            MainActivity.mySurvey.set_intensity_exercise(progressed);
                        }
                        if(mPageNumber == 10) {
                            MainActivity.mySurvey.set_nutrition_consistent(progressed);
                        }
                        if(mPageNumber == 11) {
                            MainActivity.mySurvey.set_gain_increase(progressed);
                        }
                        if(mPageNumber == 12) {
                            MainActivity.mySurvey.set_loss_decrease(progressed);
                        }
                        if(mPageNumber == 13) {
                            MainActivity.mySurvey.set_relationship_stability(progressed);
                        }
                        if(mPageNumber == 14) {
                            MainActivity.mySurvey.set_hanging_time(progressed);
                        }
                        if(mPageNumber == 15) {
                            MainActivity.mySurvey.set_hobbies_time(progressed);
                        }
                        if(mPageNumber == 16) {
                            MainActivity.mySurvey.set_class_interest(progressed);
                        }
                        if(mPageNumber == 17) {
                            MainActivity.mySurvey.set_learning_importance(progressed);
                        }
                        if(mPageNumber == 18) {
                            MainActivity.mySurvey.set_class_difficulty(progressed);
                        }
                        if(mPageNumber == 19) {
                            MainActivity.mySurvey.set_class_speed(progressed);
                        }
                        if(mPageNumber == 20) {
                            MainActivity.mySurvey.set_hours_per_week(progressed);
                        }
                        if(mPageNumber == 21){
                            MainActivity.sendData();
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        scale.setText(progressed + "/" + seek.getMax());
                    }
                }
        );


        return rootView;
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
}
