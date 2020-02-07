package ab.tjl.dianping.request;

import javax.validation.constraints.NotBlank;

/**
 * @Author:TangJiLin
 * @Description:商家数据处理
 * @Date: Created in 2020/2/7 14:37
 * @Modified By:
 */
public class SellerCreateReq {
    @NotBlank(message = "商户名不能为空")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
