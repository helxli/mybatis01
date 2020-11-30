package cn.helx.mybatis.Entity;

import java.io.Serializable;
import java.util.Date;

public class AuthUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *主键
     */
    private Long id;
    /**
     *登录用户名
     **/
    private String realname;

    /**
     *真实姓名
     **/
    private String username;
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 角色名
     */
    private String roleName;

    /**
     *密码
     **/
    private String password;

    /**
     *性别
     **/
    private Integer gender;

    /**
     *头像
     **/
    private String header;

    /**
     *手机号码
     **/
    private String mobile;

    /**
     *状态：0身份变更申请中、1用户的权限受限、2默认正常权限、3具有高等身份的状态、4待审核（管理员认为信息有问题，更改信息后）、5禁用
     **/
    private Integer status;

    /**
     *生日
     **/
    private Date birthday;

    /**
     *学历：大专、本科、硕士、博士、博士后
     **/
    private String education;

    /**
     * 大学编号
     */
    private String collegeCode;

    /**
     * 大学名称
     */
    private String collegeName;

    /**
     *资格证书编号
     **/
    private String certNo;

    /**
     *头衔
     **/
    private String title;

    /**
     *签名
     **/
    private String sign;

    /**
     *微信公众号openid
     **/
    private String openId;

    /**
     *微信号
     **/
    private String wechatId;

    /**
     *qq号
     **/
    private String qq;

    /**
     *最后一次登录时间
     **/
    private Date loginTime;

    /**
     *最后一次登录IP
     **/
    private String ip;

    /**
     *所在省份
     **/
    private String province;

    /**
     *所在城市
     **/
    private String city;

    /**
     *所在地区
     **/
    private String district;

    /**
     * 推荐权重
     */
    private Integer weight;

    /**
     * 扩展字段：微信昵称
     */
    private String nickname;
    /**
     * 扩展字段：用户来源代码 --EnumStatisticsCode
     */
    private String fromCode;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人(username)
     */
    private String createUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 最后一位更新人(username)
     */
    private String updateUser;

    /**
     * 逻辑删除
     */
    private Integer del = 0;

    /**
     * 更新时间
     */
    private Date startTime;

    /**
     * 更新时间
     */
    private Date endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getUsername() {
        return username;
    }

    public Long getUserId() {
        return getId();
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(String collegeCode) {
        this.collegeCode = collegeCode == null ? null : collegeCode.trim();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getFromCode() {
        return fromCode;
    }

    public void setFromCode(String fromCode) {
        this.fromCode = fromCode == null ? null : fromCode.trim();
    }



    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Integer getDel() {
        return del;
    }
    public void setDel(Integer del) {
        this.del = del;
    }
    public String getCreateUser() {
        return createUser;
    }
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public String getUpdateUser() {
        return updateUser;
    }
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "AuthUser{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", username='" + username + '\'' +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", header='" + header + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}