package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --启动参数
@js.native
trait LaunchOption extends js.Object {
  /**
    * 当前小游戏是否被显示在聊天顶部
    */
  var isSticky: Boolean = js.native
  /**
    * 启动参数
    */
  var query: js.Any = js.native
  /**
    * 场景值
    */
  var scene: Double = js.native
  /**
    * 票据
    */
  var shareTicket: String = js.native
}

object LaunchOption {
  @scala.inline
  def apply(isSticky: Boolean, query: js.Any, scene: Double, shareTicket: String): LaunchOption = {
    val __obj = js.Dynamic.literal(isSticky = isSticky.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOption]
  }
  @scala.inline
  implicit class LaunchOptionOps[Self <: LaunchOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
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

