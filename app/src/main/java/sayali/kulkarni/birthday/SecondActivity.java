package sayali.kulkarni.birthday;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ViewPager viewPager = findViewById(R.id.view_pager2);

        CustomViewPagerAdapter customViewPagerAdapter = new CustomViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(customViewPagerAdapter);
    }

    private class CustomViewPagerAdapter extends FragmentPagerAdapter {

        public CustomViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0 : return new Name1();
                case 1 : return new Name2();
                case 2 : return new Name3();
                case 3 : return new Name4();
                case 4 : return new Name5();
                case 5 : return new Name6();
                case 6 : return new Name7();
            }

            return null;
        }

        @Override
        public int getCount() {
            return 7;
        }
    }
}
