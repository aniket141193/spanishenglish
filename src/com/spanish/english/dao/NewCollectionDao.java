package com.spanish.english.dao;

import java.util.Set;

import com.spanish.english.form.EstablishmentCollection;
import com.spanish.english.form.MachineCollectionNew;

public interface NewCollectionDao {

	boolean addOrUpdateEstablishmentCollection(EstablishmentCollection estaColl);

	EstablishmentCollection getEstablishmentCollectionById(long id);

	EstablishmentCollection getLastEstablishmentCollection();

	Set<EstablishmentCollection> getEstablishmentCollectionByEstablishmentIdAndOperatorId(
			long establishmentId, long operatorId);

	boolean addOrUpdateMachineCollectionNew(MachineCollectionNew machineColl);

	MachineCollectionNew getMachineCollectionNewById(long id);

	MachineCollectionNew getLastMachineCollectionNew();
}
