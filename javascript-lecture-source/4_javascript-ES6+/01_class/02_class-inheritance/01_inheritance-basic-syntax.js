// 상속 기본 문법

// Animal 클래스 선언
class Animal {

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

}

let animal = new Animal("동물", 30);
animal.eat(1);
animal.move(0.5);

// Animal을 상속 받는 Human 클래스 선언 - extends 키워드를 사용한다.
class Human extends Animal {

    develop(language){
        console.log(`${this.name}(은)는 ${language}로 개발을 합니다. 정말 즐겁습니다^.^`);
    }
}

let human = new Human("수강생", 70);
human.eat(2);
human.move(1);
human.develop("JavaScript");
