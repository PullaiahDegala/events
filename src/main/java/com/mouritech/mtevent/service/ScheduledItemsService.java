package com.mouritech.mtevent.service;

import com.mouritech.mtevent.dto.ScheduledItemsDto;

public interface ScheduledItemsService 
{
	public Object createScheduledItems(ScheduledItemsDto scheduledItemsDto);
	public Object updateScheduledItems(ScheduledItemsDto scheduledItemsDto);
    public Boolean deleteScheduledItems(Integer id);
}
