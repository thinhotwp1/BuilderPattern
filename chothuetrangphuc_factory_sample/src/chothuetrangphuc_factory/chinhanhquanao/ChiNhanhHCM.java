/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chothuetrangphuc_factory.chinhanhquanao;

import chothuetrangphuc_factory.quanao.AoThun;
import chothuetrangphuc_factory.quanao.QuanAo;
import chothuetrangphuc_factory.quanao.QuanJean;

/**
 *
 * @author Administrator
 */
public class ChiNhanhHCM extends CuaHangQuanAo {

    public ChiNhanhHCM() {
    }
    
    public QuanAo createQuanAo(String type) {

        QuanAo quanAo;
        switch (type) {
            case "quanJean":
                quanAo = new QuanJean();
                break;
            case "aoThun":
                quanAo = new AoThun();
                break;
            default:
                return null;
        }

        return quanAo;
    }
}
