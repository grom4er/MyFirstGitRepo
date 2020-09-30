package Module2.Lessons7;



/*
Question:
What is the parent class of all classes?
Answer:
Parent of all java class is Object

Question:
How do I call the constructor of the parent class?
Answer:
Need use keyword super()

Question:
How do I call the constructor of the parent class?
Answer:
Need use keyword super()


Question:
Will the parent class constructor be called automatically?
Answer:
Yes

Question:
Will the parent class constructor be automatically called with arguments?
Answer:
Only if we use keyword super() with argument

Question:
Can interface type be used for polymorphism?
Answer:
Java interfaces are a way to achieve polymorphism

class A {

}

class B extends A {

}

class C extends B {

}

B b = new A();    - no

B b = new B(); - yes

B b = new C(); - yes

Object obj = new A(); - yes
Object obj1 = new B(); - yes
Object obj2 = new C(); - yes

 */