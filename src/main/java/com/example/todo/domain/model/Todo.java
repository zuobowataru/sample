package com.example.todo.domain.model;

import java.io.Serializable;
import java.util.Date;

// JPAのエンティティである@Entityアノテーションをつける
public class Todo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String todoId;

	private String todoGroup;
    private String todoTitle;

    private boolean finished;
    
	private String contents;
    private Date timelimit;

    private Date createdAt;

	public String getTodoId() {
		return todoId;
	}

	public void setTodoId(String todoId) {
		this.todoId = todoId;
	}

	public String getTodoTitle() {
		return todoTitle;
	}
    public String getTodoGroup() {
		return todoGroup;
	}

	public void setTodoGroup(String todoGroup) {
		this.todoGroup = todoGroup;
	}
	
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getTimelimit() {
		return timelimit;
	}

	public void setTimelimit(Date timelimit) {
		this.timelimit = timelimit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	// 追加分
 	private long viewcount;
	private long allcount;
	
	public long getViewcount() {
		return viewcount;
	}

	public void setViewcount(long viewCount2) {
		this.viewcount = viewCount2;
	}

	public long getAllcount() {
		return allcount;
	}

	public void setAllcount(long allcount) {
		this.allcount = allcount;
	}

	
 }
