package ab.tjl.dianping.controller;

import ab.tjl.dianping.common.BusinessException;
import ab.tjl.dianping.common.CommonError;
import ab.tjl.dianping.common.CommonRes;
import ab.tjl.dianping.common.EmBusinessError;
import ab.tjl.dianping.model.UserModel;
import ab.tjl.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:TangJiLin
 * @Description:
 * @Date: Created in 2020/2/6 15:19
 * @Modified By:
 */
@Controller("/user")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }


    @RequestMapping("/get")
    @ResponseBody
    public CommonRes getUser(@RequestParam(name = "id") Integer id) throws BusinessException {
        UserModel userModel = userService.getUser(id);
        if (userModel == null){
           // return CommonRes.create(new CommonError(EmBusinessError.NO_OBJECT_FOUND),"fail");
            throw new BusinessException(EmBusinessError.NO_OBJECT_FOUND);
        }else {
            return CommonRes.create(userModel);
        }
    }
}
