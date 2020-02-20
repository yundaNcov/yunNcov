package ynu.edu.base.until;

public class Json<T> {
    private String status;
    private String place;
    private T rows;
    private Integer totals;
    private T citys;
    private String sensitive;

    public String getSensitive() {
        return sensitive;
    }

    public void setSensitive(String sensitive) {
        this.sensitive = sensitive;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public T getCitys() {
        return citys;
    }

    public void setCitys(T citys) {
        this.citys = citys;
    }

    public Integer getTotals() {
        return totals;
    }

    public void setTotals(Integer totals) {
        this.totals = totals;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getRows() {
        return rows;
    }

    public void setRows(T rows) {
        this.rows = rows;
    }
}
