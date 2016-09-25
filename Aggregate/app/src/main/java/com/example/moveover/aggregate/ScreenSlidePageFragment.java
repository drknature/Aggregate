package com.example.moveover.aggregate;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.Typeface;
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
    TextView desc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_page, container, false);

        // Set the title view to show the page number.
        if (mPageNumber == 0) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q1));
        }

        if (mPageNumber == 1) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q2));
        }

        if (mPageNumber == 2) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q3));
        }

        if (mPageNumber == 3) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q4));
        }

        if (mPageNumber == 4) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q5));
        }

        if (mPageNumber == 5) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q6));
        }

        if (mPageNumber == 6) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q7));
        }

        if (mPageNumber == 7) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q8));
        }

        if (mPageNumber == 8) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q9));
        }

        if (mPageNumber == 9) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q10));
        }

        if (mPageNumber == 10) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q11));
        }

        if (mPageNumber == 11) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q12));
        }

        if (mPageNumber == 12) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q13));
        }

        if (mPageNumber == 13) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q14));
        }

        if (mPageNumber == 14) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q15));
        }

        if (mPageNumber == 15) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q16));
        }

        if (mPageNumber == 16) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q17));
        }

        if (mPageNumber == 17) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q18));
        }

        if (mPageNumber == 18) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q19));
        }

        if (mPageNumber == 19) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q20));
        }

        if (mPageNumber == 20) {
            TextView text1a = (TextView) rootView.findViewById(android.R.id.text1);
            TextView text1b = (TextView) rootView.findViewById(R.id.textView12);
            text1a.setText(
                    "QUESTION " + (mPageNumber + 1) + "/" + (Scrolling.NUM_PAGES)
            );
            text1a.setTypeface(null, Typeface.BOLD);
            text1b.setText(getResources().getString(R.string.Q21));
        }
        if (mPageNumber == 21) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    getResources().getString(R.string.Q22)
            );
        }


        seek = (SeekBar) rootView.findViewById(R.id.seekBar2);

        scale = (TextView) rootView.findViewById(R.id.scaling);

        desc = (TextView) rootView.findViewById(R.id.description);

        seek.setMax(5);

        scale.setText(seek.getProgress() + "/" + seek.getMax());

        // QUESTION
        if (mPageNumber == 21) {
            seek.setAlpha(00);
            scale.setAlpha(00);
        }

        if (mPageNumber != 21) {
            desc.setText("Not at all");
        } else {
            desc.setTextColor(Color.WHITE);
            desc.setTextSize(1);
        }
        seek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progressed;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressed = progress;
                        scale.setText(progress + "/" + seek.getMax());

                        if (mPageNumber == 0 || mPageNumber == 1 || mPageNumber == 2 || mPageNumber == 3 ||
                                mPageNumber == 4 || mPageNumber == 5 || mPageNumber == 6 || mPageNumber == 7 || mPageNumber == 8
                                || mPageNumber == 7 || mPageNumber == 9 || mPageNumber == 10 || mPageNumber == 13 || mPageNumber == 16 ||
                                mPageNumber == 18 || mPageNumber == 20 ) {

                            if (progress == 0) {
                                desc.setText("Not at all");
                            }

                            if (progress >= 1 && progress <= 4) {
                                desc.setText("");
                            }

                            if (progress == 5) {
                                desc.setText("Very");
                            }
                        }

                        if (mPageNumber == 5) {
                            if (progress == 0) {
                                desc.setText("Not at all");
                            }

                            if (progress >= 1 && progress <= 4) {
                                desc.setText("");
                            }

                            if (progress == 5) {
                                desc.setText("Big problem");
                            }
                        }

                        if (mPageNumber == 11) {
                            if (progress == 0) {
                                desc.setText("Not at all");
                            }

                            if (progress >= 1 && progress <= 4) {
                                desc.setText("");
                            }

                            if (progress == 5) {
                                desc.setText("Drastically");
                            }
                        }

                        if (mPageNumber == 12) {
                            if (progress == 0) {
                                desc.setText("Not at all");
                            }

                            if (progress >= 1 && progress <= 4) {
                                desc.setText("");
                            }

                            if (progress == 5) {
                                desc.setText("Drastically");
                            }
                        }

                        if (mPageNumber == 14) {
                            if (progress == 0) {
                                desc.setText("Not much");
                            }

                            if (progress >= 1 && progress <= 4) {
                                desc.setText("");
                            }

                            if (progress == 5) {
                                desc.setText("Almost all");
                            }
                        }

                        if (mPageNumber == 15) {
                            if (progress == 0) {
                                desc.setText("Spend much of your time on outside hobbies/activities");
                            }

                            if (progress >= 1 && progress <= 4) {
                                desc.setText("");
                            }

                            if (progress == 5) {
                                desc.setText("All on class");
                            }
                        }

                        if (mPageNumber == 17) {
                            if (progress == 0) {
                                desc.setText("Not at all");
                            }

                            if (progress >= 1 && progress <= 4) {
                                desc.setText("");
                            }

                            if (progress == 5) {
                                desc.setText("Absolutely");
                            }
                        }

                        if (mPageNumber == 19) {
                            if (progress == 0) {
                                desc.setText("Not at all");
                            }

                            if (progress >= 1 && progress <= 4) {
                                desc.setText("");
                            }

                            if (progress == 5) {
                                desc.setText("Absolutely");
                            }
                        }

                        if (mPageNumber == 21) {
                            if (progress >= -1 && progress <= 5) {
                                desc.setText("");
                            }
                        }

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
                        if (mPageNumber == 0 || mPageNumber == 1 || mPageNumber == 2 || mPageNumber == 3 ||
                                mPageNumber == 4 || mPageNumber == 5) {
                            if (progressed == 0) {
                                desc.setText("Not at all");
                            }

                            if (progressed >= 1 && progressed <= 4) {
                                desc.setText("");
                            }

                            if (progressed == 5) {
                                desc.setText("Very");
                            }
                        }
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
