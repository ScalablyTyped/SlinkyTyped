package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.ShareTickets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----分享
@js.native
trait ShareAppMessage
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 分享描述, 默认为当前小程序名称
  		 */
  var desc: js.UndefOr[String] = js.native
  /**
  		 * 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径，支持PNG及JPG
  		 * 不传入 imageUrl 则使用默认截图。显示图片长宽比是 5:4
  		 * @version 1.5.0
  		 */
  var imageUrl: js.UndefOr[String] = js.native
  /**
  		 * 分享路径  当默认为前页面 path ，
  		 * 必须是以 / 开头的完整路径
  		 *
  		 */
  var path: js.UndefOr[String] = js.native
  @JSName("success")
  var success_ShareAppMessage: js.UndefOr[js.Function1[/* res */ ShareTickets, Unit]] = js.native
  /**
  		 * 分享标题  默认为当前小程序名称
  		 *
  		 */
  var title: js.UndefOr[String] = js.native
}

object ShareAppMessage {
  @scala.inline
  def apply(): ShareAppMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareAppMessage]
  }
  @scala.inline
  implicit class ShareAppMessageOps[Self <: ShareAppMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ ShareTickets => Unit): Self = {
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
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

