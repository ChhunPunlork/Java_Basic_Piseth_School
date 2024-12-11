package Com.piseth.School.MethodReference;

public class MyFinder implements Finder{

	public int find(String source, String txtTofile) {
		return source.indexOf(txtTofile);
	}

}
