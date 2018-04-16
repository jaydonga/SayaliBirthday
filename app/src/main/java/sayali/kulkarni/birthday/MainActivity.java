package sayali.kulkarni.birthday;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);

        CustomViewPagerAdapter customViewPagerAdapter = new CustomViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(customViewPagerAdapter);

    }

    private class CustomViewPagerAdapter extends FragmentPagerAdapter{

        public CustomViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0 : return new Screen1Fragment();
                case 1 : return new Screen2Fragment();
                case 2 : return new Screen3Fragment();
                case 3 : return new Screen4Fragment();
                case 4 : return new Screen5Fragment();
            }

            return null;
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
