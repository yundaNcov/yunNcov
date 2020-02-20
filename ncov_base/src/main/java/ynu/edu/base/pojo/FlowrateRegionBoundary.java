package ynu.edu.base.pojo;

public class FlowrateRegionBoundary {
    private Integer id;

    private String address;

    private String border;

    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border == null ? null : border.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}