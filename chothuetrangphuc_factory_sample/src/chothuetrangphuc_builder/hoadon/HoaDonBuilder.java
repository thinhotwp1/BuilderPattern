
package chothuetrangphuc_builder.hoadon;

/**
 *
 * @author Administrator
 */
public interface HoaDonBuilder {
    public HoaDonBuilder setTenKhachHang(String name);
    public HoaDonBuilder setDiaChi(String diaChi);
    public HoaDonBuilder setListQuanAo(String listQuanAo);
    public HoaDonBuilder setTienThue(Double tienThue);
    public HoaDonBuilder setSoDienThoai(String soDienThoai);
    public HoaDonBuilder build();
}
