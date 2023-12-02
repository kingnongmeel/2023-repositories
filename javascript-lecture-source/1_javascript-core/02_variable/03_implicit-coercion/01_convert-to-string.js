// 문자열 타입으로 암묵적 변환

// 1. 문자열 연결 연산자 : 문자열 타입이 아닌 피연산자를 문자열 타입으로 암묵적 변환
console.log(10 + '20');

// 2. 템플릿 리터럴 표현식 삽입 : 표현식의 결과를 문자열 타입으로 암묵적으로 변환
console.log(`10 + 20 = ${10 + 20}`);

// 문자열 타입이 아닌 값을 문자열 타입으로 암묵적으로 변환하는 결과
console.log(1 + '');
console.log(NaN + '');
console.log(Infinity + '');
console.log(true + '');
console.log(null + '');
console.log(undefined + '');
//console.log(Symbol() + '');   // TypeError: Cannot convert a Symbol value to a string
console.log({} + '');           // 객체 - "[object Object]"
console.log([] + '');           // 배열 - ""
console.log(function(){} + ''); // 함수 - "function(){}"