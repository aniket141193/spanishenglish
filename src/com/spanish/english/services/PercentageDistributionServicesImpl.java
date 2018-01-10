package com.spanish.english.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spanish.english.dao.PercentageDistributionDao;
import com.spanish.english.form.AgreedPercentage;
import com.spanish.english.form.OtherExpenses;
import com.spanish.english.form.PlayersGift;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Service("percentageDistributionServices")
public class PercentageDistributionServicesImpl implements
		PercentageDistributionServices {

	@Autowired
	PercentageDistributionDao percentageDistributionDao;

	@Override
	public void addOrUpdateAgreedPercentge(AgreedPercentage agreedPercentage) {
		percentageDistributionDao.addOrUpdateAgreedPercentge(agreedPercentage);
	}

	@Override
	public void addOrUpdatePlayersGift(PlayersGift playersGift) {
		percentageDistributionDao.addOrUpdatePlayersGift(playersGift);
	}

	@Override
	public void addOrUpdateOtherExpenses(OtherExpenses otherExpenses) {
		percentageDistributionDao.addOrUpdateOtherExpenses(otherExpenses);
	}

	@Override
	public Set<AgreedPercentage> getAgreedPercentageByMachine(long machineId) {
		return percentageDistributionDao
				.getAgreedPercentageByMachine(machineId);
	}

	@Override
	public AgreedPercentage getAgreedPercentageById(long id) {
		return percentageDistributionDao.getAgreedPercentageById(id);
	}

	@Override
	public PlayersGift getPlayersGiftById(long id) {
		return percentageDistributionDao.getPlayersGiftById(id);
	}

	@Override
	public OtherExpenses getOtherExpensesById(long id) {
		return percentageDistributionDao.getOtherExpensesById(id);
	}

	@Override
	public boolean deleteAgreedPercentage(long id) {
		return percentageDistributionDao.deleteAgreedPercentage(id);
	}

	@Override
	public boolean deletePlayersGift(long id) {
		return percentageDistributionDao.deletePlayersGift(id);
	}

	@Override
	public boolean deleteOtherExpenses(long id) {
		return percentageDistributionDao.deleteOtherExpenses(id);
	}

	@Override
	public PlayersGift getPlayersGift(long adminId, long operatorId,
			long establishmentId) {
		return percentageDistributionDao.getPlayersGift(adminId, operatorId,
				establishmentId);
	}

	@Override
	public OtherExpenses getOtherExpenses(long adminId, long operatorId,
			long establishmentId) {
		return percentageDistributionDao.getOtherExpenses(adminId, operatorId,
				establishmentId);
	}

}
