package Com.Yedam.collections.test;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoradList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);

		}
		return list;
	}
}
