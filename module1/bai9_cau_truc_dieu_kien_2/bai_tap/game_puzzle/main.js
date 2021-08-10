let imgs = document.querySelectorAll('.imgs');


imgs.forEach((imgPart, index) => {
    // bam qua cac hinh
    let parts = imgPart.querySelectorAll('.part');
    let partsLen = parts.length;
    parts.forEach((img, index) => {
        img.addEventListener('click', event => {
            //chuyển đổi giữa các hình
            img.classList.remove('active');
            if (index == partsLen - 1) parts[0].classList.add('active');
            else parts[index + 1].classList.add('active');

            //đi tìm hình đúng

            //lấy ra 1 mảng chứa hình ảnh có class active
            let actives = document.querySelectorAll('.active');
            // console.log(actives);

            // lấy những class trong hình ảnh đầu tiên trong mảng actives
            let active = actives[0].classList;
            // console.log(active);

            //lấy class thứ hai trong mảng active
            let check = active[1];
            // console.log(check);

            // so sánh class để in ra kết quả
            let count = 0;
            for (let i = 1 ; i < actives.length ; i++){
                let classIs = actives[i].classList; // mảng chứa những class
                let classAnimal = classIs[1];
                if(check == classAnimal ) count++;
            }
            // console.log(count);
            result(count);
        })
    })
})

let text = document.getElementById('text');
function result(count) {
    if (count == 4) {
        text.innerText = "Đúng rồi bạn ơi";
        document.getElementById('container').style.boxShadow = `10px 0px 10px 0px green`;
    } else {
        text.innerText = " ";
        document.getElementById('container').style.boxShadow = `10px 0px 10px 0px #ccc`;

    }
}


