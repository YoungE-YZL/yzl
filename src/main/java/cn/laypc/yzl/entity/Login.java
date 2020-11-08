
package cn.laypc.yzl.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 数据库表名 login
 *
 * @author YoungE
 * @date 2020-09-14
 */
@Getter
@Setter
@ToString
public class Login  {

@TableField("id")
@ApiModelProperty("")
private Long  id;

@TableField("time")
@ApiModelProperty("")
private LocalDateTime time;

@TableField("address")
@ApiModelProperty("")
private String  address;


}