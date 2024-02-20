# 자바빈즈 (JavaBeans)
## 소개
자바빈즈는 재사용이 가능한 소프트웨어 컴포넌트입니다. 기본적으로 데이터와 기능을 캡슐화하여 쉽게 액세스하고 관리할 수 있도록 하는 자바 클래스입니다.<br>
또한 한번 작성하면 어디서든 실행할 수 있는 상호운용성도 가지고 있어 다양한 자바 프레임워크에서 사용됩니다.<br><br>
자바빈즈를 사용하려면 몇가지 제약조건이 있습니다.
## 제약조건
- public 기본 생성자가 필요 : 자바빈즈를 사용하려면 기본 생성자가 반드시 필요 합니다.
- Serializable : java.io.Serializable 인터페이스를 구현하여 직렬화를 할 수 있어야 합니다. 왜냐하면 데이터를 저장하고 다시 사용할 수 있도록 하기 위함입니다.
- Public 접근자로 Private Field에 액세스 : 자바빈즈는 private으로 캡슐화가 되어 있어 public으로 접근 하거나 수정할 수 있는 getter와 setter를 가지고 있어야합니다. 
- 각종 이벤트 처리를 할 수 있어야 합니다.

## 자바빈즈 사용 예시
자바빈즈 생성<br>
[PersonBean.java](..\src\main\java\com\chafy\learn\backend\javabeans\PersonBean.java)<br>
[PersonBean.java : 깃허브용](/src/main/java/com/chafy/learn/backend/javabeans/PersonBean.java)<br>

생성된 자바빈즈를 사용<br>
[TestPersonBean](..\src\main\java\com\chafy\learn\backend\javabeans\TestPersonBean.java)<br>
[TestPersonBean : 깃허브용](/src/main/java/com/chafy/learn/backend/javabeans/TestPersonBean.java)<br>

## 자바빈즈의 장점

- 재사용성 : 자바빈즈는 한번 만들어 놓으면 언제든지 재사용할 수 있는 장점이 있어 빠른 개발에 적합합니다.
- 상호 운용성 : 자바빈즈는 여러 자바 프레임워크와 호환이 되어 개발을 쉽게 할 수가 있습니다.
- 사용의 편의성 : 자바빈즈의 생성은 private 필드를 선언하고 getter와 setter를 사용하여 데이터에 쉽게 접근하고 사용할 수 있습니다.
- 그 외 IDE와 같은 툴에서는 자바빈즈의 구성요소를 쉽게 사용할 수 있도록 지원하고 있어 빠른 개발을 할 수가 있습니다.

## 결론 
자바빈즈는 재사용성과 상호운용성을 가지고 있기 때문에 어디서든 사용을 할 수가 있고 다른 프레임워크와 원활하게 통합할 수가 있습니다.
그래서 자바빈즈를 잘 활용하면 개발을 효율적으로 할 수 있습니다.