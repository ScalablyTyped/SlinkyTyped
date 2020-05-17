package typingsSlinky.weappApi.mod.wx

import typingsSlinky.weappApi.anon.AppId
import typingsSlinky.weappApi.anon.Vetsion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 帐号信息
@js.native
trait AccountInfo extends js.Object {
  //  插件帐号信息（仅在插件中调用时包含这一项）
  var Plugin: Vetsion = js.native
  //  小程序帐号信息
  var miniProgram: AppId = js.native
}

object AccountInfo {
  @scala.inline
  def apply(Plugin: Vetsion, miniProgram: AppId): AccountInfo = {
    val __obj = js.Dynamic.literal(Plugin = Plugin.asInstanceOf[js.Any], miniProgram = miniProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlugin(value: Vetsion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiniProgram(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniProgram")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

