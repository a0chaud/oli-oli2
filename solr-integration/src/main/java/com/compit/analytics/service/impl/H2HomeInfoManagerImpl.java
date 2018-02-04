package com.compit.analytics.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compit.analytics.common.H2HomeDTO;
import com.compit.analytics.domain.impl.H2HomeDomainManagerImpl;
import com.compit.analytics.service.api.H2HomeInfoManager;


@Service
public class H2HomeInfoManagerImpl implements H2HomeInfoManager {

	@Autowired
	private H2HomeDomainManagerImpl h2HomeDomainManagerImpl;
	
	@Override
	public String updateHome(H2HomeDTO h2HomeDto) {
		// TODO Auto-generated method stub
		
		h2HomeDomainManagerImpl.update(h2HomeDto);
		
		return "Successfully Inserted entry for home";
	}

	@Override
	public List<H2HomeDTO> searchHome(String zipCode) {
		// TODO Auto-generated method stub
		List<H2HomeDTO> h2Homes = new ArrayList<H2HomeDTO>();
		
		String query = "zipcode:"+zipCode;
		
		h2Homes = h2HomeDomainManagerImpl.search(query);
		
		//System.out.println(h2Homes);
		
		return h2Homes;
	}

	@Override
	public String welcome() {
		// TODO Auto-generated method stub
		return "Welcome to Housing market analytics";
	}

	@Override
	public List<H2HomeDTO> searchHomeFiql(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.compit.analytics.service.api.H2HomeInfoManager#deleteHomeById(com.compit.analytics.common.H2HomeDTO)
	 */
	public String deleteHomeById(String homeId) {
		// TODO Auto-generated method stub
		String query = "homeid:"+homeId;
		h2HomeDomainManagerImpl.deleteById(query);

		return null;
	}

}
