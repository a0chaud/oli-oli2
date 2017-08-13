package com.compit.analytics.domain.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.compit.analytics.common.H2HomeDTO;
import com.compit.analytics.domain.api.H2HomeDomainManager;

@Component
public class H2HomeDomainManagerImpl implements H2HomeDomainManager {

	@Autowired
	H2HomeDomainDAO h2HomeDomainDao;

	private int commitWithinMins = 1000;

	@Override
	public void update(H2HomeDTO h2homeDto) {

		// TODO Auto-generated method stub
		String homeId = UUID.randomUUID().toString();

		h2homeDto.setHomeId(homeId);
		h2homeDto.setCreatedDate(new Date());
		h2homeDto.setModifiedDate(new Date());
		h2homeDto.setCreatedBy("test");
		h2homeDto.setModifiedBy("test");

		try {

			UpdateResponse response = h2HomeDomainDao.getSolrClient().addBean(h2homeDto,commitWithinMins);
			//rely on auto-commit. Try avoid using explicit commit
			//h2HomeDomainDao.getSolrClient().commit();
			System.out.println(response);

		} catch (IOException | SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<H2HomeDTO> search(String query) {
		// TODO Auto-generated method stub
		//System.out.println(query);
		SolrQuery solrQuery = new SolrQuery();
		solrQuery.set("q", query);

		List<H2HomeDTO> h2HomeDTOList = new ArrayList<H2HomeDTO>();
		//System.out.println(solrQuery);
		try {

			QueryResponse queryResponse = h2HomeDomainDao.getSolrClient().query(solrQuery);
			//System.out.println(queryResponse);
			h2HomeDTOList = queryResponse.getBeans(H2HomeDTO.class);

		} catch (SolrServerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return h2HomeDTOList;
	}

}
