package io.javabrains.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class TopicService {

	private List<topic> topics = new ArrayList<>(Arrays.asList(
			
			new topic("spring" , "spring framework" , "sdes "),
			new topic("java" , "core java" , "jdes "),
			new topic("python" , "django" , " pdes")
			
			));
			
	public List<topic> getAllTopics()
	{
		return topics;
	}
	
	public topic getTopic(String id)
	{
		return topics.stream().filter( t -> t.getId().equals(id)).findFirst().get() ;
	}

	public void addTopic(topic Topic) {
		
		topics.add(Topic);
	}

	public void updateTopic(String id, topic Topic) {
		for(int i = 0; i < topics.size(); i++)
		{
			topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, Topic);
				return;
			}
		}	
	}

	public void deleteTopic(String id) {
		topics.removeIf(t ->t.getId().equals(id));	
	}
	
}
