package comp74.nelsonlab2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Posting {
    
    Integer postingId;
    String postingText;
    LocalDate date;
    LocalTime time;
    String username;




    
    public void setDateAndTime(LocalDateTime datetime)
    {
        this.date = datetime.toLocalDate();
        this.time = datetime.toLocalTime();
    }




}
