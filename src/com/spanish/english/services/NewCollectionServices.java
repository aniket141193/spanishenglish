package com.spanish.english.services;

import java.util.Set;

import com.spanish.english.form.EstablishmentCollection;
import com.spanish.english.form.MachineCollectionNew;

public interface NewCollectionServices {

	boolean addOrUpdateEstablishmentCollection(EstablishmentCollection estaColl);

	EstablishmentCollection getEstablishmentCollectionById(long id);

	Set<EstablishmentCollection> getEstablishmentCollectionByEstablishmentIdAndOperatorId(
			long establishmentId, long operatorId);

	EstablishmentCollection getLastEstablishmentCollection();

	boolean addOrUpdateMachineCollectionNew(MachineCollectionNew machineColl);

	MachineCollectionNew getMachineCollectionNewById(long id);
	
	MachineCollectionNew getLastMachineCollectionNew();
}
