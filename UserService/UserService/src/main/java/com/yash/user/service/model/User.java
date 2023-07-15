package com.yash.user.service.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MASTER_USER")
@Entity
@Builder
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "UserId")
  private Long userId;

  @Column(name = "UserName")
  private String userName;

  @Column(name = "UserEmailId")
  private String userEmailId;

  @Column(name = "UserAbout")
  private String userabout;
  
  @Transient // to ignore while storing data into sql or ignore this fields
  private List<Rating> ratings= new ArrayList<> ();
}
