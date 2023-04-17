package com.me.todolist.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * HTTP 응답으로 사용할 DTO
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class ResponseDTO<T> {

	private String error;
	private List<T> data;
}
