let list = document.querySelector(".list_product");
let add = document.querySelector(".add");
let input = document.querySelector(".input");
let arrProduct = ["sony", "samsung", "iphone", "lg", "opple"];

const renderProduct = () => {
  let tableList = `<tr class="heading">
  <td colspan="2">Product Name</td>
  <td style="text-align: right">${arrProduct.length} Product</td>
    </tr>`;

  arrProduct.forEach((item, index) => {
    tableList += `<tr id="rowPro">
        <td>${item}</td>
        <td><button id="edit_product" onclick="edit(${index})">Edit</button></td>
        <td><button onclick ="deletePro(${index})"
        >Delete</button></td>
        </tr>`;
  });
 
  list.innerHTML = tableList;
};
renderProduct();

const addProduct = () => {
  add.onclick = () => {
    arrProduct.unshift(input.value);
    input.value = "";
    renderProduct();
  };
};
addProduct();

function edit(index) {
  
  let rowPro = document.querySelectorAll("#rowPro");

  rowPro[index].innerHTML = `<td ><input id="name_product" type="text" placeholder="edit product" /></td>
  <td><button onclick="update(${index})">Update</button></td>
  <td><button onclick ="deletePro(${index})"
  >Delete</button></td>`;

}

function update(index) {

  let nameUpdates = document.querySelectorAll("#name_product");
  arrProduct[index]= nameUpdates[index].value;
  renderProduct();
}

function deletePro(index) {
  arrProduct.splice(index, 1);
  renderProduct(arrProduct);
}
