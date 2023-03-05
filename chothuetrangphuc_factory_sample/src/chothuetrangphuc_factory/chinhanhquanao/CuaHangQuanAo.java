package chothuetrangphuc_factory.chinhanhquanao;

import chothuetrangphuc_builder.hoadon.HoaDonImpl;
import chothuetrangphuc_factory.quanao.QuanAo;

public abstract class CuaHangQuanAo {

    public CuaHangQuanAo() {
    }

    abstract QuanAo createQuanAo(String type);

    public String tenQuanAo = "";
    public double tienThue = 0;

    public QuanAo oderQuanAo(String type) {

        QuanAo quanAo;

        quanAo = createQuanAo(type);
        if (quanAo == null) { // Nếu oder sai tên quần áo thì quanAo sẽ trả về null
            System.out.println("Bad oder !");
        } else {
            quanAo.chuanBi();
            quanAo.laHoi();
            quanAo.goiHang();
            quanAo.choThue();
            quanAo.display();
            tenQuanAo = tenQuanAo + " " + quanAo.tenQuanAo;
            tienThue = tienThue + quanAo.tienThue;
        }
        return quanAo;
    }

    public void xuatHoaDon() {
        HoaDonImpl hoaDon = new HoaDonImpl();
        hoaDon.setTenKhachHang("tenKH").setDiaChi("diaChi").setSoDienThoai("0123456789").setListQuanAo(tenQuanAo).setTienThue(tienThue).build();
        hoaDon.xuatHoaDon();
    }
}
