package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnProgressDownloadResult extends js.Object {
  /**
    * 下载进度百分比
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * 预期需要下载的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToWrite: js.UndefOr[Double] = js.native
  /**
    * 已经下载的数据长度，单位 Bytes
    */
  var totalBytesWritten: js.UndefOr[Double] = js.native
}

object OnProgressDownloadResult {
  @scala.inline
  def apply(): OnProgressDownloadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnProgressDownloadResult]
  }
  @scala.inline
  implicit class OnProgressDownloadResultOps[Self <: OnProgressDownloadResult] (val x: Self) extends AnyVal {
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
    def withTotalBytesExpectedToWrite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesExpectedToWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesExpectedToWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesExpectedToWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesWritten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesWritten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesWritten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesWritten")(js.undefined)
        ret
    }
  }
  
}

