package smallbuildmetrials.ui;

import com.smallbuildmetrials.R;
import smallbuildmetrials.base.BaseTitleActivity;

/**
 * Created by zhengdan on 2017/12/15.
 */

public class MainActivity extends BaseTitleActivity {
    @Override
    public void initView() {
        initTitle("首页");

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
