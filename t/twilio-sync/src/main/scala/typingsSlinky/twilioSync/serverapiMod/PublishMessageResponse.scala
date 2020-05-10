package typingsSlinky.twilioSync.serverapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishMessageResponse extends js.Object {
  var sid: String = js.native
}

object PublishMessageResponse {
  @scala.inline
  def apply(sid: String): PublishMessageResponse = {
    val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishMessageResponse]
  }
  @scala.inline
  implicit class PublishMessageResponseOps[Self <: PublishMessageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

