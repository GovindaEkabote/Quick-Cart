package com.quickcart.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BussinessDetails {

    private String bussinessName;
    private String bussinessEmail;
    private String bussinessMobile;
    private String logo;
    private String banner;
}
