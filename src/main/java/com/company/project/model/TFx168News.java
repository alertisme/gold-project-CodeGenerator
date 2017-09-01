package com.company.project.model;

import javax.persistence.*;

@Table(name = "t_fx_168_news")
public class TFx168News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 资讯唯一ID
     */
    private Long docid;

    /**
     * 标题
     */
    private String title;

    /**
     * 黄金平台标题
     */
    @Column(name = "gold_title")
    private String goldTitle;

    /**
     * 作者
     */
    private String author;

    /**
     * 链接
     */
    private String doclink;

    /**
     * 第一次发布时间
     */
    private String docfirstpubtime;

    /**
     * 更新时间
     */
    private String docpubtime;

    /**
     * 拉取回来时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 后台审核时间
     */
    @Column(name = "update_time")
    private String updateTime;

    /**
     * 资讯发布到黄金平台状态：Y，已发布；N：未发布
     */
    private String status;

    /**
     * 资讯推送到APP状态：Y，推送；N，不推送，S，推送成功
     */
    @Column(name = "push_status")
    private String pushStatus;

    /**
     * 排序ID
     */
    @Column(name = "indx_order")
    private Integer indxOrder;

    /**
     * 内容
     */
    private String doccontent;

    /**
     * 关键字
     */
    private String dockeyword;

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
     * 获取资讯唯一ID
     *
     * @return docid - 资讯唯一ID
     */
    public Long getDocid() {
        return docid;
    }

    /**
     * 设置资讯唯一ID
     *
     * @param docid 资讯唯一ID
     */
    public void setDocid(Long docid) {
        this.docid = docid;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取黄金平台标题
     *
     * @return gold_title - 黄金平台标题
     */
    public String getGoldTitle() {
        return goldTitle;
    }

    /**
     * 设置黄金平台标题
     *
     * @param goldTitle 黄金平台标题
     */
    public void setGoldTitle(String goldTitle) {
        this.goldTitle = goldTitle;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取链接
     *
     * @return doclink - 链接
     */
    public String getDoclink() {
        return doclink;
    }

    /**
     * 设置链接
     *
     * @param doclink 链接
     */
    public void setDoclink(String doclink) {
        this.doclink = doclink;
    }

    /**
     * 获取第一次发布时间
     *
     * @return docfirstpubtime - 第一次发布时间
     */
    public String getDocfirstpubtime() {
        return docfirstpubtime;
    }

    /**
     * 设置第一次发布时间
     *
     * @param docfirstpubtime 第一次发布时间
     */
    public void setDocfirstpubtime(String docfirstpubtime) {
        this.docfirstpubtime = docfirstpubtime;
    }

    /**
     * 获取更新时间
     *
     * @return docpubtime - 更新时间
     */
    public String getDocpubtime() {
        return docpubtime;
    }

    /**
     * 设置更新时间
     *
     * @param docpubtime 更新时间
     */
    public void setDocpubtime(String docpubtime) {
        this.docpubtime = docpubtime;
    }

    /**
     * 获取拉取回来时间
     *
     * @return create_time - 拉取回来时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置拉取回来时间
     *
     * @param createTime 拉取回来时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取后台审核时间
     *
     * @return update_time - 后台审核时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置后台审核时间
     *
     * @param updateTime 后台审核时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取资讯发布到黄金平台状态：Y，已发布；N：未发布
     *
     * @return status - 资讯发布到黄金平台状态：Y，已发布；N：未发布
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置资讯发布到黄金平台状态：Y，已发布；N：未发布
     *
     * @param status 资讯发布到黄金平台状态：Y，已发布；N：未发布
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取资讯推送到APP状态：Y，推送；N，不推送，S，推送成功
     *
     * @return push_status - 资讯推送到APP状态：Y，推送；N，不推送，S，推送成功
     */
    public String getPushStatus() {
        return pushStatus;
    }

    /**
     * 设置资讯推送到APP状态：Y，推送；N，不推送，S，推送成功
     *
     * @param pushStatus 资讯推送到APP状态：Y，推送；N，不推送，S，推送成功
     */
    public void setPushStatus(String pushStatus) {
        this.pushStatus = pushStatus;
    }

    /**
     * 获取排序ID
     *
     * @return indx_order - 排序ID
     */
    public Integer getIndxOrder() {
        return indxOrder;
    }

    /**
     * 设置排序ID
     *
     * @param indxOrder 排序ID
     */
    public void setIndxOrder(Integer indxOrder) {
        this.indxOrder = indxOrder;
    }

    /**
     * 获取内容
     *
     * @return doccontent - 内容
     */
    public String getDoccontent() {
        return doccontent;
    }

    /**
     * 设置内容
     *
     * @param doccontent 内容
     */
    public void setDoccontent(String doccontent) {
        this.doccontent = doccontent;
    }

    /**
     * 获取关键字
     *
     * @return dockeyword - 关键字
     */
    public String getDockeyword() {
        return dockeyword;
    }

    /**
     * 设置关键字
     *
     * @param dockeyword 关键字
     */
    public void setDockeyword(String dockeyword) {
        this.dockeyword = dockeyword;
    }
}