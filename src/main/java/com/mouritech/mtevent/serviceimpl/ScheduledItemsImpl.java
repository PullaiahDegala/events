package com.mouritech.mtevent.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.mouritech.mtevent.dao.EventInstanceRepository;
import com.mouritech.mtevent.dao.ScheduledItemsRepository;
import com.mouritech.mtevent.dto.ScheduledItemsDto;
import com.mouritech.mtevent.model.EventInstances;
import com.mouritech.mtevent.model.ScheduledItems;
import com.mouritech.mtevent.service.ScheduledItemsService;
@Service
public class ScheduledItemsImpl implements ScheduledItemsService
{

	@Autowired
	private EventInstanceRepository eventInstanceRepository;
	@Autowired
	private ScheduledItemsRepository scheduledItemsRepository;
	@Override
	public Object createScheduledItems(ScheduledItemsDto scheduledItemsDto)
	{
		Optional<EventInstances> eventInstance = eventInstanceRepository.findById(scheduledItemsDto.getEventInstanceId());
		if(ObjectUtils.isEmpty(eventInstance) && ! eventInstance.get().getIsActive() )
		{
			return "scheduled items are not found or event instance is not active";
		}
		
		Optional<ScheduledItems> scheduledItems = scheduledItemsRepository.findById(scheduledItemsDto.getScheduledItemId());
		ScheduledItems scheduledItes=scheduledItems.get();
		scheduledItes.setEventInstanceId(eventInstance.get());
		scheduledItes.setName(scheduledItemsDto.getName());
		scheduledItes.setNotes(scheduledItemsDto.getNotes());
		scheduledItes.setStartTime(scheduledItemsDto.getStartTime());
		scheduledItes.setEndTime(scheduledItemsDto.getEndTime());
		scheduledItes.setCreatedBy(scheduledItemsDto.getCreatedBy());
		scheduledItes.setUpdatedBy(scheduledItemsDto.getUpdatedBy());
		scheduledItes.setCreatedOn(scheduledItemsDto.getCreatedOn());
		scheduledItes.setUpdatedOn(scheduledItemsDto.getUpdatedOn());
		scheduledItes.setIsActive(scheduledItemsDto.getIsActive());
		scheduledItes=scheduledItemsRepository.save(scheduledItes);
		//scheduledItes.setScheduledItemId(scheduledItemsDto.getScheduledItemId());	
		return scheduledItemsDto;
	}
	@Override
	public Object updateScheduledItems(ScheduledItemsDto scheduledItemsDto) 
	{

		Optional<EventInstances> optional = eventInstanceRepository.findById(scheduledItemsDto.getEventInstanceId());
		if(ObjectUtils.isEmpty(optional))
		{
			return "scheduled items are not found";
		}
		ScheduledItems scheduledItes=new ScheduledItems();
		scheduledItes.setScheduledItemId(scheduledItemsDto.getScheduledItemId());
		scheduledItes.setEventInstanceId(optional.get());
		scheduledItes.setName(scheduledItemsDto.getName());
		scheduledItes.setNotes(scheduledItemsDto.getNotes());
		scheduledItes.setStartTime(scheduledItemsDto.getStartTime());
		scheduledItes.setEndTime(scheduledItemsDto.getEndTime());
		scheduledItes.setCreatedBy(scheduledItemsDto.getCreatedBy());
		scheduledItes.setUpdatedBy(scheduledItemsDto.getUpdatedBy());
		scheduledItes.setCreatedOn(scheduledItemsDto.getCreatedOn());
		scheduledItes.setUpdatedOn(scheduledItemsDto.getUpdatedOn());
		scheduledItes.setIsActive(scheduledItemsDto.getIsActive());
		scheduledItes=scheduledItemsRepository.save(scheduledItes);	
		return scheduledItemsDto;
		
	}
	@Override
	public Boolean deleteScheduledItems(Integer id)
	{
		
		Optional<ScheduledItems> optionScheduledItems = scheduledItemsRepository.findById(id);
		if(optionScheduledItems.isPresent())
		{
			ScheduledItems schduledItems=optionScheduledItems.get();
			schduledItems.setIsActive(false);
			scheduledItemsRepository.save(schduledItems);
			return true;
		}
		return null;
	}
	
	

}
