package com.zhwilson.pr.imitate.welcom;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.zhwilson.pr.imitate.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pr on 2015/11/27.
 */
public class WelcomActivity extends AppCompatActivity implements WelcomeFragment.WelcomeFragmentContainer{
    private static WelcomeActivityContent welcomeFragment;
    private Context context;
    public static boolean shouldDisplay(){
//        welcomeFragment = get
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.avtivity_wel);
    }

    private static WelcomeActivityContent getFragment(){
        for (WelcomeActivityContent fragment:getFragments()) {
//            if (fragment.shouldDisplay())
        }
        return null;
    }

    private static List<WelcomeActivityContent> getFragments(){
        return new ArrayList<WelcomeActivityContent>(Arrays.asList(new TosFragment()));
    }

    @Override
    public Button getPositiveButton() {
        return null;
    }

    @Override
    public void setPositiveButtonEnable() {

    }

    @Override
    public Button getNagertiveButton() {
        return null;
    }

    @Override
    public void setNagertiveButtonEnable() {

    }

    interface WelcomeActivityContent{
        public boolean shouldDisplay(Context context);
    }
}
