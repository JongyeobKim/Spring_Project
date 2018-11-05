package kr.ac.kopo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.board.dao.GongjiDao;
import kr.ac.kopo.board.domain.Gongji;
import kr.ac.kopo.board.vo.PaginationVO;

@Service
public class GongjiServiceImpl implements GongjiService {

	@Autowired
	GongjiDao gongjiDao;
	
	@Override
	public Long count() {
		return gongjiDao.count();
	}

	@Override
	public Gongji selectOne(long id) {
		return gongjiDao.selectOne(id);
	}

	@Override
	public List<Gongji> selectAll() {
		return gongjiDao.selectAll();
	}

	@Override
	public List<Gongji> selectAllByPagination(int page, int itemSizePerPage) {
		return gongjiDao.selectAllByPagination(page, itemSizePerPage);
	}

	@Override
	public int createOne(Gongji gongji) {
		return gongjiDao.createOne(gongji);
	}

	@Override
	public void updateOne(Gongji gongji) {
		gongjiDao.updateOne(gongji);
	}

	@Override
	public void deleteOne(Gongji gongji) {
		gongjiDao.deleteOne(gongji);
	}

	@Override
	public int deleteAll() {
		return gongjiDao.deleteAll();
	}
	
	@Override
	public boolean isUserExist(Gongji gongji) {
		Gongji g = gongjiDao.selectOne(gongji.getId());
		return g == null ? false : true;
	}
	
	@Override
	public void deleteOne(long id) {
		Gongji g = gongjiDao.selectOne(id);
		gongjiDao.deleteOne(g);
	}
	
	public PaginationVO calcPaging(int page, int itemSizePerPage) {
		PaginationVO paginationVo = new PaginationVO();
		
		int start = ((page-1) / 10) * 10 +1;
		int end = ((page-1) / 10) * 10 + 10;
		int maxCount = count().intValue();	// 전체 데이터 개수
		int lastPage;
		
		 if (maxCount % itemSizePerPage == 0) 
             lastPage = maxCount / itemSizePerPage;
         else 
             lastPage = maxCount / itemSizePerPage + 1;
		 
		 int lastStart = ((lastPage-1) / 10) * 10 +1;
		 int lastEnd = ((lastPage-1) / 10) * 10 + 10;
		 
		 if (end > lastPage)
			 end = lastPage;
		 
		 int leftPage = (page >= 1 && page <= 10) ? ( (page == 1) ? 1 : page-1 ) : page-1;
		 int rightPage = ( lastStart == start && lastEnd >= end ) ? ( (page == lastPage) ? lastPage : page+1 ) : page+1;
		 
		 paginationVo.setPage(page);
		 paginationVo.setItemSizePerPage(itemSizePerPage);
		 paginationVo.setStart(start);
		 paginationVo.setEnd(end);
		 paginationVo.setLastStart(lastStart);
		 paginationVo.setLastEnd(lastEnd);
		 paginationVo.setLastPage(lastPage);
		 paginationVo.setLeftPage(leftPage);
		 paginationVo.setRightPage(rightPage);
		
		return paginationVo;
	}
}
