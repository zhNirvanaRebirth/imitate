package com.zhwilson.pr.imitate.welcom;

import android.content.Context;

/**
 * Created by pr on 2015/11/27.
 */
public class TosFragment extends WelcomeFragment implements WelcomActivity.WelcomeActivityContent {
    @Override
    public boolean shouldDisplay(Context context) {
        return !Untils.hasTosAccept(context);
    }
}
