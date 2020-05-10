package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContextTakePhotoResult extends js.Object {
  /**
    * 照片文件的临时路径，安卓是jpg图片格式，ios是png
    */
  var tempImagePath: js.UndefOr[String] = js.native
}

object CameraContextTakePhotoResult {
  @scala.inline
  def apply(): CameraContextTakePhotoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextTakePhotoResult]
  }
  @scala.inline
  implicit class CameraContextTakePhotoResultOps[Self <: CameraContextTakePhotoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempImagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempImagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempImagePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempImagePath")(js.undefined)
        ret
    }
  }
  
}

