package uk.ac.belfastmet.topTen.service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import uk.ac.belfastmet.topTen.domain.ToDo;


@Service
public class ToDoService {
	
	private ArrayList<ToDo> tasks;
	public ArrayList<ToDo> gettasks(){
		
		this.tasks = new ArrayList<ToDo>();
		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", false));
		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", true));
		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", false));
		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", true));
		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", false));
		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", true));
		
		
		return this.tasks;
		
	}

	public ArrayList<ToDo> gettasksCompleted()
	
	{
		
		ArrayList<ToDo> todoNew = new ArrayList<ToDo>();
		for(ToDo todo : tasks)
		{
			if(todo.isComplete())
			{
				todoNew.add(todo);
			}
		}
		return todoNew;
		
	}
		
public ArrayList<ToDo> gettasksInCompleted()
	
	{
		
		ArrayList<ToDo> todoNew = new ArrayList<ToDo>();
		for(ToDo todo : tasks)
		{
			if(todo.isComplete())
			{
				
			}
			else
			{
				todoNew.add(todo);
			}
		}
		return todoNew;
		
	}
	

	
	
	

	
}

