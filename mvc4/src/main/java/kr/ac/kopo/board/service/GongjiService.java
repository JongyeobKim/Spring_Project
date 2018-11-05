package kr.ac.kopo.board.service;

import java.util.List;

import kr.ac.kopo.board.domain.Gongji;
import kr.ac.kopo.board.vo.PaginationVO;

public interface GongjiService {
	
	//-------------------simple--------------------------------------------------------
	Long count();
	Gongji selectOne(long id);
	List<Gongji> selectAll();
	List<Gongji> selectAllByPagination(int page, int itemSizePerPage);
	int createOne(Gongji gongji);
	void updateOne(Gongji gongji);
	void deleteOne(Gongji gongji);
	int deleteAll();
	
	//-------------------complex--------------------------------------------------------
	boolean isUserExist(Gongji gongji);
	void deleteOne(long id);
	PaginationVO calcPaging(int page, int itemSizePerPage);
}
