package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadSuccessData extends js.Object {
  /**
    * 开发者服务器返回的 HTTP 状态码
    */
  var statusCode: js.UndefOr[Double] = js.native
  /**
    * 临时文件路径，下载后的文件会存储到一个临时文件
    */
  var tempFilePath: js.UndefOr[String] = js.native
}

object DownloadSuccessData {
  @scala.inline
  def apply(): DownloadSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadSuccessData]
  }
  @scala.inline
  implicit class DownloadSuccessDataOps[Self <: DownloadSuccessData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTempFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePath")(js.undefined)
        ret
    }
  }
  
}

