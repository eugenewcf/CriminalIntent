package android.bignerdranch.com.criminalintent;

import android.app.ListFragment;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by eugene.wong on 4/12/2014.
 */
public class CrimeListFragment extends ListFragment {
    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.id.crime_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();
    }
}
