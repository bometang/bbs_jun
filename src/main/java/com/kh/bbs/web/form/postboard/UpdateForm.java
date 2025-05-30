package com.kh.bbs.web.form.postboard;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateForm {
  private Long postId;
  @NotBlank(message = "제목은 필수 입니다.")
  @Size(min=1,max=33,message = "제목은 33자를 초과할 수 없습니다.")
  private String title;
  @NotBlank(message = "내용은 필수 입니다.")
  private String content;
  @NotBlank(message = "작성자는 필수 입니다.")
  @Size(min=1,max=6,message = "이름은 6자를 초과할 수 없습니다.")
  private String userName;
  private String udate;
}
