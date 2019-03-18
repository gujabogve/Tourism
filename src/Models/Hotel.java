package Models;

import Repositories.CityRepository;
import Repositories.CountryRepository;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private Integer uid;
    private String name, address, email, phone;
    private Double star; // 1, 1.5 , ... 5;
    private Integer countryId, cityId;
    private List<Room> rooms = new ArrayList<>();

    public String getCountry() {
        return (new CountryRepository()).find(this.countryId);
    }

    public String getCity() {
        return (new CityRepository()).find(this.cityId);
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public List<Room> getRoom(Integer roomNumber) {
//        TODO:: find room by number
        return rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getStar() {
        return star;
    }

    public void setStar(Double star) {
        this.star = star;
    }
}
