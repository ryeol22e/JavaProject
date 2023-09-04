package javaproject.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MemberDto {
	private String memberNo;
	private String memberName;
}
