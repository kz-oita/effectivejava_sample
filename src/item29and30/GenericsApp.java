package item29and30;

public class GenericsApp {

	//参考：https://www.sejuku.net/blog/22699

	public static void main(String[] args) {
		//ClassCastExceptionが発生
		GenericsClassSample sample = new GenericsClassSample("Hello");
		Integer i = (Integer)sample.getO();
		System.out.println(i);


		//ClassCastExceptionが発生しない
		GenericsClassSample2<String> cs1 = new GenericsClassSample2<String>("Hello");
        String str = cs1.getT();
        System.out.println(str);

        GenericsClassSample2<Integer> cs2 = new GenericsClassSample2<Integer>(1);
        Integer i2 = cs2.getT();
        System.out.println(i2);

        //ワイルドカードでextendsを使う場合
        // Integer型として利用可能
        GenericsClassSample2<Integer> cs3 = new GenericsClassSample2<Integer>(1);
        Integer i3 = cs2.getT();
        System.out.println(i3);

        // ワイルドカードを使用 Number型として利用可能
        GenericsClassSample2<? extends Number> cs4;
        cs4 = cs3;
        Number n = cs4.getT();
        System.out.println(n);


        //ワイルドカードでsuperを使う場合
        GenericsClassSample2<Number> cs5 = new GenericsClassSample2<Number>(1);
        GenericsClassSample2<? super Integer> cs6;
        cs6 = cs5;
        Object o = cs6.getT();
        System.out.println(o);
	}
}
