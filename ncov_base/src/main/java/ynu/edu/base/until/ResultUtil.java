package ynu.edu.base.until;
import ynu.edu.entity.Result;
public class ResultUtil {
    /**
     * 成功时返回得状态
     * @param object
     * @return
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setFlag(true);
        result.setCode(200);
        result.setMessage("success");
        result.setData(object);

        return result;
    }

    /**
     * 自定义返回得状态
     * @return
     */
    public static Result customize() {
        return new Result();
    }

    /**
     * 失败时返回得状态
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setFlag(false);
        result.setMessage(msg);

        return result;
    }
}
