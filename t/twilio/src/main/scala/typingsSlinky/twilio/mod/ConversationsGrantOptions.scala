package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationsGrantOptions extends js.Object {
  var configurationProfileSid: String = js.native
}

object ConversationsGrantOptions {
  @scala.inline
  def apply(configurationProfileSid: String): ConversationsGrantOptions = {
    val __obj = js.Dynamic.literal(configurationProfileSid = configurationProfileSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationsGrantOptions]
  }
  @scala.inline
  implicit class ConversationsGrantOptionsOps[Self <: ConversationsGrantOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationProfileSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationProfileSid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

