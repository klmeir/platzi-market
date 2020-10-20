package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Client {

    @Id
    @Column(length = 20)
    private Long id;

    @Column(name = "nombre", length = 40)
    private String firstName;

    @Column(name = "apellidos", length = 100)
    private String lastName;

    @Column(name = "celular")
    private Long cellphone;

    @Column(name = "direccion", length = 80)
    private String address;

    @Column(name = "correo_electronico", length = 70)
    private String email_address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getCellphone() {
        return cellphone;
    }

    public void setCellphone(Long cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

}
