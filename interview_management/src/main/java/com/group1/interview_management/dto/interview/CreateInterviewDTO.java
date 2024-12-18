package com.group1.interview_management.dto.interview;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;

import com.group1.interview_management.common.location_validation.ValidInterviewLocation;
import com.group1.interview_management.common.schedule_validation.ValidInterviewTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ValidInterviewTime
@ValidInterviewLocation
public class CreateInterviewDTO {
     @NotNull(message = "{ME002}")
     @NotBlank(message = "{ME002}")
     // @Max(value = 500, message = "{ME022.7}")
     @Size(max = 500, message = "{ME022.7}")
     String interview_title;

     @NotNull(message = "{ME002}")
     @Min(value = 1, message = "{ME002}")
     Integer interview_job;
     
     @NotNull(message = "{ME002}")
     @Min(value = 1, message = "{ME002}")
     Integer interview_candidate;
     
     @NotNull(message = "{ME002}")
     @NotEmpty(message = "{ME002}")
     Integer[] interviewer_tag;
     
     @NotNull(message = "{ME002}")
     LocalDate interview_schedule;
     
     @NotNull(message = "{ME002}")
     LocalTime startTime;
     
     @NotNull(message = "{ME002}")
     LocalTime endTime;
     
     @NotNull(message = "{ME002}")
     @Min(value = 1, message = "{ME002}")
     Integer interview_recruiter;
     
     @Size(max = 500, message = "{ME022.8}")
     String interview_location;
     String note;
     @Size(max = 500, message = "{ME022.8}")
     String meetingLink;
     String error;
}
