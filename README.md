# factory-pattern

1. 개요
 - 팩토리 패턴은 생성패턴중 하나이다. 
 - 생성패턴은 인스턴스를 만드는 절차를 추상화하는 패턴이다.
 - 팩토리 패턴은 객체를 생성하는 인터페이스를 미리 정의하지만 인스턴스를 만들 클래스의 결정은 서브 클래스쪽에서 결정하는 패턴이다.
 - 여러개의 서브 클래스를 가진 슈퍼 클래스가 있을때, 들어오는 인자에 따라서 하나의 자식클래스의 인스턴스를 반환해주는 방식이다.
 - 팩토리 패턴은 클래스의 인스턴스를 만드는 시점 자체를 서브 클래스로 미루는 것이다.

2. 사용성 
 - 어떤 클래스가 자신이 생성해야 하는 객체의 클래스를 예측할 수 없을때
 - 생성할 객체를 기술하는 책임을 자신의 서브클래스가 지정했으면 할 때

3. 장단점

  장점 
 - 팩토리 패턴은 클라이언트 코드로부터 서브 클래스의 인스턴스화를 제거하여 서로 간의 종속성을 낮추고 결합도를 느슨하게 하며 확장을 쉽게한다.
 - 팩토리 패턴은 클라이언와 구현 객체들 사이에 추상화를 제공한다.

  단점
 - 새로 생성할 객체가 늘어날 때마다, Factory 클래스에 추가해야 되기 때문에 클래스가 많아짐
   
   
   
   
   
