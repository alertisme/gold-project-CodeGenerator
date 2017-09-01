package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_fx_168_news_tag_ref")
public class TFx168NewsTagRef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 标签ID
     */
    @Column(name = "tag_id")
    private Long tagId;

    /**
     * 资讯ID
     */
    private Long docid;

    /**
     * 创建人
     */
    @Column(name = "create_user_id")
    private Long createUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取标签ID
     *
     * @return tag_id - 标签ID
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 设置标签ID
     *
     * @param tagId 标签ID
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取资讯ID
     *
     * @return docid - 资讯ID
     */
    public Long getDocid() {
        return docid;
    }

    /**
     * 设置资讯ID
     *
     * @param docid 资讯ID
     */
    public void setDocid(Long docid) {
        this.docid = docid;
    }

    /**
     * 获取创建人
     *
     * @return create_user_id - 创建人
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人
     *
     * @param createUserId 创建人
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
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
}