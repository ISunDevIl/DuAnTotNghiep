import React from 'react'

const HeaderComponents = () => {
  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <a className="navbar-brand" href="#">Logo</a>
            <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarNav">
                <ul className="navbar-nav">
                    <li className="nav-item active">
                        <a className="nav-link" href="#">Trang chủ <span className="sr-only">(current)</span></a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link" href="/DichVu">Dịch vụ</a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link" href="/NhanVien">Nhân viên</a>
                    </li>
                </ul>
            </div>
        </nav>
    );
}
export default HeaderComponents