package mountain.Mountain.model;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CrewModel {

    private int crewNo;
    private String crewMemberId;
    private int crewboardNo;
}
