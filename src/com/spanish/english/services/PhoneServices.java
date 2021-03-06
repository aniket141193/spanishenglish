package com.spanish.english.services;

import java.util.Set;

import com.spanish.english.form.Phone;

public interface PhoneServices {
	   boolean addOrUpdatePhone(Phone phone);
	   boolean deletePhone(long phoneId);
	   Phone getPhonebyId(long phoneId);
	   Phone getLastPhone();
	   Set<Phone> getPhoneListByAdmin(long adminId);
	   Set<Phone> getPhoneListByOperator(long operatorId);
	   Set<Phone> getPhoneListByEstablishment(long establishmentId);
	   Set<Phone> getPhoneListByTechnician(long technicianId);
}
