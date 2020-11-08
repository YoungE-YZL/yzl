package cn.laypc.yzl.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 控制器层统一返回类
 *
 * @time: 2020-01-02 17:44
 */
@Data
@ApiModel("通用响应容器")
public class Result<T> {

    @ApiModelProperty("状态信息")
    private String msg;
    @ApiModelProperty("状态码")
    private Integer success;
    @ApiModelProperty("响应数据")
    private T data;

    public Result() {
        super();
    }

    public Result(Integer success) {
        this.success = success;

    }

    public Result(String msg) {
        this.msg = msg;

    }

    public Result(T data) {
        this.data = data;

    }

    public Result(Integer success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Result(Integer success, T data) {
        this.success = success;
        this.data = data;
    }

    public Result(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer success, String msg, T data) {
        this.success = success;
        this.data = data;
        this.msg = msg;
    }
}
