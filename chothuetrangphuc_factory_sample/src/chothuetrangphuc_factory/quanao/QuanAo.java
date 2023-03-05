/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chothuetrangphuc_factory.quanao;


/**
 *
 * @author Administrator
 */
public abstract class QuanAo {
    
    public String tenQuanAo = "";

    public String description = "Quan ao";
    
    public double tienThue = 0;
    

    public void chuanBi() {
        this.description += " + Chuan Bi";
    }

    public void laHoi() {
        this.description += " + La Hoi ";
    }

    public void goiHang() {
        this.description += " + Goi Hang ";
    }

    public void choThue() {
        this.description += " + Cho Thue ";
    }

    public void display() {
        System.out.println(this.description);
    }
    
}
