package item11;

import java.util.HashMap;
import java.util.Map;

public class HashCodeBadSample {
	int id;

	HashCodeBadSample(int id){
		this.id = id;
	}

	// equalsのみOvwerrideする
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeBadSample other = (HashCodeBadSample) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public static void main(String[] args) {
		HashCodeBadSample sampele1 = new HashCodeBadSample(1);
		HashCodeBadSample sampele2 = new HashCodeBadSample(1);
		System.out.println(sampele1.equals(sampele2)); //true

		//sample1とsample2では別の値となる
		System.out.println(sampele1.hashCode()); //483422889
		System.out.println(sampele2.hashCode()); //2088051243

		Map<HashCodeBadSample, String> map = new HashMap<HashCodeBadSample, String>();
		map.put(sampele1, "test1");

		System.out.println(map.get(sampele2)); //null
	}

}
