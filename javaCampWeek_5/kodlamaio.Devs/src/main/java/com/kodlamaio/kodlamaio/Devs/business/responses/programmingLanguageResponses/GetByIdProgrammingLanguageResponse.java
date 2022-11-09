package com.kodlamaio.kodlamaio.Devs.business.responses.programmingLanguageResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdProgrammingLanguageResponse {

	private int id;
	private String name;
}
