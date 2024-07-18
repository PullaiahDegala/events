package com.mouritech.mtevent.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.mtevent.dao.EventInstanceRepository;
import com.mouritech.mtevent.dao.EventRepository;
import com.mouritech.mtevent.dao.LocationsRepository;
import com.mouritech.mtevent.dao.ScheduledItemsRepository;
import com.mouritech.mtevent.dto.EventDto;
import com.mouritech.mtevent.dto.response.EventDTO;
import com.mouritech.mtevent.dto.response.EventInstancesDTO;
import com.mouritech.mtevent.dto.response.EventResponse;
import com.mouritech.mtevent.dto.response.ScheduledItemsDTO;
import com.mouritech.mtevent.mapping.EventMapping;
import com.mouritech.mtevent.model.Event;
import com.mouritech.mtevent.model.EventInstances;
import com.mouritech.mtevent.model.Locations;
import com.mouritech.mtevent.model.ScheduledItems;
import com.mouritech.mtevent.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepository;
	@Autowired
	private EventInstanceRepository eventInstanceRepository;
	@Autowired
	private ScheduledItemsRepository scheduledItemsRepository;
	@Autowired
	private LocationsRepository LocationsRepository;

	@Override
	public EventDto setEvents(EventDto eventDto) {

		Event event = EventMapping.mappingToEntity(eventDto);
		Event response = eventRepository.save(event);
		EventDto responseDto = EventMapping.mappingToDto(response);
		return responseDto;
	}

	@Override
	public EventDto updateEvent(EventDto eventDto) {

		Event event = EventMapping.mappingToEntity(eventDto);
		Event response = eventRepository.save(event);
		EventDto responseDto = EventMapping.mappingToDto(response);
		return responseDto;
	}

	@Override
	public Boolean deleteByid(Integer id) {
		Optional<Event> option = eventRepository.findById(id);

		if (option.isPresent()) {
			Event event = option.get();
			event.setIsActive(false);
			eventRepository.save(event);
			return true;
		}
		return null;
	}

	@Override
	public EventResponse getEvents(Integer eventId, Integer eventInstanceId, Integer locationId) {
		EventResponse response = new EventResponse();
		List<EventDTO> listEventDto = new ArrayList<EventDTO>();
		if (eventId != null) {
			EventDTO eventDto = new EventDTO();
			Optional<Event> eventOption = eventRepository.findById(eventId);
			Event event = eventOption.get();
			eventDto.setEventId(event.getEventId());
			eventDto.setName(event.getName());
			eventDto.setDescription(event.getDescription());
			eventDto.setImage(event.getImage());
			List<EventInstancesDTO> eventInstancesDtoList = new ArrayList<EventInstancesDTO>();
			List<EventInstances> eventInstances = eventInstanceRepository.getByEventId(eventId);
			for (EventInstances rowApple : eventInstances) {
				EventInstancesDTO eventInstance = new EventInstancesDTO();
				eventInstance.setEventInstanceId(rowApple.getEventInstanceId());
				eventInstance.setStartTime(rowApple.getStartTime());
				eventInstance.setEndTime(rowApple.getEndTime());
				Optional<Locations> locations = LocationsRepository.findById(rowApple.getLocation().getLocationId());
				Locations mylocation = locations.get();
				eventInstance.setLocationName(mylocation.getLocationName());
				List<ScheduledItemsDTO> dtoItemsList = new ArrayList<ScheduledItemsDTO>();
				List<ScheduledItems> originalList = scheduledItemsRepository
						.findByEventInstanceId((eventInstance.getEventInstanceId()));
				for (ScheduledItems items : originalList) {
					ScheduledItemsDTO scheduledItemsDTO = new ScheduledItemsDTO();
					scheduledItemsDTO.setEndTime(items.getEndTime());
					scheduledItemsDTO.setName(items.getName());
					scheduledItemsDTO.setNotes(items.getNotes());
					scheduledItemsDTO.setStartTime(items.getStartTime());
					dtoItemsList.add(scheduledItemsDTO);
				}
				eventInstance.setScheduledItems(dtoItemsList);

				eventInstancesDtoList.add(eventInstance);
			}
			eventDto.setInstances(eventInstancesDtoList);
			listEventDto.add(eventDto);
			response.setEvents(listEventDto);
			return response;
		}
		else if(eventInstanceId!=null)
		{
			
			Optional<EventInstances> optionInstance = eventInstanceRepository.findById(eventInstanceId);
			EventInstances eventInstances=optionInstance.get();
			EventInstancesDTO eventInstanceDto=new EventInstancesDTO();
			eventInstanceDto.setEventInstanceId(eventInstances.getEventInstanceId());
			eventInstanceDto.setStartTime(eventInstances.getStartTime());
			eventInstanceDto.setEndTime(eventInstances.getEndTime());
			
			
			Optional<Locations> locations = LocationsRepository.findById(eventInstances.getLocation().getLocationId());
			Locations myLocation=locations.get();
			eventInstanceDto.setLocationName(myLocation.getLocationName());
			Optional<Event> eventOptinal = eventRepository.findById(eventInstances.getEvent().getEventId());
			Event event=eventOptinal.get();
			EventDTO eventDto=new EventDTO();
			eventDto.setEventId(event.getEventId());
			
			
			//
			List<EventInstancesDTO> eventInstancesList =new ArrayList<EventInstancesDTO>();
			
			
			List<ScheduledItemsDTO> dtoItemsList = new ArrayList<ScheduledItemsDTO>();
			
			List<ScheduledItems> originalList = scheduledItemsRepository
					.findByEventInstanceId((eventInstances.getEventInstanceId()));
			for (ScheduledItems items : originalList) {
				ScheduledItemsDTO scheduledItemsDTO = new ScheduledItemsDTO();
				scheduledItemsDTO.setEndTime(items.getEndTime());
				scheduledItemsDTO.setName(items.getName());
				scheduledItemsDTO.setNotes(items.getNotes());
				scheduledItemsDTO.setStartTime(items.getStartTime());
				dtoItemsList.add(scheduledItemsDTO);
			}
			eventInstanceDto.setScheduledItems(dtoItemsList);
			eventInstancesList.add(eventInstanceDto);
 
			eventDto.setInstances(eventInstancesList);
			listEventDto.add(eventDto);
			response.setEvents(listEventDto);
			
		}
   
		else {

			List<Event> allEvent = eventRepository.findAll();
			for (Event event : allEvent) {
				EventDTO eventDto = new EventDTO();

				eventDto.setEventId(event.getEventId());
				eventDto.setName(event.getName());
				eventDto.setDescription(event.getDescription());
				eventDto.setImage(event.getImage());
				List<EventInstancesDTO> eventInstancesDtoList = new ArrayList<EventInstancesDTO>();
				List<EventInstances> eventInstances = eventInstanceRepository.getByEventId(event.getEventId());
				for (EventInstances rowApple : eventInstances) {
					EventInstancesDTO eventInstance = new EventInstancesDTO();
					eventInstance.setEventInstanceId(rowApple.getEventInstanceId());
					eventInstance.setStartTime(rowApple.getStartTime());
					eventInstance.setEndTime(rowApple.getEndTime());
					Optional<Locations> locations = LocationsRepository
							.findById(rowApple.getLocation().getLocationId());
					Locations mylocation = locations.get();
					eventInstance.setLocationName(mylocation.getLocationName());
					List<ScheduledItemsDTO> dtoItemsList = new ArrayList<ScheduledItemsDTO>();
					List<ScheduledItems> originalList = scheduledItemsRepository
							.findByEventInstanceId((eventInstance.getEventInstanceId()));
					for (ScheduledItems items : originalList) {
						ScheduledItemsDTO scheduledItemsDTO = new ScheduledItemsDTO();
						scheduledItemsDTO.setEndTime(items.getEndTime());
						scheduledItemsDTO.setName(items.getName());
						scheduledItemsDTO.setNotes(items.getNotes());
						scheduledItemsDTO.setStartTime(items.getStartTime());
						dtoItemsList.add(scheduledItemsDTO);
					}
					eventInstance.setScheduledItems(dtoItemsList);
					eventInstancesDtoList.add(eventInstance);
				}
				eventDto.setInstances(eventInstancesDtoList);
				listEventDto.add(eventDto);
			}

			response.setEvents(listEventDto);
			return response;
		}
		return response;	
}
}
