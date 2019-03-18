package Models;

import Repositories.TypeRepository;

public class Room {
    private Integer uid;
    private Integer typeId;
    private Integer maxAdult, maxChild, number;
    private Double price;

    public String getType() {
        return (new TypeRepository()).getType(typeId);
    }

    public void setType(Integer type) {
        this.typeId = type;
    }

    public Integer getMaxAdult() {
        return maxAdult;
    }

    public void setMaxAdult(Integer maxAdult) {
        this.maxAdult = maxAdult;
    }

    public Integer getMaxChild() {
        return maxChild;
    }

    public void setMaxChild(Integer maxChild) {
        this.maxChild = maxChild;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
