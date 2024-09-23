import React, { useState } from 'react';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';
import { format } from 'date-fns';

const BookingForm = () => {
    const [arrivalDate, setArrivalDate] = useState(null);
    const [departureDate, setDepartureDate] = useState(null);
    const [adults, setAdults] = useState(1);
    const [children, setChildren] = useState(0);

    const handleSubmit = (e) => {
        e.preventDefault();

        const formattedArrivalDate = arrivalDate ? format(arrivalDate, 'dd-MM-yyyy') : '';
        const formattedDepartureDate = departureDate ? format(departureDate, 'dd-MM-yyyy') : '';

        console.log({ formattedArrivalDate, formattedDepartureDate, adults, children });
    };

    return (
        <div>
            <h1>Thông Tin Đặt Phòng</h1>
            <form onSubmit={handleSubmit}>
                <label htmlFor="arrival-date">Ngày đến:</label>
                <DatePicker
                    selected={arrivalDate}
                    onChange={(date) => setArrivalDate(date)}
                    dateFormat="dd-MM-yyyy"
                    minDate={new Date()} // Giới hạn chọn ngày từ hôm nay trở đi
                    required
                />
                <br /><br />

                <label htmlFor="departure-date">Ngày về:</label>
                <DatePicker
                    selected={departureDate}
                    onChange={(date) => setDepartureDate(date)}
                    dateFormat="dd-MM-yyyy"
                    minDate={arrivalDate ? arrivalDate : new Date()} // Giới hạn ngày về phải lớn hơn hoặc bằng ngày đến
                    required
                />
                <br /><br />

                <label htmlFor="adults">Số người lớn:</label>
                <input
                    type="number"
                    id="adults"
                    value={adults}
                    min="1"
                    onChange={(e) => setAdults(e.target.value)}
                    required
                />
                <br /><br />

                <label htmlFor="children">Số trẻ em:</label>
                <input
                    type="number"
                    id="children"
                    value={children}
                    min="0"
                    onChange={(e) => setChildren(e.target.value)}
                    required
                />
                <br /><br />

                <button type="submit">Gửi</button>
            </form>
        </div>
    );
};

export default BookingForm;
