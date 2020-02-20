package ynu.edu.base.until;

public class Place<T> {
    private String str;
    private Integer count;
    private T place;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public T getPlace() {
        return place;
    }

    public void setPlace(T place) {
        this.place = place;
    }
}
