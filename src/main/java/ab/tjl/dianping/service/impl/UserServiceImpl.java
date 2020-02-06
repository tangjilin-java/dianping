package ab.tjl.dianping.service.impl;

import ab.tjl.dianping.dal.UserModelMapper;
import ab.tjl.dianping.model.UserModel;
import ab.tjl.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:TangJiLin
 * @Description:
 * @Date: Created in 2020/2/6 15:43
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserModelMapper userModelMapper;

    @Override
    public UserModel getUser(Integer id) {
        return userModelMapper.selectByPrimaryKey(id);
    }
}
