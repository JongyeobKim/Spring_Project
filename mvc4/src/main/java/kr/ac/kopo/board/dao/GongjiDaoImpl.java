package kr.ac.kopo.board.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.kopo.board.domain.Gongji;

@Transactional
@Repository
public class GongjiDaoImpl implements GongjiDao {

	@Autowired
	private SessionFactory sessionFactory;	// hibernate 관련 SessionFactory
	
	private Session getSession() {
//		return sessionFactory.openSession();	
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Long count() {
		String hql = "SELECT COUNT(*) FROM Gongji";	// 하이버네이트 테이블명 첫 글자 대문자
		Query query = getSession().createQuery(hql);
		Long totalCount = (Long) query.uniqueResult();
		return totalCount;
	}
	
	@Override 
	public Gongji selectOne(long id) {
		String hql = "FROM Gongji u WHERE u.id = " + id;
		Query query = getSession().createQuery(hql);
		return (Gongji) query.uniqueResult();
		
//		return (User) query.list().get(0);
		
//		return (Users) getSession().get(Users.class, id);
	}

	@Override
	public List<Gongji> selectAll() {
		String hql = "FROM Gongji";
		Query query = getSession().createQuery(hql);
		return query.list();
		
//		return getSession().createCriteria(Users.class).list();
	}
	
	@Override
	public List<Gongji> selectAllByPagination(int page, int itemSizePerPage) {
		String hql = "FROM Gongji ORDER BY id DESC";
		Query query = getSession().createQuery(hql);
		query.setFirstResult((page - 1) * itemSizePerPage);
		query.setMaxResults(itemSizePerPage);
		return query.list();
	}

	@Override
	public int createOne(Gongji gongji) {
		return (int) getSession().save(gongji);
		
//		session.flush();
//		session.close();
	}

	@Override
	public void updateOne(Gongji gongji) {
		getSession().saveOrUpdate(gongji);
	}

	@Override
	public void deleteOne(Gongji gongji) {
		getSession().delete(gongji);
	}
	
	@Override
	public int deleteAll() {
		String hql = "DELETE FROM Gongji";
		Query query = getSession().createQuery(hql);
		return query.executeUpdate();
	}
	
}
