package JavaBean;

import java.util.List;

/**
 * @Description:
 * @author: cyq7on
 * @date: 2016/8/27 18:20
 * @version: V1.0
 */
public class HistoryInfo {

    /**
     * checkdate : 2015-07-06
     * unitid : 389
     */

    public List<ResultBean> result;

    public static class ResultBean {
        public String checkdate;
        public String  firetableid;
    }
}
