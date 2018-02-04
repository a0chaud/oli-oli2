package com.compit.analytics.domain.impl;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.stereotype.Component;

@Component
public class H2HomeDomainDAO {

	//:TODO: move this to property file or spring configuration
	//private String solrUrl = "http://71.19.252.27:51577/solr/h2";
	//private String solrUrl = "http://71.19.252.114:51577/solr/h2";
	private String solrUrl = "http://10.0.0.175:8983/solr/h2";
	//private String solrUrl = "http://199.241.147.35:51577/solr/h2";

	private SolrClient solrClient = null;

	public H2HomeDomainDAO(){
		solrClient = new HttpSolrClient.Builder(solrUrl).build();
	}

	public SolrClient getSolrClient(){
		return solrClient;
	}
}
