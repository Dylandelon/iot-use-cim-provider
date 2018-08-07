package cn.enncloud.iot.iotusecimprovider.bean;

public class MyMessage {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyMessage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
