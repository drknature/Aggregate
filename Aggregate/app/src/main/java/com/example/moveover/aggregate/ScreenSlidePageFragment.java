package com.example.moveover.aggregate;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

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
