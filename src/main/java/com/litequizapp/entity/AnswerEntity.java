package com.litequizapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "answers")
public class AnswerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
      generator = "answer_seq")
  @SequenceGenerator(name = "answer_seq",
      sequenceName = "answer_sequence", allocationSize = 1)
  @Column(name = "id")
  @Getter
  private Long id;

  @Column(name = "title")
  @Getter
  @Setter
  @NonNull
  private String title;

  @Column(name = "is_right")
  @Getter
  @Setter
  private Boolean isRight;


  @Override
  public String toString() {
    return String.format("Answer[id='%d', title='%s']", id, title);
  }

}
