package com.zhwilson.pr.imitate.welcom;

import android.widget.Button;

/**
 * Created by pr on 2015/11/27.
 */
public class WelcomeFragment {

    interface WelcomeFragmentContainer{
        public Button getPositiveButton();
        public void setPositiveButtonEnable();
        public Button getNagertiveButton();
        public void setNagertiveButtonEnable();
    }
}
