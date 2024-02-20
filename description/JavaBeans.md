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
