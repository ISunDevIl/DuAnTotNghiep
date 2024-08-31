import React from 'react'
import { Link } from 'react-router-dom';

import '../assets/Slidebar.css';
const SlideBar = () => {
    return (

        <div class="sidebar">
            <ul>
                <li className="nav-item">
                    <Link className="nav-link" to="/DichVu">Trang chủ</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="/DichVu">Dịch vụ</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="/DichVu">Hóa đơn</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="/NhanVien">Nhân viên</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="/DichVu">Khách hàng</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="/DichVu">Đăng xuất</Link>
                </li>
            </ul>
        </div>
    );
}
export default SlideBar