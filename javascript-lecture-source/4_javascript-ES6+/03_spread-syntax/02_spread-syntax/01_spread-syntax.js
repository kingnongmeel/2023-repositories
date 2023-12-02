// 스프레드 문법 (전개 문법)
// rest parameter처럼 매개변수 목록을 배열로 가져오는 것과는 반대로
// 배열을 통채로 매개변수로 넘겨주는 기능이다.
// 하나로 뭉쳐져있는 여러 값들의 집합을 전개해서 개별적인 값들의 목록으로 만든다.

console.log(`가장 큰 값 : ${ Math.max(10, 20, 30)}`);

let arr = [10, 20, 30];
// Math.max는 배열이 아닌 숫자 목록을 인수로 받기 때문에 배열을 전달하면 원하는 대로 동작하지 않는다.
console.log(`가장 큰 값 : ${ Math.max(arr) }`);
// 스프레드 문법을 사용하면 arr이 인수 목록으로 확장 되어 최대 값을 알아 올 수 있다.
console.log(`가장 큰 값 : ${ Math.max(...arr) }`);

let arr1 = [10, 30, 20];
let arr2 = [100, 300, 200];

console.log(`가장 작은 값 : ${ Math.min(...arr1, ...arr2)} `);  // 배열 객체 여러 개 전달 가능
console.log(`가장 작은 값 : ${ Math.min(1, ...arr1, 2, ...arr2, 3)} `); // 일반 값과 혼합해서 사용 가능

// concat 메소드보다 간결하게 배열 병합에 사용 가능
let merged = [0, ...arr, 2, ...arr2];
console.log(merged);

// 문자열을 배열로 변환
let str = "JavaScript";
console.log([...str]);