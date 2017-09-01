package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_fx_168_tags")
public class _fx_168_tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 资讯类型名称
     */
    @Column(name = "tag_name")
    private String tagName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人ID
     */
    @Column(name = "create_user_id")
    private Long createUserId;

    /**
     * 状态Y，N
     */
    private String status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取资讯类型名称
     *
     * @return tag_name - 资讯类型名称
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置资讯类型名称
     *
     * @param tagName 资讯类型名称
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人ID
     *
     * @return create_user_id - 创建人ID
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人ID
     *
     * @param createUserId 创建人ID
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取状态Y，N
     *
     * @return status - 状态Y，N
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态Y，N
     *
     * @param status 状态Y，N
     */
    public void setStatus(String status) {
        this.status = status;
    }
}