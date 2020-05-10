package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageList extends js.Object {
  var cluid: String = js.native
  var flag_read: Double = js.native
  var msgid: Double = js.native
  var subject: String = js.native
  var timestamp: Double = js.native
}

object MessageList {
  @scala.inline
  def apply(cluid: String, flag_read: Double, msgid: Double, subject: String, timestamp: Double): MessageList = {
    val __obj = js.Dynamic.literal(cluid = cluid.asInstanceOf[js.Any], flag_read = flag_read.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageList]
  }
  @scala.inline
  implicit class MessageListOps[Self <: MessageList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlag_read(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag_read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

