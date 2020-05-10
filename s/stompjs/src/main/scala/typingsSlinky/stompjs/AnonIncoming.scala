package typingsSlinky.stompjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncoming extends js.Object {
  var incoming: Double = js.native
  var outgoing: Double = js.native
}

object AnonIncoming {
  @scala.inline
  def apply(incoming: Double, outgoing: Double): AnonIncoming = {
    val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncoming]
  }
  @scala.inline
  implicit class AnonIncomingOps[Self <: AnonIncoming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncoming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incoming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

