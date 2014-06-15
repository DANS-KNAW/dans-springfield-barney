package org.springfield.barney.member;

/**
 * Container for member data.
 * 
 * @author Derk Crezee <d.crezee@noterik.nl>
 * @copyright Copyright: Noterik B.V. 2009
 * @package org.springfield.barney.group
 * @access private
 *
 */
public class Member {

	private String groupID;
	private String domainID;
	private String userID;
	
	/**
	 * @param groupID
	 * @param domainID
	 * @param userID
	 */
	public Member(String groupID, String domainID, String userID) {
		this.groupID = groupID;
		this.domainID = domainID;
		this.userID = userID;
	}
	/**
	 * @return the groupID
	 */
	public String getGroupID() {
		return groupID;
	}
	/**
	 * @param groupID the groupID to set
	 */
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}
	/**
	 * @return the domainID
	 */
	public String getDomainID() {
		return domainID;
	}
	/**
	 * @param domainID the domainID to set
	 */
	public void setDomainID(String domainID) {
		this.domainID = domainID;
	}
	
	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "Member [domainID=" + domainID + ", groupID=" + groupID
				+ ", userID=" + userID + "]";
	}
	
}