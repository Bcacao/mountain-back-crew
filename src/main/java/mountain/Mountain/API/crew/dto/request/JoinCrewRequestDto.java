package mountain.Mountain.API.crew.dto.request;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class JoinCrewRequestDto {

    private String crewMemberId;
    private int crewboardNo;

}
