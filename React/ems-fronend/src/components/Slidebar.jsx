import React from 'react'
import '../assets/Slidebar.css';    
import '../assets/Slidebar'
const SlideBar = () => {
    return (
        <div class="sidebar">
            <div class="top">
                <div class="logo">
                    <i class="bx bxl-spring-boot"></i>
                    <span>420</span>
                </div>
                <i class="bx bx-menu" id="btn"></i>
            </div>
            <div class="user">
                <img src="/src/main/webapp/img/tuan_dat.jpg" alt="me" class="user-img"></img>
                <div>
                    <p class="bold">Tuan Dat</p>
                    <p>Nhan vien</p>
                </div>
            </div>
            <ul>
                <li>
                    <a href="#">
                        <i class="bx bxs-home"></i>
                        <span class="nav-item">Trang chủ</span>
                    </a>
                    <span class="tooltip">Trang chủ</span>
                </li>
                <li id="qlp">
                    <a href="javascript:void(0);">
                        <i class="bx bxs-door-open"></i>
                        <span class="nav-item">Quản lý phòng</span>
                    </a>
                    <span class="tooltip">Quản lý phòng</span>
                    <ul class="sub-menu">
                        <li>
                            <a href="#">
                                <i class="bx bxs-door-open"></i>
                                Phòng
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="bx bxs-door-open"></i>
                                Loại phòng
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="bx bxs-door-open"></i>
                                Tiện nghi
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="dv">
                    <a href="#">
                        <i class="bx bxs-food-menu"></i>
                        <span class="nav-item">Dịch vụ</span>
                    </a>
                    <span class="tooltip">Dịch vụ</span>
                </li>
                <li>
                    <a href="#">
                        <i class="bx bxs-receipt"></i>
                        <span class="nav-item">Hóa đơn</span>
                    </a>
                    <span class="tooltip">Hóa đơn</span>
                </li>
                <li>
                    <a href="#">
                        <i class="bx bxs-user"></i>
                        <span class="nav-item">Nhân viên</span>
                    </a>
                    <span class="tooltip">Nhân viên</span>
                </li>
                <li>
                    <a href="#">
                        <i class="bx bxs-user"></i>
                        <span class="nav-item">Khách hàng</span>
                    </a>
                    <span class="tooltip">Khách hàng</span>
                </li>
                <li>
                    <a href="#">
                        <i class="bx bxs-log-out"></i>
                        <span class="nav-item">Đăng xuất</span>
                    </a>
                    <span class="tooltip">Đăng xuất</span>
                </li>
            </ul>
        </div>
    );
}
export default SlideBar