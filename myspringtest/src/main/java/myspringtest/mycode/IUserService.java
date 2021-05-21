package myspringtest.mycode;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: IUserService
 * @Author: niyf
 * @Date: 2021/5/21 10:37
 * @Description:
 */
public interface IUserService {
    UserInfo query(Map<String, Object> reqMap);
    List<UserInfo> queryList(Map<String, Object> reqMap);
}
