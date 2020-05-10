package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContextStopRecordResult extends js.Object {
  /**
    * 封面图片文件的临时路径
    */
  var tempThumbPath: js.UndefOr[String] = js.native
  /**
    * 视频的文件的临时路径
    */
  var tempVideoPath: js.UndefOr[String] = js.native
}

object CameraContextStopRecordResult {
  @scala.inline
  def apply(): CameraContextStopRecordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextStopRecordResult]
  }
  @scala.inline
  implicit class CameraContextStopRecordResultOps[Self <: CameraContextStopRecordResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempThumbPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempThumbPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempThumbPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempThumbPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTempVideoPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempVideoPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempVideoPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempVideoPath")(js.undefined)
        ret
    }
  }
  
}

