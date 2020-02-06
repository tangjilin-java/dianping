package ab.tjl.dianping.common;

/**
 * @Author:TangJiLin
 * @Description:业务异常处理
 * @Date: Created in 2020/2/6 19:34
 * @Modified By:
 */
public class BusinessException extends Exception {
    private CommonError commonError;

    public BusinessException(EmBusinessError emBusinessError){
        super();
        this.commonError = new CommonError(emBusinessError);
    }

    public BusinessException(EmBusinessError emBusinessError,String errMsg){
        super();
        this.commonError = new CommonError(emBusinessError);
        this.commonError.setErrMsg(errMsg);
    }

    public CommonError getCommonError() {
        return commonError;
    }

    public void setCommonError(CommonError commonError) {
        this.commonError = commonError;
    }
}
