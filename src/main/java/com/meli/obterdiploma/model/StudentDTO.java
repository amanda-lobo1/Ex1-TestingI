package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
public class StudentDTO {

    @NotNull(message = "O nome do aluno não pode estar vazio!")
    @Pattern(regexp = "ˆ[A-Z] [a-zàáâéèêíïóôöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]+$",message = "O nome do aluno deve começar com letra maiúscula!")
    @Size(max = 50, message = "O comprimento do nome não pode exceder 50 caracteres!")
    String studentName;
    String message;
    Double averageScore;

    @NotNull(message = "A lista não pode estar vazia!")
    @Size(min = 1)
    List<@Valid SubjectDTO> subjects;
}
