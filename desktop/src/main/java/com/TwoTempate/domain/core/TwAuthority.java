package com.TwoTempate.domain.core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



/**
 *
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
 * build:   </p>
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC </br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TwAuthority")
public class TwAuthority extends TwBaseAuthority {


	/**
	*
	* For now this class is only used to make the compile succeed
	* and therefore it is not meant to be used - Dan Castillo 01/28/2015
	*
	*/

	@Transient
	private final Log logger = LogFactory.getLog(getClass());

	@Id
	@GeneratedValue
	private long id;
	@Column
	private String authority;


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}


	public boolean isPermitted(String authstring) {
		logger.debug("Authority- In isPermitted " + " authstring is:"
														+ authstring);
		logger.debug("Authority- In isPermitted " + " this.authority is:"
				+ this.authority);

		int roleNeeded = super.getRoleHierArchyPosition(authstring);

		if(roleNeeded <= super.getRoleHierArchyPosition(this.authority)) {
			logger.debug("Authority- In isPermitted " + "return code is: true");
			return true;
		}
		logger.debug("Authority- In isPermitted " + "return code is: false");
		return false;
	}


}