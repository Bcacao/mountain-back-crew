package mountain.Mountain.API.crewboard.repository;

import mountain.Mountain.API.crewboard.dto.response.FindAllResponseDto;
import mountain.Mountain.model.CrewboardModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CrewBoardRepository {

    // CrewBoard방 생성
    boolean createCrewBoard(CrewboardModel crewboardModel);
    // CrewBoard방 찾기
    CrewboardModel findCrewBoard(int crewboardId);
    // CrewBoard방 수정
    boolean updateCrewBoard(CrewboardModel crewboardModel);
    // CrewBoard방 삭제
    boolean deleteCrewBoard(int crewboardId);
    // CrewBoard방 전체 검색
    List<FindAllResponseDto> findAllCrewBoard();
    // CrewBoard방 내방만 검색
    List<FindAllResponseDto> findMyCrewBoard(String memberId);
}
