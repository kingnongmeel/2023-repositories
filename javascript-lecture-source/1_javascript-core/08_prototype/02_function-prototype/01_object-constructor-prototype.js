// 생성자 함수 프로토타입
const user = {
    activate : true,
    login() {
        console.log('로그인 되었습니다.');
    }
};

function Student(name) {
    this.name = name;
}

// 여기서의 prototype은 앞에서 배운 프로토타입(__proto__)과 이름만 같을 뿐 실제로는 일반 프로퍼티이다.
Student.prototype = user;

// F.prototype은 new F를 호출할 때만 사용이 된다.
// new F를 호출할 때 만들어지는 새로운 객체의 [[Prototype]]을 할당한다.
// student.__proto__ = user;
let student = new Student("홍길동");
let student2 = new Student("유관순");

console.log(student.activate);
console.log(student2.activate);
student.login();
student2.login();
