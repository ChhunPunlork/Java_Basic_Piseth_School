package Com.piseth.School.MethodReference;

public class MyFinder2 implements Finder{

	@Override
	public int find(String source, String txtTofile) {
		return source.indexOf(txtTofile);
	}

}
