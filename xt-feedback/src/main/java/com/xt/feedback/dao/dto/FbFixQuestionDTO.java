package com.xt.feedback.dao.dto;

import java.io.Serializable;

public class FbFixQuestionDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
    /**
     * 字段：uuid
     * UUID,唯一标识
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     * 字段：part_id
     * 
     *
     * @mbg.generated
     */
    private Integer partId;

    /**
     * 字段：content
     * {"stem":"请选择","option":{"A":"这是A","B":"这是B"}}
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 字段：sort
     * 排序
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * 字段：qtype
     * 试题类型
     *
     * @mbg.generated
     */
    private Byte qtype;

    /**
     * 字段：orders
     * 
     *
     * @mbg.generated
     */
    private Long orders;

    /**
     * 字段：ctime
     * 
     *
     * @mbg.generated
     */
    private Long ctime;
    
	private FbContentFromJsonDTO contentFromJsonDTO;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getPartId() {
        return partId;
    }


    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getQtype() {
        return qtype;
    }

    public void setQtype(Byte qtype) {
        this.qtype = qtype;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

	public FbContentFromJsonDTO getContentFromJsonDTO() {
		return contentFromJsonDTO;
	}

	public void setContentFromJsonDTO(FbContentFromJsonDTO contentFromJsonDTO) {
		this.contentFromJsonDTO = contentFromJsonDTO;
	}

}
