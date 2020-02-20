package ynu.edu.base.pojo;

public class SystemDd1 {
    private Integer id;

    private String keyword;

    private String ddlCode;

    private String ddlName;

    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getDdlCode() {
        return ddlCode;
    }

    public void setDdlCode(String ddlCode) {
        this.ddlCode = ddlCode == null ? null : ddlCode.trim();
    }

    public String getDdlName() {
        return ddlName;
    }

    public void setDdlName(String ddlName) {
        this.ddlName = ddlName == null ? null : ddlName.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}