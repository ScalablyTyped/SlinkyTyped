package typingsSlinky.webgme.anon

import typingsSlinky.webgme.GmeCommon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishTime extends js.Object {
  var finishTime: String = js.native
  var messages: js.Array[Message] = js.native
  var pluginName: String = js.native
  var success: Boolean = js.native
}

object FinishTime {
  @scala.inline
  def apply(finishTime: String, messages: js.Array[Message], pluginName: String, success: Boolean): FinishTime = {
    val __obj = js.Dynamic.literal(finishTime = finishTime.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishTime]
  }
  @scala.inline
  implicit class FinishTimeOps[Self <: FinishTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinishTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

