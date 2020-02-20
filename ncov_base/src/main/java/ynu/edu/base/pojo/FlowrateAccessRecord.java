package ynu.edu.base.pojo;

import java.util.Date;

public class FlowrateAccessRecord {
    private Integer id;

    private Integer userId;

    private String placeId;

    private Date date;

    private Byte enter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId == null ? null : placeId.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Byte getEnter() {
        return enter;
    }

    public void setEnter(Byte enter) {
        this.enter = enter;
    }
}