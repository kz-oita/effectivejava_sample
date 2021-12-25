package item18;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSetExtendsPattern<E> extends HashSet<E> {

	// 要素の挿入回数
    private int addCount = 0;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
