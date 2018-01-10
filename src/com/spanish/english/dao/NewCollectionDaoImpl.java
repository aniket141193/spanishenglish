package com.spanish.english.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spanish.english.form.EstablishmentCollection;
import com.spanish.english.form.MachineCollectionNew;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class NewCollectionDaoImpl implements NewCollectionDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public boolean addOrUpdateEstablishmentCollection(
			EstablishmentCollection estaColl) {
		boolean flag = false;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.saveOrUpdate(estaColl);
			tx.commit();
			session.close();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public EstablishmentCollection getEstablishmentCollectionById(long id) {
		Session session;
		EstablishmentCollection machine = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session
					.createCriteria(EstablishmentCollection.class);
			criteria.add(Restrictions.eq("id", id));
			Object result = criteria.uniqueResult();
			machine = (EstablishmentCollection) result;
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return machine;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public Set<EstablishmentCollection> getEstablishmentCollectionByEstablishmentIdAndOperatorId(
			long establishmentId, long operatorId) {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();

		Criteria c = session.createCriteria(EstablishmentCollection.class);
		c.createAlias("establishment", "e");
		c.add(Restrictions.eq("e.id", establishmentId));
		c.createAlias("operator", "o");
		c.add(Restrictions.eq("o.id", operatorId));

		List<EstablishmentCollection> list = c.list();
		Set<EstablishmentCollection> machineList = new HashSet<EstablishmentCollection>(
				list);
		tx.commit();
		session.close();
		return machineList;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public boolean addOrUpdateMachineCollectionNew(
			MachineCollectionNew machineColl) {
		boolean flag = false;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.saveOrUpdate(machineColl);
			tx.commit();
			session.close();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public MachineCollectionNew getMachineCollectionNewById(long id) {
		Session session;
		MachineCollectionNew machine = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session
					.createCriteria(MachineCollectionNew.class);
			criteria.add(Restrictions.eq("id", id));
			Object result = criteria.uniqueResult();
			machine = (MachineCollectionNew) result;
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return machine;
	}

	@Override
	public EstablishmentCollection getLastEstablishmentCollection() {
		Session session = sessionFactory.openSession();
		EstablishmentCollection result = (EstablishmentCollection) session
				.createQuery("from EstablishmentCollection ORDER BY id DESC")
				.setMaxResults(1).uniqueResult();
		session.close();
		return result;
	}

	@Override
	public MachineCollectionNew getLastMachineCollectionNew() {
		Session session = sessionFactory.openSession();
		MachineCollectionNew result = (MachineCollectionNew) session
				.createQuery("from MachineCollectionNew ORDER BY id DESC")
				.setMaxResults(1).uniqueResult();
		session.close();
		return result;
	}

}
