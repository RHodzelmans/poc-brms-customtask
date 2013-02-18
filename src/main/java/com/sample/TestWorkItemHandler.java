package com.sample;

import org.drools.runtime.process.WorkItem;
import org.drools.runtime.process.WorkItemHandler;
import org.drools.runtime.process.WorkItemManager;

public class TestWorkItemHandler implements WorkItemHandler {

	@Override
	public void abortWorkItem(WorkItem workItem, WorkItemManager mngr) {
		System.out.println("Doing nothing");

	}

	@Override
	public void executeWorkItem(WorkItem workItem, WorkItemManager mngr) {
		System.out.println("Running instance: " + workItem.getId() + " from: " + workItem.getName());
		mngr.completeWorkItem(workItem.getId(), null);
	}
}
