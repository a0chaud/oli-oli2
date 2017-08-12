package com.compit.analytics.domain.api;

import org.springframework.stereotype.Component;

import com.compit.analytics.common.H2HomeDTO;

public interface H2HomeDomainManager {
	
	public void update(H2HomeDTO h2homeDto);
	
	public H2HomeDTO search(String query);

}
