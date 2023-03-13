package com.example.wathchshopapi.global.base;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnore;

import javax.validation.constraints.NotNull;

public class BaseSearchRequest {
    @NotNull
    private int page;

    @NotNull
    private int size;

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    private int pageBegin;
    
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    private int pageEnd;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPageBegin() {
        return pageBegin = this.page * this.size + 1;
    }

    public void setPageBegin(int pageBegin) {
        this.pageBegin = pageBegin;
    }

    public int getPageEnd() {
        return pageEnd = this.page * this.size + this.size;
    }

    public void setPageEnd(int pageEnd) {
        this.pageEnd = pageEnd;
    }

}
