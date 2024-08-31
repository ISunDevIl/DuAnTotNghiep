import './App.css';
import Header from './components/Header';
import SlideBar from './components/Slidebar';
import TableDichVu from './components/tableDichVu';
import TableNhanVien from './components/tableNhanVien';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
function App() {
  return (
    <BrowserRouter>
      <div className="app-container">

        <div className="slidebar">
          <SlideBar />
        </div>

        <div className="main-content">
          <div className="header">
            <Header />
          </div>
          <Routes>
            <Route path="/DichVu" element={<TableDichVu />} />
            <Route path="/NhanVien" element={<TableNhanVien />} />
          </Routes>
        </div>
      </div>
    </BrowserRouter>
  );
}


export default App;
