
import './App.css'
import HeaderComponents from './components/HeaderComponents'
import TableDichVu from './components/tableDichVu'
import TableNhanVien from './components/tableNhanVien'
import {BrowserRouter,Routes, Route} from 'react-router-dom'
function App() {

  return (
    <>
      <BrowserRouter>
        <HeaderComponents />
        <Routes>
          {/* // http://localhost:3000/DichVu */}
          <Route path="/DichVu" element={<TableDichVu />} />
          {/* // http://localhost:3000/NhanVien */}
          <Route path="/NhanVien" element={<TableNhanVien />} />
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
