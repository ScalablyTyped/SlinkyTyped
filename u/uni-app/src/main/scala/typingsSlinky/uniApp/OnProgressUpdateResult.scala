package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnProgressUpdateResult extends js.Object {
  /**
    * 上传进度百分比
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * 预期需要上传的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToSend: js.UndefOr[Double] = js.native
  /**
    * 已经上传的数据长度，单位 Bytes
    */
  var totalBytesSent: js.UndefOr[Double] = js.native
}

object OnProgressUpdateResult {
  @scala.inline
  def apply(): OnProgressUpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnProgressUpdateResult]
  }
  @scala.inline
  implicit class OnProgressUpdateResultOps[Self <: OnProgressUpdateResult] (val x: Self) extends AnyVal {
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
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesExpectedToSend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesExpectedToSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesExpectedToSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesExpectedToSend")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesSent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesSent")(js.undefined)
        ret
    }
  }
  
}

