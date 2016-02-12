package com.FCMN.core;

/**
 * This class is a node class. 
 * 	The node is a node in the network pattern and 
 * 	can send message to any other node of a pattern
 * @author junrongwang
 *
 */
public class Node {
	
	int nodeId;
	String groupId;
	int added;		// 0 : not added       1: added 
	int active;		// 0: not active       1: inactive
	int connector;	// 0: not a connector  1: connector
	
	public Node(){
		
	}
	
	public Node(int nodeId, String groupId, int added, int active, 
		int connector){
		
		this.nodeId = nodeId;
		this.groupId = groupId;
		this.added = added;
		this.active = active;
		this.connector = connector;
	}
	/**
	 * The below methods are some getter and setter methods
	 * @return
	 */
	
	public int getNodeId() {
		return nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public int getAdded() {
		return added;
	}

	public void setAdded(int added) {
		this.added = added;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getConnector() {
		return connector;
	}

	public void setConnector(int connector) {
		this.connector = connector;
	}
	

	/**
	 * This method is a format to show a node information
	 */
	@Override
	public String toString() {
		return String.format("Node [nodeId=%s, groupId=%s, "
			+ "added=%s, active=%s, connector=%s]",
			nodeId, groupId, added, active, connector);
	}
	
	public String getNodeInfo() {
		return "nodeId:" + this.getNodeId() + "  "
            + "groupId:" + this.getGroupId() + "  "
              + "added:" + this.getAdded() + "  "
             + "active:" + this.getActive() + "  "
           +"connector:" + this.getConnector() + "\n";
	}

}
