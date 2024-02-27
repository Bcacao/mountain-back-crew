package mountain.Mountain.API.crewboard.dto.request;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UpdateCrewBoardRequestDto {

    private String crewboardMountain;
    private String crewboardContent;
    private int crewboardNo;

}
