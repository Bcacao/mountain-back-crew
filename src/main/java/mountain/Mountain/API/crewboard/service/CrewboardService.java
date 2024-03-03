package mountain.Mountain.API.crewboard.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mountain.Mountain.API.crew.repository.CrewRepository;
import mountain.Mountain.API.crewboard.dto.request.CreateCrewBoardRequestDto;
import mountain.Mountain.API.crewboard.dto.request.DeleteCrewBoardRequestDto;
import mountain.Mountain.API.crewboard.dto.request.UpdateCrewBoardRequestDto;
import mountain.Mountain.API.crewboard.dto.response.FindAllResponseDto;
import mountain.Mountain.API.crewboard.repository.CrewBoardRepository;
import mountain.Mountain.model.CrewboardModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CrewboardService {

    final CrewBoardRepository crewBoardRepository;
    final CrewRepository crewRepository;

    // 크루 모집방 생성
    public void makeCrewBoard(CreateCrewBoardRequestDto dto, String memberId){

        // dto를 entity로 변환
        CrewboardModel crewboardModel = CrewboardModel.builder()
                .crewboardMountain(dto.getCrewboardMountain())
                .crewboardContent(dto.getCrewboardContent())
                .memberId(memberId)
                .build();

        // 쿼리문이 동작하면 true 동작하지 않으면 false
        crewBoardRepository.createCrewBoard(crewboardModel);

        // crew table 생성
        crewRepository.createCrew(crewboardModel.getCrewboardNo());


    }

    // 크루 모집방 수정
    public boolean modifyCrewBoard(UpdateCrewBoardRequestDto dto, String memberId){

        // 수정할 crewboard를 crewboardNo로 검색
        CrewboardModel foundCrewBoard = crewBoardRepository.findCrewBoard(dto.getCrewboardNo());

        // dto를 entity로 변환
        CrewboardModel crewboardModel = CrewboardModel.builder()
                .crewboardMountain(dto.getCrewboardMountain())
                .crewboardContent(dto.getCrewboardContent())
                .crewboardNo(dto.getCrewboardNo())
                .build();

        // session에서 memberId 와 검색한 crewboard의 memberId가 같은지 확인
        if(foundCrewBoard.getMemberId() == memberId){
            return crewBoardRepository.updateCrewBoard(crewboardModel);
        }

        return false;

    }

    // 크루 모집방 삭제
    public boolean removeCrewBoard(DeleteCrewBoardRequestDto dto, String memberId){

        // 수정할 crewboard를 crewboardNo로 검색
        CrewboardModel foundCrewBoard = crewBoardRepository.findCrewBoard(dto.getCrewboardNo());

        // session에서 memberId 와 검색한 crewboard의 memberId가 같은지 확인
        if(foundCrewBoard.getMemberId() == memberId){
            return crewBoardRepository.deleteCrewBoard(dto.getCrewboardNo());
        }

        return false;
    }

    // 크루 모집방 목록 전체
    public List<FindAllResponseDto> findAllCrewBoard(){

        // crewboard 전체 list
        return crewBoardRepository.findAllCrewBoard();

    }

    // 내가 만든 크루 모집방 목록
    public List<FindAllResponseDto> findMyCrewBoard(String memberId){

        // crewboard 내가 만든방 list
        return crewBoardRepository.findMyCrewBoard(memberId);

    }



}
