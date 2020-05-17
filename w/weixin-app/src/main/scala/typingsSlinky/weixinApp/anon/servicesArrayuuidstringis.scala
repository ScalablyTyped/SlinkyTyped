package typingsSlinky.weixinApp.anon

import typingsSlinky.weixinApp.weixinAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  services  :std.Array<{  uuid  :string,   isPrimary  :boolean}>} & weixin-app.wx.ErrMsgResponse */
@js.native
trait servicesArrayuuidstringis extends js.Object {
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
  var services: js.Array[IsPrimary] = js.native
}

object servicesArrayuuidstringis {
  @scala.inline
  def apply(errMsg: ok | String, services: js.Array[IsPrimary]): servicesArrayuuidstringis = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[servicesArrayuuidstringis]
  }
  @scala.inline
  implicit class servicesArrayuuidstringisOps[Self <: servicesArrayuuidstringis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrMsg(value: ok | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServices(value: js.Array[IsPrimary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

