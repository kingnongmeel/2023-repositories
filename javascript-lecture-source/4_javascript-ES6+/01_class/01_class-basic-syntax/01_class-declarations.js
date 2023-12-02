// 클래스 선언
class Student {

    // 생성자를 통해 인스턴스 생성 및 초기화
    // 생성자는 1개 이상 생성 될 수 없으며 생략할 경우 암묵적으로 정의 된다.
    // 암묵적으로 this를 반환하므로 반환문은 작성하지 않는다.
    constructor(name){
        this.name = name;   // 인수로 인스턴스 초기화
        this.group = 1;     // 고정 값으로 인스턴스 초기화
    }

    // 프로토타입 메소드
    introduce() {
        console.log(`안녕하세요 저는 ${this.group}반 학생 ${this.name}입니다.`);
    }
}

const student = new Student("홍길동");
student.introduce();

console.log(typeof Student);    // function - 클래스는 함수의 한 종류이다.
console.log(Student === Student.prototype.constructor); // true
console.log(Student.prototype.introduce); // [Function: introduce] - 클래스 내부에 정의한 메소드는 프로토타입에 추가 됨
console.log(Object.getOwnPropertyNames(Student.prototype));

// 클래스 문법과 유사하게 기능하는 것처럼 보이는 생성자 함수를 사용할 수도 있다.
function Teacher(name) {
    this.group = 1;
    this.name = name;
}

Teacher.prototype.introduce = function() {
    console.log(`안녕하세요 저는 ${this.group}반 교사 ${this.name}입니다.`);
};

const teacher = new Teacher("유관순");
teacher.introduce();

// 생성자 함수와 클래스의 차이점
// 1. 클래스 생성자를 new와 함께 호출하지 않으면 에러 발생
// Student(); TypeError: Class constructor Student cannot be invoked without 'new'
Teacher();

// 2. 클래스에 정의 된 메서드는 열거 불가
for(method in student) {
    console.log(`반복문 : ${method}`);  // 메소드는 출력 되지 않음
}

for(method in teacher) {
    console.log(`반복문 : ${method}`);  
}