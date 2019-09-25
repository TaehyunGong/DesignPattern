package singleton;

/*
 * Enum Singleton
 * 장점
 * 1. 구현이 간단
 * 2. Serialization(직렬화)를 별도로 구현할 필요없음
 * 3. Bill Pugh의 모든 장점을 가지고 있음
 * 4. Reflection 공격 방어
 * 
 * 단점
 * 1. JAVA 1.5 부터 사용가능
 * 2. 상황에 따라 사용이 어려워질수도 있음
 */
public enum EnumSingleton {
	INSTANCE;
	
	EnumSingleton() {
		System.out.println("new Instance : " + this.hashCode());
	}

}
