/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chothuetrangphuc_factory.chinhanhquanao;

import chothuetrangphuc_factory.quanao.AoVest;
import chothuetrangphuc_factory.quanao.QuanAo;
import chothuetrangphuc_factory.quanao.QuanTay;

/**
 *
 * @author Administrator
 */
public class ChiNhanhHaNoi extends CuaHangQuanAo {

    public ChiNhanhHaNoi() {
    }
    
    public QuanAo createQuanAo(String type) {

        QuanAo quanAo;
        switch (type) {
            case "quanTay":
                quanAo = new QuanTay();
                break;
            case "aoVest":
                quanAo = new AoVest();
                break;
            default:
                return null;
        }

        return quanAo;
    }
}