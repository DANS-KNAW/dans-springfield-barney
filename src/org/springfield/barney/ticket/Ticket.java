/* 
* Ticket.java
* 
* Copyright (c) 2012 Noterik B.V.
* 
* This file is part of barney, related to the Noterik Springfield project.
*
* Barney is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* Barney is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with Lou.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.springfield.barney.ticket;

import java.util.Date;

import org.springfield.barney.tools.MD5;

/**
 * Container for ticket data.
 * 
 * @author Derk Crezee <d.crezee@noterik.nl>
 * @copyright Copyright: Noterik B.V. 2009
 * @package org.springfield.barney.ticket
 * @access private
 *
 */
public class Ticket {
	
	private String userID;
	private String domainID;
	private Date expirationDate;
	private Date creationDate;
	private String random;
	
	/** Date used for validation */
	private Date now;
	
	/**
	 * @param userID
	 * @param domainID
	 * @param expirationDate
	 * @param creationDate
	 * @param random
	 */
	public Ticket(String userID, String domainID, Date expirationDate, Date creationDate, String random) {
		this.userID = userID;
		this.domainID = domainID;
		this.expirationDate = expirationDate;
		this.creationDate = creationDate;
		this.random = random;
		this.now = new Date();
	}
	
	/**
	 * Returns the hashed ticket value
	 * 
	 * @return the hashed ticket value
	 */
	public String getTicketValue() {
		String key = "Ticket [userID=" + userID + ", domainID="
		+ domainID + ", creationDate=" + creationDate + ", random=" + 
		random + "]";
		return MD5.getHashValue(key);
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
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the random
	 */
	public String getRandom() {
		return random;
	}

	/**
	 * @param random the random to set
	 */
	public void setRandom(String random) {
		this.random = random;
	}
	
	/**
	 * @return the now
	 */
	public Date getNow() {
		return now;
	}

	@Override
	public String toString() {
		return "Ticket [userID=" + userID + ", domainID="
				+ domainID + ", creationDate=" + creationDate + 
				", expirationDate=" + expirationDate + ", random=" + 
				random + "]";
	}
	
}
