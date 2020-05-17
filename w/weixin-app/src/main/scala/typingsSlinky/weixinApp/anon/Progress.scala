package typingsSlinky.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  /** 上传进度百分比 */
  var progress: Double = js.native
  /** 预期需要上传的数据总长度，单位 Bytes */
  var totalBytesExpectedToSend: Double = js.native
  /** 已经上传的数据长度，单位 Bytes */
  var totalBytesSent: Double = js.native
}

object Progress {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesExpectedToSend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesExpectedToSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesSent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

