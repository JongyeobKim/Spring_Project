package kr.ac.kopo.board.dao;

import java.util.List;

import kr.ac.kopo.board.domain.Gongji;

public interface GongjiDao {
	Long count();
	Gongji selectOne(long id);
	List<Gongji> selectAll();
	List<Gongji> selectAllByPagination(int page, int itemSizePerPage);
	int createOne(Gongji gongji);
	void updateOne(Gongji gongji);
	void deleteOne(Gongji gongji);
	int deleteAll();
}
