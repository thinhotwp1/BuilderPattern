
package chothuetrangphuc_builder.hoadon;

/**
 *
 * @author Administrator
 */
public class HoaDonImpl implements HoaDonBuilder {

    private String tenKhachHang;
    private String diaChi;
    private String soDienThoai;
    private String listQuanAo;
    private double tienThue;

    public HoaDonImpl() {
        this.tenKhachHang = "";
        this.diaChi = "";
        this.soDienThoai = "";
        this.soDienThoai = "";
        this.listQuanAo = "";
        this.tienThue = 0;
    }

    @Override
    public HoaDonBuilder setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
        return this;
    }

    @Override
    public HoaDonBuilder setDiaChi(String diaChi) {
        this.diaChi = diaChi;
        return this;
    }
    
    @Override
    public HoaDonBuilder setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
        return this;
    }

    @Override
    public HoaDonBuilder setListQuanAo(String listQuanAo) {
        this.listQuanAo = listQuanAo;
        return this;
    }

    @Override
    public HoaDonBuilder setTienThue(Double tienThue) {
        this.tienThue = this.tienThue + tienThue;
        return this;
    }

    @Override
    public HoaDonImpl build() {
        HoaDonImpl hoaDonImpl = new HoaDonImpl();
        hoaDonImpl.tenKhachHang = this.tenKhachHang;
        hoaDonImpl.diaChi = this.diaChi;
        hoaDonImpl.listQuanAo = this.listQuanAo;
        hoaDonImpl.tienThue = this.tienThue;
        hoaDonImpl.soDienThoai = this.soDienThoai;
        return hoaDonImpl;
    }
    
    public void xuatHoaDon(){
/* thông tin khách hàng sẽ được thay đổi runtime, ở ví dụ này mặc định là 
tenKh,diachi,...  */
        System.out.println("Tên khách hàng: "+tenKhachHang+"\nĐịa chỉ: "
                +diaChi+"\nDanh sách quần áo thuê: "+listQuanAo 
                +"\nSố điện thoại: "+ soDienThoai+"\nTiền thuê: "+tienThue);
    }
}
