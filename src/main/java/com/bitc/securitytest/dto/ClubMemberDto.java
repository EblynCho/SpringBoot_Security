package com.bitc.securitytest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

// 데이터 베이스의 정보를 가져오기 위한 클래스
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClubMemberDto {
    private String email;  // 해당 DB 에서 id의 역할을 하는 컬럼
    private String password;
    private String name;
    private boolean fromSocial;

//    사용자의 권한을 저장하는 변수
//    만약 DB 에 컬럼이 따로 존재 시, 일반 String 타입으로 사용해도 됨 (한 사람에게 하나의 권한을 줄때 일반적으로 사용)
//    한사람에게 여러 권한(user, admin 등)을 주려고 이렇게 작성함
    private Set<ClubMemberRole> roleSet = new HashSet<>();

//    사용자 권한을 추가하기 위한 메서드
//    만약 데이터 베이스에 컬럼이 따로 존재 시 해당 메서드는 필요 없음
    public void addMemberRole(ClubMemberRole clubMemberRole) {
        roleSet.add(clubMemberRole);
    }
}
