package smallbuildmetrials.presenters.base;

/**
 * Created by zhengdan on 2017/12/19.
 */

public interface IBasePresenter {

    /**
     * presenter 挂载在view
     * @return
     */
    boolean isViewAttached();

    /**
     * presenter 与view解挂
     * @return
     */

    boolean isViewDetached();
}
