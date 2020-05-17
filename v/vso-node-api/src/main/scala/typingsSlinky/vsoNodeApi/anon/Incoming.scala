package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Incoming extends js.Object {
  var inProgress: scala.Double = js.native
  var incoming: scala.Double = js.native
  var outgoing: scala.Double = js.native
}

object Incoming {
  @scala.inline
  def apply(inProgress: scala.Double, incoming: scala.Double, outgoing: scala.Double): Incoming = {
    val __obj = js.Dynamic.literal(inProgress = inProgress.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Incoming]
  }
  @scala.inline
  implicit class IncomingOps[Self <: Incoming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInProgress(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncoming(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incoming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoing(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

