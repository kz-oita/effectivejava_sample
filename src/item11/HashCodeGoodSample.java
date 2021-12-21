package item11;

import java.util.HashMap;
import java.util.Map;

public class HashCodeGoodSample {
	int id;

	HashCodeGoodSample(int id){
		this.id = id;
	}

	//hashCode,equals共にoverrideする
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeGoodSample other = (HashCodeGoodSample) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public static void main(String[] args) {
		HashCodeGoodSample sampele1 = new HashCodeGoodSample(1);
		HashCodeGoodSample sampele2 = new HashCodeGoodSample(1);
		System.out.println(sampele1.equals(sampele2)); //true

		//sample1とsample2では同じ値となる
		System.out.println(sampele1.hashCode()); //32
		System.out.println(sampele2.hashCode()); //32

		Map<HashCodeGoodSample, String> map = new HashMap<HashCodeGoodSample, String>();
		map.put(sampele1, "test1");

		System.out.println(map.get(sampele2)); //test1
	}

}
