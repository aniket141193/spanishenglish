package com.spanish.english.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spanish.english.dao.NewCollectionDao;
import com.spanish.english.form.EstablishmentCollection;
import com.spanish.english.form.MachineCollectionNew;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Service("newCollectionServices")
public class NewCollectionServicesImpl implements NewCollectionServices {

	@Autowired
	NewCollectionDao newCollectionDao;

	@Override
	public boolean addOrUpdateEstablishmentCollection(
			EstablishmentCollection estaColl) {
		return newCollectionDao.addOrUpdateEstablishmentCollection(estaColl);
	}

	@Override
	public EstablishmentCollection getEstablishmentCollectionById(long id) {
		return newCollectionDao.getEstablishmentCollectionById(id);
	}

	@Override
	public Set<EstablishmentCollection> getEstablishmentCollectionByEstablishmentIdAndOperatorId(
			long establishmentId, long operatorId) {
		return newCollectionDao
				.getEstablishmentCollectionByEstablishmentIdAndOperatorId(
						establishmentId, operatorId);
	}

	@Override
	public boolean addOrUpdateMachineCollectionNew(
			MachineCollectionNew machineColl) {
		return newCollectionDao.addOrUpdateMachineCollectionNew(machineColl);
	}

	@Override
	public MachineCollectionNew getMachineCollectionNewById(long id) {
		return newCollectionDao.getMachineCollectionNewById(id);
	}

	@Override
	public EstablishmentCollection getLastEstablishmentCollection() {
		return newCollectionDao.getLastEstablishmentCollection();
	}

	@Override
	public MachineCollectionNew getLastMachineCollectionNew() {
		return newCollectionDao.getLastMachineCollectionNew();
	}

}
