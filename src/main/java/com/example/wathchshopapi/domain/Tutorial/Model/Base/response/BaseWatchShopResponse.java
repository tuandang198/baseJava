package com.example.wathchshopapi.domain.Tutorial.Model.Base.response;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table
public class BaseWatchShopResponse implements Serializable {
    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "CREATED_TIME")
    private Date createdTime;

    @Column(name = "UPDATED_USER")
    private String updatedUser;

    @Column(name = "UPDATED_TIME")
    private Date updatedTime;

    @Column(name = "IS_DELETED")
    private Integer isDeleted;
}
