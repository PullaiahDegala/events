package com.mouritech.mtevent.service;

import com.mouritech.mtevent.dto.EventInstancesDto;

public interface EventInstancesService {

	public Object createEventInstances(EventInstancesDto eventInstancesDto);
	public Object updateEventInstances(EventInstancesDto eventInstancesDto);
	public Boolean deleteById(Integer id);

}
