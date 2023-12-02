// 반환문

function hello(name) {
    // 반환문
    return `${name}님 안녕하세요!`;
    // 반환문 이후의 문은 실행되지 않고 무시 된다.
    console.log(name);
}

console.log(hello('유관순'));

function func() {
    console.log('함수가 호출 되었습니다.');
    // 반환 값이 없을 시 반환문 생략 가능하며 암묵적으로 undefined 반환
    return; //반환 값을 명시적으로 지정하지 않으면 undefined 반환
}

console.log(func());