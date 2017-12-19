package smallbuildmetrials.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.smallbuildmetrials.R;

import smallbuildmetrials.base.BasePresentAvtivity;
import smallbuildmetrials.base.BaseTitleActivity;

/**
 * Created by zhengdan on 2017/12/15.
 */

public class MainActivity extends BasePresentAvtivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
