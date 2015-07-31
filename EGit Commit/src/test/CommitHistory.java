package test;
import org.eclipse.egit.github.core.service.*;
import org.eclipse.egit.github.core.*;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.util.*;

import org.eclipse.egit.github.core.client.*;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.net.*;

//commitservicetest libs
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.egit.github.core.CommitComment;
import org.eclipse.egit.github.core.CommitStatus;
import org.eclipse.egit.github.core.RepositoryCommit;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.client.GitHubRequest;
import org.eclipse.egit.github.core.client.GitHubResponse;
import org.eclipse.egit.github.core.client.PageIterator;
import org.eclipse.egit.github.core.service.CommitService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

//commitstatus file lib
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Date;
import org.eclipse.egit.github.core.util.DateUtils;

public class CommitHistory
{
	  public static void main(String[] args){
		  CommitServiceTest ctest = new CommitServiceTest();
		  
	  }

	  /**
	  * Unit tests of {@link CommitService}
	  */
	  @RunWith(MockitoJUnitRunner.class)
	  public static class CommitServiceTest {
	  @Mock
	  	private GitHubClient client;
	  @Mock
	  	private GitHubResponse response;
	  	private CommitService service;
	  /**
	  * Test case set up
	  *
	  * @throws IOException
	  */
	 
	  /**
	  * Create service using default constructor
	  */
	  @Test
	  	public void constructor() {
		  assertNotNull(new CommitService().getClient());
	  }
	  /**
	  * Get commits
	  *
	  * @throws IOException
	  */
	  @Test
	  	public void getCommits() throws IOException {
		  	RepositoryId repo = new RepositoryId("bzhang93", "Spoon-Knife");
		  	service.getCommits(repo);
		  	GitHubRequest request = new GitHubRequest();
		  	request.setUri(Utils.page("/repos/bzhang93/Spoon-Knife/commits"));
		  	verify(client).get(request);
	  	}
	  }
}



	
	
	/*
	public List<RepositoryCommit> accessCommitHistory()
	{
		

			 
		String commitsha;
		Commit commithistory = new Commit();
		CommitService getCommitList = new CommitService();

		URL repoUrl = new URL("https://github.com/BZhang93/hello-world");
		RepositoryId repoID = RepositoryId.createFromUrl(repoUrl);
		
		IRepositoryIdProvider repoIDinstance = new IRepositoryIdProviderImpl();
		
		String repoID = repoIDinstance.generateId();
		
		commitsha = commithistory.getSha();

		List<RepositoryCommit> commitlist;
		commitlist = getCommitList.getCommits(repoIDinstance);
		
		return commitlist;

	}*/
