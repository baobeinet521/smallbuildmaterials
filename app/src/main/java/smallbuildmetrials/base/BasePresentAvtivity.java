package smallbuildmetrials.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.Window;

/**
 * Created by zhengdan on 2017/12/19.
 */

public abstract class BasePresentAvtivity extends FragmentActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(isNeedTitle()){
            requestWindowFeature(Window.FEATURE_NO_TITLE);
        }else{
            requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        }
    }

    public boolean isNeedTitle(){
        return true;
    }
}
