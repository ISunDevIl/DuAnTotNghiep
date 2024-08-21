import './App.css';
import HeaderComponents from './components/HeaderComponents';
import SlideBar from './components/Slidebar';
import TableDichVu from './components/tableDichVu';
import TableNhanVien from './components/tableNhanVien';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
      <div className="app-container">
        <SlideBar />
        
        <div className="main-content">
          <HeaderComponents />
          
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
