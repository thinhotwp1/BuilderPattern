/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chothuetrangphuc_factory_builder;

import chothuetrangphuc_factory.chinhanhquanao.ChiNhanhHCM;
import chothuetrangphuc_factory.chinhanhquanao.ChiNhanhHaNoi;
import chothuetrangphuc_factory.chinhanhquanao.CuaHangQuanAo;

/**
 *
 * @author Administrator
 */
public class ChoThueTrangPhuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===== CuaHangQuanAo Factory Pattern Sample =====");
        System.out.println("\n=== Oder ChiNhanhHaNoi ===");
        CuaHangQuanAo chiNhanhHaNoi = new ChiNhanhHaNoi();
        chiNhanhHaNoi.oderQuanAo("quanTay");
        chiNhanhHaNoi.oderQuanAo("aoVest");
        System.out.println("Builder Pattern: Hóa Đơn");
        chiNhanhHaNoi.xuatHoaDon();

        System.out.println("\n=== Oder ChiNhanhHCM ===");
        CuaHangQuanAo chiNhanhHCM = new ChiNhanhHCM();
        chiNhanhHCM.oderQuanAo("aoThun");
        chiNhanhHCM.oderQuanAo("quanJean");
        System.out.println("Builder Pattern: Hóa Đơn");
        chiNhanhHCM.xuatHoaDon();

        System.out.println("\n===== End =====");
    }

}
