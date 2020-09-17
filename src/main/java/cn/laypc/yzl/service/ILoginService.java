package cn.laypc.yzl.service;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * <p>
 * 接口
 * </p>
 *
 * @author YoungE
 * @since 2020-09-14
 */
public interface ILoginService {

    void add(LocalDateTime time,String  address);


}