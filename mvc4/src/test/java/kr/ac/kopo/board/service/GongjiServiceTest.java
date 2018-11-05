package kr.ac.kopo.board.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.kopo.board.vo.PaginationVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-test.xml"})
public class GongjiServiceTest {

	@Autowired
	GongjiService gongjiService;
	
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void cleanUp(){
    }
    
//    @Test
//    public void testIsUserExist() throws Exception {
//    	Gongji g = new Gongji();
//    	g.setId(1);
//    	
//    	boolean isExist = gongjiService.isUserExist(g);
//        assertEquals(true, isExist);
//    }
    
    @Test
    public void testCount() {
    	Long val = gongjiService.count();
    	System.out.println(val);
    }
    
    @Test
    public void testCalcPaging() {
    	int page = 1;
    	int itemSizePerPage = 2;
    	
    	PaginationVO paginationVo = gongjiService.calcPaging(page, itemSizePerPage);
    	System.out.println(paginationVo.getPage());
    	System.out.println(paginationVo.getItemSizePerPage());
    	System.out.println(paginationVo.getLastEnd());
    }
}

