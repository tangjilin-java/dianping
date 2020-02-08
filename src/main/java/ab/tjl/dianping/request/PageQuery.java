package ab.tjl.dianping.request;

/**
 * @Author:TangJiLin
 * @Description:分頁
 * @Date: Created in 2020/2/7 14:52
 * @Modified By:
 */
public class PageQuery {

    private Integer page = 1;

    private Integer size = 8;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
