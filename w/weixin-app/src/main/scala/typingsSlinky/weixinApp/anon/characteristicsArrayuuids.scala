package typingsSlinky.weixinApp.anon

import typingsSlinky.weixinApp.weixinAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  characteristics  :std.Array<{  uuid  :string,   properties  :std.Array<{  read  :boolean,   write  :boolean,   notify  :boolean,   indicate  :boolean}>}>} & weixin-app.wx.ErrMsgResponse */
@js.native
trait characteristicsArrayuuids extends js.Object {
  var characteristics: js.Array[Properties] = js.native
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
}

object characteristicsArrayuuids {
  @scala.inline
  def apply(characteristics: js.Array[Properties], errMsg: ok | String): characteristicsArrayuuids = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristicsArrayuuids]
  }
  @scala.inline
  implicit class characteristicsArrayuuidsOps[Self <: characteristicsArrayuuids] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacteristics(value: js.Array[Properties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: ok | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

