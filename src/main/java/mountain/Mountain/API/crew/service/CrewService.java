package mountain.Mountain.API.crew.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mountain.Mountain.API.crew.repository.CrewRepository;
import mountain.Mountain.API.crewboard.dto.request.CreateCrewBoardRequestDto;
import mountain.Mountain.API.crewboard.dto.request.DeleteCrewBoardRequestDto;
import mountain.Mountain.API.crewboard.dto.request.UpdateCrewBoardRequestDto;
import mountain.Mountain.API.crewboard.repository.CrewBoardRepository;
import mountain.Mountain.model.CrewModel;
import mountain.Mountain.model.CrewboardModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CrewService {

    final CrewRepository crewRepository;

    // crew 참가
    public boolean joinCrew(int crewboardNo, String crewMemberId){

        CrewModel crewModel = CrewModel.builder()
                .crewboardNo(crewboardNo)
                .crewMemberId(crewMemberId)
                .build();

        // crew에 내가 참여 했는지 여부 확인(참여 안헀으면0)
        int checkedJoin = crewRepository.checkJoin(crewMemberId, crewboardNo);

        // crew에 몇명이 참여해 있는지 확인
        int countedJoin = crewRepository.countJoin(crewboardNo);

        if(countedJoin != 0 && countedJoin < 4){
          return crewRepository.joinCrew(crewModel);
        }

        return false;

    }

    // crew 참가 삭제
    public boolean deleteCrew(int crewboardNo, String crewMemberId){

        // crew에 내가 참여 했는지 여부 확인(참여 안헀으면0)
        int checkedJoin = crewRepository.checkJoin(crewMemberId, crewboardNo);

        if(checkedJoin != 1){
           return crewRepository.deleteCrew(crewMemberId, crewboardNo);
        }

        return false;
    }

    // crew 현재 참가 인원 체크
    public int countedJoin(int crewboardNo){

        return crewRepository.countJoin(crewboardNo);
    }

    // crew 참가 여부 체크
    public boolean checkedJoin(String crewMemberId, int crewboardNo){

        int checkjoin = crewRepository.checkJoin(crewMemberId, crewboardNo);

        return checkjoin != 0;
    }

}
