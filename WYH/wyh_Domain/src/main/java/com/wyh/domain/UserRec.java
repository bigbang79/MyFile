package com.wyh.domain;

import java.io.Serializable;
import java.util.Date;

public class UserRec implements Serializable {
    private Integer id,recuid,berecuid;
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecuid() {
        return recuid;
    }

    public void setRecuid(Integer recuid) {
        this.recuid = recuid;
    }

    public Integer getBerecuid() {
        return berecuid;
    }

    public void setBerecuid(Integer berecuid) {
        this.berecuid = berecuid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
