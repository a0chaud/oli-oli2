package com.compit.analytics.domain.api;

import java.util.List;

import com.compit.analytics.common.H2HomeDTO;

public interface H2HomeDomainManager {
	
	public void update(H2HomeDTO h2homeDto);
	
	public List<H2HomeDTO> search(String query);
	
	public void deleteById(String solrQuery);

}
