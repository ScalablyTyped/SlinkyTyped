package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait onLaunchOptions extends js.Object {
  /** 启动小程序的路径 */
  var path: String = js.native
  /** 启动小程序的query参数 */
  var query: js.Object = js.native
  /** 来源信息。从另一个小程序、公众号或App进入小程序时返回。范泽返回{} */
  var referrerInfo: typingsSlinky.weappApi.mod.wx.referrerInfo = js.native
  /** 启动小程序的场景值 */
  var scene: Double = js.native
  var shareTicket: String = js.native
}

object onLaunchOptions {
  @scala.inline
  def apply(path: String, query: js.Object, referrerInfo: referrerInfo, scene: Double, shareTicket: String): onLaunchOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[onLaunchOptions]
  }
  @scala.inline
  implicit class onLaunchOptionsOps[Self <: onLaunchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrerInfo(value: referrerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShareTicket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareTicket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

