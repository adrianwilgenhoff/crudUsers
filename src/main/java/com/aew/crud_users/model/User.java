package com.aew.crud_users.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Represents all the user’s information.
 * 
 * @author Adrian E. Wilgenhoff
 * @version 1.0
 * 
 */

@Entity
@Table(name = "Users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "username", unique = true)
    private String username;

    @JsonIgnore
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "password")
    private String password;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "lastname")
    private String lastname;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "address")
    private String address;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "city")
    private String city;

    @Email
    @NotNull
    @Size(min = 6, max = 50)
    @Column(name = "email", unique = true)
    private String email;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "telephone")
    private String telephone;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "dni")
    private int dni;

    public User() {
    }

    /**
     * Construye un Usuario con sus datos personales.
     * 
     * @param username  valor utilizado para configurar el campo "username" del
     *                  usuario.
     * @param password  valor utilizado para configurar la contraseña de loggin del
     *                  usuario.
     * @param name      valor utilizado para configurar el nombre del usuario.
     * @param lastname  valor utilizado para configurar el apellido del usuario..
     * @param address   valor utilizado para configurar la direcccion donde vive el
     *                  usuario.
     * @param city      valor utilizado para configurar la ciudad de residencia del
     *                  usuario.
     * @param email     valor utilizado para configurar el correo electronico del
     *                  usuario.
     * @param telephone valor utilizado para configurar el numero de telefono del
     *                  usuario.
     * @param dni       valor utilizado para configurar el dni del usuario.
     */

    public User(String username, String password, String name, String lastname, String address, String city,
            String email, String telephone, int dni) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.email = email;
        this.telephone = telephone;
        this.dni = dni;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public User username(String username) {
        this.username = username;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public User address(String address) {
        this.address = address;
        return this;
    }

    public User city(String city) {
        this.city = city;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User telephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public User dni(int dni) {
        this.dni = dni;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password)
                && Objects.equals(name, user.name) && Objects.equals(lastname, user.lastname)
                && Objects.equals(address, user.address) && Objects.equals(city, user.city)
                && Objects.equals(email, user.email) && Objects.equals(telephone, user.telephone) && dni == user.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, name, lastname, address, city, email, telephone, dni);
    }

    @Override
    public String toString() {
        return "{" + " username='" + getUsername() + "'" + ", password='" + getPassword() + "'" + ", name='" + getName()
                + "'" + ", lastname='" + getLastname() + "'" + ", address='" + getAddress() + "'" + ", city='"
                + getCity() + "'" + ", email='" + getEmail() + "'" + ", telephone='" + getTelephone() + "'" + ", dni='"
                + getDni() + "'" + "}";
    }

}