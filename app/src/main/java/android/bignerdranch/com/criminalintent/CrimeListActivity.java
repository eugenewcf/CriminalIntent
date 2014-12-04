package android.bignerdranch.com.criminalintent;

import android.app.Fragment;

/**
 * Created by Eugene on 12/4/2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
