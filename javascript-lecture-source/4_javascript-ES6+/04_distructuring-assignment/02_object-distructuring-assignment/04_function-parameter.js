// 함수 매개변수
// 함수의 매개변수가 많거나 매개변수 기본 값이 필요한 경우에 활용

// 인수의 순서가 고정되어 있어 순서가 바뀌면 문제가 생기고,
// 기본 값을 활용하더라도 undefined를 이용해서 인수를 넘겨주어야만 한다.
function displayProduct(producer = "아무개", width = 0, height = 0, items = []){}

displayProduct("신사임당", undefined, undefined, ["Coffee", "Donut"]);

// 구조 분해 할당을 매개변수에 적용한다.
function displayProduct2({producer = "아무개", width = 0, height = 0, items = []}){
    console.log(producer);
    console.log(width);
    console.log(height);
    console.log(items);
}

// 함수에 전달할 객체
let exampleProduct = {
    items : ["Coffee", "Donut"],
    producer : "신사임당"
}

displayProduct2(exampleProduct);