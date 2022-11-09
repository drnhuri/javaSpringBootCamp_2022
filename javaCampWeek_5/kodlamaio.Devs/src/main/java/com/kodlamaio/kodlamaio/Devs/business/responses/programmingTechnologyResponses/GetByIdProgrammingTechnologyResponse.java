package com.kodlamaio.kodlamaio.Devs.business.responses.programmingTechnologyResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdProgrammingTechnologyResponse {
	
	private int id;
	private String name;
	private String programmingLanguageName;

}
