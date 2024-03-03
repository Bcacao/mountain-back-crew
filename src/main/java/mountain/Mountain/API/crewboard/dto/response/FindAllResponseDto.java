package mountain.Mountain.API.crewboard.dto.response;

import lombok.*;
import mountain.Mountain.model.CrewModel;
import mountain.Mountain.model.CrewboardModel;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class FindAllResponseDto {

    private int crewboardNo;
    private String memberId;
    private String crewboardMountain;
    private String crewboardContent;
    private LocalDateTime crewboardTime;
    private List<CrewModel> crewModels;

}
