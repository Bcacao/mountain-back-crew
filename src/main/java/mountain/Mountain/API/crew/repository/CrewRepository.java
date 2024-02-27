package mountain.Mountain.API.crew.repository;

import mountain.Mountain.model.CrewModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CrewRepository {

    // crew 생성
    boolean createCrew(int crewboardNo);
    // crew 참가
    boolean joinCrew(CrewModel crewModel);
    // crew 참가 삭제
    boolean deleteCrew(String crewMemeberId, int crewboardNo);
    // crew 현재 참가 인원 체크
    int countJoin(int crewboardNo);
    // crew 참겨 여부 체크
    int checkJoin(String crewMemberId, int crewboardNo);


}
