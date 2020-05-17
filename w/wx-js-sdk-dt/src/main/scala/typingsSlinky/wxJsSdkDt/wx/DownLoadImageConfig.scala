package typingsSlinky.wxJsSdkDt.wx

import typingsSlinky.wxJsSdkDt.anon.LocalId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownLoadImageConfig extends WxBaseRequestConfig {
  var isShowProgressTips: js.UndefOr[Double] = js.native
  /**
    * serverId: 需要下载的图片的服务器端ID，由 uploadImage 接口获得
    */
  var serverId: String = js.native
  /**
    * var localId = res.localId;  返回图片下载后的本地 ID
    */
  @JSName("success")
  var success_DownLoadImageConfig: js.UndefOr[js.Function1[/* res */ LocalId, Unit]] = js.native
}

object DownLoadImageConfig {
  @scala.inline
  def apply(serverId: String): DownLoadImageConfig = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownLoadImageConfig]
  }
  @scala.inline
  implicit class DownLoadImageConfigOps[Self <: DownLoadImageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverId")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withSuccess(value: /* res */ LocalId => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

