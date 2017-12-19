package smallbuildmetrials.interfce;

/**
 * Created by zhengdan on 2017/12/7.
 * 页面初始化
 */

public interface IBaseInitInterface {

    /**
     * 初始化view
     */
    void initView();

    /**
     * 初始化data
     */
    void initData();

    /**
     *初始化监听
     */
    void initListener();
    /**
     *获取子布局文件id
     */

    int getContentViewId();
}
