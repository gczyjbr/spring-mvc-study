package pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author ��ɭ�� 2019/04/01
 */

public class UploadedImageFile {
  MultipartFile image;

  public MultipartFile getImage() {
    return image;
  }

  public void setImage(MultipartFile image) {
    this.image = image;
  }

}
