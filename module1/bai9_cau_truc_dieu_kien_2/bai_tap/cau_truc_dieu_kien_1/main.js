//hàm viết gọn lấy id
function Id(id) {
    return document.getElementById(id);
}

//bai 1 :kiểm tra a có chia hết cho b

function divisible() {
    let a = Id('numberA').value;
    let b = Id('numberB').value;


    if (a.length > 0 && b.length > 0) {
        if (parseFloat(a) % parseFloat(b) == 0) Id('result').innerText = "a chia hết cho b";
        else Id('result').innerText = "a không chia hết cho b";
    } else Id('result').innerText = "";
}


//bai 2 : Kiểm tra đủ điều kiện học lớp 10(lớn hơn hoặc bằng 16 tuổi)
function checkAge() {
    let age = Id('age').value;
    if (age.length > 0) {
        if (parseInt(age) >= 16) Id('result_check').innerText = "bạn đủ điều kiện học lớp 10";
        else Id('result_check').innerText = "bạn không đủ điều kiện học lớp 10";
    } else Id('result_check').innerText = "";
}

//bai  3 : kiểm tra số lớn hay nhỏ hơn 0
function checkZero() {
    let number = Id('number').value;
    if (number.length > 0) {
        if (parseInt(number) > 0) Id('result_checkZero').innerText = `số ${number} lớn hơn 0`;
        else Id('result_checkZero').innerText = `số ${number} nhỏ hơn 0`;
    } else Id('result_checkZero').innerText = "";
}

//bai 4 : tìm giá trị lớn nhất của ba số nguyên

function max() {
    let a = Id('numA').value;
    let b = Id('numB').value;
    let c = Id('numC').value;
    let max = parseInt(a);

    if (a.length > 0 && b.length > 0 && c.length > 0) {
        if(max < b) max= parseInt(b);
        if(max < c) max = parseInt(c);
        Id('numMax').innerText = `Số lớn nhất trong ba số là : ${max}`;

    } else Id('numMax').innerText = "";
}


//bai 5 :xếp hạng học lực:
//điểm trung bình = (giữa kỳ + cuối kỳ)/2
//điểm tb >=9 : học sinh giỏi
//7 <= điểm tb < 9 : học sinh khá
//điểm tb < 7: học sinh trung bình

function academic() {
    let pointMid = Id('point_mid').value;
    let pointEnd = Id('point_end').value;

    if (pointMid.length > 0 && pointEnd.length > 0) {
        let avg = (parseInt(pointMid) + parseInt(pointEnd)) / 2;

        if (avg >= 9) Id('rate').innerText = "Học sinh giỏi"
        else if (avg >= 7) Id('rate').innerText = "Học sinh khá"
        else Id('rate').innerText = "Học sinh trung bình"

    } else Id('rate').innerText = "";
}

//bai 6 : tính hoa hồng nhận được dựa theo doanh số

// mức hoa hồng theo doanh số bán hàng như sau:
// 5% nếu tổng doanh số nhỏ hơn hoặc bằng 100 triệu.
// 10% nếu tổng doanh số nhỏ hơn hoặc bằng 300 triệu.
// 20 % nếu tổng doanh số là lớn hơn 300 triệu.

function moneyPoundage() {
    let sale = Id('sale').value;
    let poundage;
    if (sale.length > 0) {
        if (parseInt(sale) <= 100*Math.pow(10,6)) poundage = parseInt(sale) * 5 / 100;
        else if (parseInt(sale) <= 300*Math.pow(10,6)) poundage = parseInt(sale) * 10 / 100;
        else poundage = parseInt(sale) * 20 / 100;

        Id('result_money').innerText = ` Tiền hoa hồng của bạn là : ${poundage} VNĐ `;

    } else Id('result_money').innerText = "";

}

//bai 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho


// 600 đồng cho mỗi phút gọi của 50 phút đầu tiên.
// 400 đồng cho mỗi phút gọi của 150 phút tiếp theo.
// 200 đồng cho bất kỳ mỗi phút nào sau 200 phút đầu tiên.

function moneyPhone() {
    let minute = Id('minute').value;
    let money;
    if (minute.length > 0) {

        if(minute > 200) money = (minute - 200) * 200 + 150 * 400 + 50 * 600;
        else if(minute > 50) money = (minute - 50) * 400 + 50 * 600;
        else money = minute * 600;

        //tổng tiền cước điện thoại
        Id('moneySum').innerText = `Tiền cước điện thoại của bạn là: ${money} VNĐ`;

    } else Id('moneySum').innerText = "";

}

