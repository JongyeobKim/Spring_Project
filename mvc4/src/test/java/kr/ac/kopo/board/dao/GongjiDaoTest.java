package kr.ac.kopo.board.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.kopo.board.domain.Gongji;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-test.xml"})
public class GongjiDaoTest {

	@Autowired
	GongjiDao gongjiDao;	// 스프링 내부적으로 인스턴스화를 처리한다.
	
//    @Before
//    public void setUp() throws Exception {
//    	String u1 = "user1";
//    	User user1 = new User();
//    	user1.setPassword("pw");
//    	user1.setUsername(u1);
//    	user1.setName(u1);
//    	user1.setEmail(u1);
//    	user1.setCreated(new Date());
//    	
//    	String u2 = "user2";
//    	User user2 = new User();
//    	user2.setPassword("pw");
//    	user2.setUsername(u2);
//    	user2.setName(u2);
//    	user2.setEmail(u2);
//    	user2.setCreated(new Date());
//    	
//    	String u3 = "user3";
//    	User user3 = new User();
//    	user3.setPassword("pw");
//    	user3.setUsername(u3);
//    	user3.setName(u3);
//    	user3.setEmail(u3);
//    	user3.setCreated(new Date());
//    	
//    	userDao.createOne(user1);
//    	userDao.createOne(user2);
//    	userDao.createOne(user3);
//    }
    
//    @After
//    public void cleanUp(){
//    	userDao.deleteAll();
//    }
    
//    @Test
//    public void testCount() throws Exception {
//    	Long count = gongjiDao.count();
//    	System.out.println(count);
//        assertEquals(3, count.intValue());
//    }
//    
//    @Test
//    public void testSelectOne() throws Exception {
//    	Gongji g = gongjiDao.selectOne(1);
//        assertEquals("test", g.getTitle());
//    }
    
//    @Test
//    public void testSelectAll() throws Exception {
//    	List<Gongji> g = gongjiDao.selectAll();
    	//assertEquals(3, g.size());
        
        //assertEquals(3 ,1);
//    }
    
//    @Test
//    public void testSelectAllByPagination() throws Exception {
//    	List<Gongji> gongjis = gongjiDao.selectAllByPagination(1, 2);
//    	
//    	for (Gongji g: gongjis) {
//    		System.out.println(g.getTitle());
//    	}
//    	
//        assertEquals(2, gongjis.size());
//    }
    
//    @Test
//    public void testCreateOne() throws Exception {
//    	String name = "user4";
//    	User u = new User();
//    	u.setPassword("pw");
//    	u.setUsername(name);
//    	u.setName(name);
//    	u.setEmail(name);
//    	u.setCreated(new Date());
//    	
//    	int id = userDao.createOne(u);
//    	assertEquals(167, id);
//    }
    
//    @Test
//    public void testUpdateOne() throws Exception {
//    	String pw = "pw3";
//    	User u = userDao.selectOne(1);
//    	u.setPassword(pw);
//    	userDao.updateOne(u);
//    	
//    	assertEquals(pw, u.getPassword());
//    }
    
//    @Test
//    public void testDeleteOne() throws Exception {
//    	User u = userDao.selectOne(167);
//    	userDao.deleteOne(u);
//    	
//    	assertEquals(1, 1);
//    }
    
//    @Test
//    public void testDeleteAll() throws Exception {
//    	int count = userDao.deleteAll();
//    	assertEquals(1, count);
//    }
    
}
