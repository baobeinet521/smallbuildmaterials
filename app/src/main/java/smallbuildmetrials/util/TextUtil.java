package smallbuildmetrials.util;

/**
 * Created by zhengdan on 2017/12/8.
 */

public class TextUtil {

    public static boolean strIsEmpty(String str){
        if(str == null || str.length() == 0){
            return true;
        } else{
            return false;
        }
    }
}
