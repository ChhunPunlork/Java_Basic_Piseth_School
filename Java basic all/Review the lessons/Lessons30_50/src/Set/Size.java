package Set;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum Size {
	SMALL, MEDIUM,  LARGE, EXTRALARGE;
	
	public static Set<Size> getAll(){
//		Set<Size> size = new HashSet<>();
//		size.add(SMALL);
//		size.add(MEDIUM);
//		size.add(LARGE);
//		size.add(EXTRALARGE);
//		return size;
		return EnumSet.allOf(Size.class);
	}
	
			
}
