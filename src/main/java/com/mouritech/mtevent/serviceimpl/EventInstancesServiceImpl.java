package com.mouritech.mtevent.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.mouritech.mtevent.dao.EventInstanceRepository;
import com.mouritech.mtevent.dao.EventRepository;
import com.mouritech.mtevent.dao.LocationsRepository;
import com.mouritech.mtevent.dto.EventInstancesDto;
import com.mouritech.mtevent.model.Event;
import com.mouritech.mtevent.model.EventInstances;
import com.mouritech.mtevent.model.Locations;
import com.mouritech.mtevent.service.EventInstancesService;


@Service
public class EventInstancesServiceImpl implements EventInstancesService {

	@Autowired
	private LocationsRepository locationsRepository;

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private EventInstanceRepository eventInstanceRepository;

	@Override
	public Object createEventInstances(EventInstancesDto eventInstancesDto) {

		Optional<Event> event = eventRepository.findById(eventInstancesDto.getEventId());
		
		if (ObjectUtils.isEmpty(event)) {
			return "Event not found";
		}
		Optional<Locations> location = locationsRepository.findById(eventInstancesDto.getLocationId());

		if (ObjectUtils.isEmpty(location)) {
			return "location not found";
		}

		EventInstances eventInstances = new EventInstances();
		eventInstancesDto.setEventInstanceId(eventInstances.getEventInstanceId());
		eventInstances.setEvent(event.get());
		eventInstances.setLocation(location.get());
		eventInstances.setStartTime(eventInstancesDto.getStartTime());
		eventInstances.setEndTime(eventInstancesDto.getEndTime());
		eventInstances.setCreatedBy(eventInstancesDto.getCreatedBy());
		eventInstances.setUpdatedBy(eventInstancesDto.getUpdatedBy());
		eventInstances.setIsActive(true);
		eventInstances = eventInstanceRepository.save(eventInstances); 
		

		return eventInstancesDto;
	}

	@Override
	public Object updateEventInstances(EventInstancesDto eventInstancesDto) 
	{
		
Optional<Event> event = eventRepository.findById(eventInstancesDto.getEventId());
		
		if (ObjectUtils.isEmpty(event)) {
			return "Event not found";
		}
		Optional<Locations> location = locationsRepository.findById(eventInstancesDto.getLocationId());

		if (ObjectUtils.isEmpty(location)) {
			return "location not found";
		}
//		EventInstances eventInstances = new EventInstances();
		Optional<EventInstances> instances = eventInstanceRepository.findById(eventInstancesDto.getEventInstanceId());
		EventInstances eventInstances = instances.get();
		eventInstances.setEvent(event.get());
		eventInstances.setLocation(location.get());
		eventInstances.setStartTime(eventInstancesDto.getStartTime());
		eventInstances.setEndTime(eventInstancesDto.getEndTime());
		eventInstances.setCreatedBy(eventInstancesDto.getCreatedBy());
		eventInstances.setUpdatedBy(eventInstancesDto.getUpdatedBy());
		eventInstances.setIsActive(true);
	//	eventInstancesDto.setEventInstanceId(eventInstances.getEventInstanceId());
		eventInstances = eventInstanceRepository.save(eventInstances); 
		return eventInstancesDto;
	}

	@Override
	public Boolean deleteById(Integer id)
	{
		Optional<EventInstances> optioneventInstance = eventInstanceRepository.findById(id);
		
		if(optioneventInstance.isPresent())
		{
			EventInstances eventInstance=optioneventInstance.get();
			eventInstance.setIsActive(false);
			eventInstanceRepository.save(eventInstance);
			return true;	
			
		}
		return null;
	}

}
