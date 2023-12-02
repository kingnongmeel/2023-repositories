// 정적 프로퍼티
// 스펙에 추가 된 지 얼마 안되는 문법으로 데이터를 클래스 수준에 저장하고 싶을 때 사용한다.

// Animal 클래스 선언
class Animal {

    static planet = "지구";

    constructor(name, weight) {
        this.name = name;
        this.weight = weight;
    }

    eat(foodWeight){
        this.weight += foodWeight;
        console.log(`${this.name}(은)는 ${foodWeight}kg의 식사를 하고 ${this.weight}kg이 되었습니다.`);
    }

    move(lostWeight) {
        if(this.weight > lostWeight)
            this.weight -= lostWeight;
        console.log(`${this.name}(은)는 움직임으로 인해 ${lostWeight}kg 감량되어 ${this.weight}kg이 되었습니다.`);
    }

    static compare(animalA, animalB) {
        return animalA.weight - animalB.weight;
    }

}

Animal.staticProperty = 'static을 사용한 선언은 기술적으론 클래스 자체에 직접 할당하는 것과 동일하다';

console.log(Animal.planet);
console.log(Animal.staticProperty);

// Animal을 상속 받는 Human 클래스
class Human extends Animal {

    develop(language){
        console.log(`${this.name}(은)는 ${language}로 개발을 합니다. 정말 즐겁습니다^.^`);
    }
}

let humans = [
    new Human("홍길동", 70),
    new Human("선덕여왕", 50),
    new Human("신사임당", 60)
];

humans.sort(Human.compare);
console.log(humans);

console.log(Human.planet);
console.log(Human.staticProperty);

// 정적 프로퍼티와 정적 메서드는 상속이 된다.
console.log(Human.__proto__ === Animal);
// 프로토타입 프로퍼티, 메서드 상속
console.log(Human.prototype.__proto__ === Animal.prototype);