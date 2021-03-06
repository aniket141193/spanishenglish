package com.spanish.english.dao;

import java.util.Set;

import com.spanish.english.form.AgreedPercentage;
import com.spanish.english.form.OtherExpenses;
import com.spanish.english.form.PlayersGift;

public interface PercentageDistributionDao {

	void addOrUpdateAgreedPercentge(AgreedPercentage agreedPercentage);

	void addOrUpdatePlayersGift(PlayersGift playersGift);

	void addOrUpdateOtherExpenses(OtherExpenses otherExpenses);

	Set<AgreedPercentage> getAgreedPercentageByMachine(long machineId);

	PlayersGift getPlayersGift(long adminId, long operatorId,
			long establishmentId);

	OtherExpenses getOtherExpenses(long adminId, long operatorId,
			long establishmentId);

	AgreedPercentage getAgreedPercentageById(long id);

	PlayersGift getPlayersGiftById(long id);

	OtherExpenses getOtherExpensesById(long id);

	boolean deleteAgreedPercentage(long id);

	boolean deletePlayersGift(long id);

	boolean deleteOtherExpenses(long id);
}
