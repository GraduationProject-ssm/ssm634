package com.entity.vo;

import com.entity.HuliEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 护理
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huli")
public class HuliVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 护理姓名
     */

    @TableField(value = "huli_name")
    private String huliName;


    /**
     * 头像
     */

    @TableField(value = "huli_photo")
    private String huliPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 联系方式
     */

    @TableField(value = "huli_phone")
    private String huliPhone;


    /**
     * 邮箱
     */

    @TableField(value = "huli_email")
    private String huliEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：护理姓名
	 */
    public String getHuliName() {
        return huliName;
    }


    /**
	 * 获取：护理姓名
	 */

    public void setHuliName(String huliName) {
        this.huliName = huliName;
    }
    /**
	 * 设置：头像
	 */
    public String getHuliPhoto() {
        return huliPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setHuliPhoto(String huliPhoto) {
        this.huliPhoto = huliPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getHuliPhone() {
        return huliPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setHuliPhone(String huliPhone) {
        this.huliPhone = huliPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getHuliEmail() {
        return huliEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setHuliEmail(String huliEmail) {
        this.huliEmail = huliEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
