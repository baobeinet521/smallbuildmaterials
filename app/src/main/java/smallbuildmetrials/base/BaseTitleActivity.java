package smallbuildmetrials.base;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.smallbuildmetrials.R;
import smallbuildmetrials.interfce.IBaseInitInterface;
import smallbuildmetrials.util.TextUtil;

/**
 * Created by zhengdan on 2017/12/7.
 */

public abstract class BaseTitleActivity extends BasePresentAvtivity implements IBaseInitInterface {

    private View mTitleView;
    private LayoutInflater mLayoutInflater;

    private Button mLeftTitle;
    private Button mMiddleTitle;
    private Button mRightTitle;

    private RelativeLayout mTitleLayout;
    private FrameLayout mContentLayout;

    interface OnRightClick{
        void rightClick();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(isNeedTitle()){
            requestWindowFeature(Window.FEATURE_NO_TITLE);
        }else{
            requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        }

        if (isDefaultContentview()) {
            setContentView(getContentViewId());
        }else {
            super.setContentView(getContentViewId());
        }
        initView();
        initListener();
        initData();
    }


    @Override
    public void setContentView(int layoutResID) {
       View view = null;
       if(getContentViewId() != 0){
           mLayoutInflater = LayoutInflater.from(this);
           view = mLayoutInflater.inflate(getContentViewId(),null);
           setContentView(view);
       }
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(R.layout.activity_base_layout);
        initBaseView(view);
    }

    public void initBaseView(View view){
        mTitleLayout = findViewById(R.id.title_layout);
        mContentLayout = findViewById(R.id.content_layout);




        mTitleView = mLayoutInflater.inflate(getTitleId(),null);
        if(getTitleId() != 0){
            mLeftTitle = mTitleView.findViewById(R.id.title_left_button);
            mMiddleTitle = mTitleView.findViewById(R.id.title_middle_button);
            mRightTitle = mTitleView.findViewById(R.id.title_right_button);
        }

        mTitleLayout.addView(mTitleView);
        if(view != null){
            mContentLayout.addView(view);
        }
    }


    /**
     * 是否试用默认布局，返回false不使用默认布局
     * @return
     */
    public boolean isDefaultContentview(){
        return true;
    }

    public int getTitleId(){
        return R.layout.view_base_title_layout;
    }

    /**
     *  初始化标题，默认左边按钮点击返回
     * @param title
     */
    public void initTitle(String title){
        if(!TextUtil.strIsEmpty(title) && mMiddleTitle != null){
            mMiddleTitle.setText(title);
        }
        mLeftTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        mRightTitle.setVisibility(View.GONE);
    }

    /**
     * 标题最右边只有文字可以点击
     * @param title
     * @param rightstr
     */
    public void initTitle(String title, String rightstr, final OnRightClick listener){
        if(!TextUtil.strIsEmpty(title) && mMiddleTitle != null){
            mMiddleTitle.setText(title);
        }

        if(!TextUtil.strIsEmpty(rightstr) && mRightTitle != null){
            mRightTitle.setText(rightstr);
        }

        mRightTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null){
                    listener.rightClick();
                }
            }
        });
    }

    /**
     * 标题最右边是图片或者是图片和文字
     * @param title
     * @param rightstr
     * @param leftDra
     * @param listener
     */
    public void initTitle(String title, String rightstr, Drawable leftDra, final OnRightClick listener){
        if(!TextUtil.strIsEmpty(title) && mMiddleTitle != null){
            mMiddleTitle.setText(title);
        }

        if(!TextUtil.strIsEmpty(rightstr) && mRightTitle != null){
            mRightTitle.setText(rightstr);
        }
        if(leftDra != null && mRightTitle != null){
            mRightTitle.setCompoundDrawables(leftDra,null,null,null);
        }
        mRightTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null){
                    listener.rightClick();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public boolean isNeedTitle(){
        return true;
    }
}
