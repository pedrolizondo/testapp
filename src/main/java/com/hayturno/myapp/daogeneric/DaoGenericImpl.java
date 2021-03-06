package com.hayturno.myapp.daogeneric;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.Query;

import com.hayturno.myapp.hibernateutil.HibernateUtil;


public class DaoGenericImpl<Entity, Key extends Serializable> implements
		DaoGeneric<Entity, Key> {

	private final static Logger LOGGER = Logger.getLogger(DaoGenericImpl.class
			.getName());

	private Class<Entity> type;

	private List<Entity> entidades;

	private Session session;

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public DaoGenericImpl(Class<Entity> type) {
		this.type = type;
	}

	private Session getHibernateTemplate() {

		return session;

	}

	@Override
	public void create(Entity entity) {
		// TODO Auto-generated method stub

		try {
			session = sessionFactory.openSession();
			getHibernateTemplate().beginTransaction();
			getHibernateTemplate().save(entity);
			if (!getHibernateTemplate().getTransaction().wasCommitted()) {
				getHibernateTemplate().getTransaction().commit();
			}

		} catch (Exception e) {
			// TODO: handle exception
			try {
				if (getHibernateTemplate().getTransaction().isActive()) {
					getHibernateTemplate().getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING, "Fall� al hacer un rollback", exc);
			}

		} finally {
			try {
				if (getHibernateTemplate().isOpen()) {
					close();
				}

			} catch (Exception e) {
				LOGGER.log(Level.WARNING, "Error closing session", e);
			}
		}

	}

	@Override
	public Entity read(Key id) {
		// TODO Auto-generated method stub
		// System.out.println("La variable key es: " + id);
		Entity entity = null;
		try {
			session = sessionFactory.openSession();
			getHibernateTemplate().beginTransaction();
			entity = (Entity) getHibernateTemplate().get(type, id);
			if (!getHibernateTemplate().getTransaction().wasCommitted()) {
				getHibernateTemplate().getTransaction().commit();
			}

		} catch (Exception e) {
			// TODO: handle exception
			try {
				if (getHibernateTemplate().getTransaction().isActive()) {
					getHibernateTemplate().getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING, "Fall� al hacer un rollback", exc);
			}

		} finally {
			try {
				if (getHibernateTemplate().isOpen()) {
					close();
				}

			} catch (Exception e) {
				LOGGER.log(Level.WARNING, "Error closing session", e);
			}
		}

		return entity;

	}
	
	@Override
	public void update(Entity entity) {
		// TODO Auto-generated method stub
		try {

			session = sessionFactory.openSession();
			getHibernateTemplate().beginTransaction();
			getHibernateTemplate().update(entity);
			if (!getHibernateTemplate().getTransaction().wasCommitted()) {
				getHibernateTemplate().getTransaction().commit();
			}

		} catch (Exception e) {
			// TODO: handle exception
			try {
				if (getHibernateTemplate().getTransaction().isActive()) {
					getHibernateTemplate().getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING, "Fall� al hacer un rollback", exc);
			}

		} finally {
			try {
				if (getHibernateTemplate().isOpen()) {
					close();
				}

			} catch (Exception e) {
				LOGGER.log(Level.WARNING, "Error closing session", e);
			}
		}
	}

	@Override
	public void delete(Entity entity) {
		// TODO Auto-generated method stub

		try {
			session = sessionFactory.openSession();
			getHibernateTemplate().beginTransaction();
			getHibernateTemplate().delete(entity);
			if (!getHibernateTemplate().getTransaction().wasCommitted()) {
				getHibernateTemplate().getTransaction().commit();
			}

		} catch (Exception e) {
			// TODO: handle exception
			try {
				if (getHibernateTemplate().getTransaction().isActive()) {
					getHibernateTemplate().getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING, "Fall� al hacer un rollback", exc);
			}

		} finally {
			try {
				if (getHibernateTemplate().isOpen()) {
					close();
				}

			} catch (Exception e) {
				LOGGER.log(Level.WARNING, "Error closing session", e);
			}
		}

	}

	@Override
	public List<Entity> getAll() {
		// TODO Auto-generated method stub

		Criteria crit = null;
		try {
			session = sessionFactory.openSession();
			getHibernateTemplate().beginTransaction();
			crit = getHibernateTemplate().createCriteria(type);
			if (!getHibernateTemplate().getTransaction().wasCommitted()) {
				getHibernateTemplate().getTransaction().commit();
			}

			entidades = crit.list();

		} catch (Exception e) {
			// TODO: handle exception
			try {
				if (getHibernateTemplate().getTransaction().isActive()) {
					getHibernateTemplate().getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING, "Fall� al hacer un rollback", exc);
			}

		} finally {
			try {
				if (getHibernateTemplate().isOpen()) {
					close();
				}

			} catch (Exception e) {
				LOGGER.log(Level.WARNING, "Error closing session", e);
			}
		}

		return entidades;

	}
	
	@Override
	public List<Object[]> getAllObjets(String sql) {
		
		List<Object[]> listDatos = null;
		
		try{
			session=sessionFactory.openSession();
			session.beginTransaction();
			Query query = (Query) session.createQuery(sql);
			 listDatos= ((Criteria) query).list();
		}catch(Exception e){
			try {
				if (getHibernateTemplate().getTransaction().isActive()) {
					getHibernateTemplate().getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING, "Fall� al hacer un rollback", exc);
			}
		}finally{
			try {
				if (getHibernateTemplate().isOpen()) {
					close();
				}

			} catch (Exception e) {
				LOGGER.log(Level.WARNING, "Error closing session", e);
			}
		}
		
		return listDatos;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		getHibernateTemplate().close();

	}

}
