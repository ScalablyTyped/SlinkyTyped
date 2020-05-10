package typingsSlinky.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadImageConfig extends WxBaseRequestConfig {
  /**
    * 默认为1，显示进度提示
    */
  var isShowProgressTips: js.UndefOr[Double] = js.native
  /**
    * 要上传的图片的本地 ID，由 chooseImage 接口获得
    */
  var localId: String = js.native
  /**
    * res: var serverId = res.serverId;  返回图片的服务器端 ID
    */
  @JSName("success")
  def success_MUploadImageConfig(res: js.Any): Unit = js.native
}

object UploadImageConfig {
  @scala.inline
  def apply(localId: String, success: js.Any => Unit): UploadImageConfig = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[UploadImageConfig]
  }
  @scala.inline
  implicit class UploadImageConfigOps[Self <: UploadImageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsShowProgressTips(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShowProgressTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsShowProgressTips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShowProgressTips")(js.undefined)
        ret
    }
  }
  
}

