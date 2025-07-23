package HomeWork10;

import java.util.Objects;

public class User implements Cloneable {
    private int id;
    private String username;
    private String email;
    private Address address; // Вложенный объект для демонстрации глубокого клонирования

    public User(int id, String username, String email, Address address) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(email, user.email) &&
                Objects.equals(address, user.address);
    }

    // Метод для поверхностного копирования
    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    // Метод для глубокого копирования
    public User deepClone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.address = (Address) address.clone();
        return user;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }
}