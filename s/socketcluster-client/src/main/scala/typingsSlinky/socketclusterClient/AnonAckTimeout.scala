package typingsSlinky.socketclusterClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAckTimeout extends js.Object {
  var ackTimeout: js.UndefOr[Double] = js.native
}

object AnonAckTimeout {
  @scala.inline
  def apply(): AnonAckTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAckTimeout]
  }
  @scala.inline
  implicit class AnonAckTimeoutOps[Self <: AnonAckTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeout")(js.undefined)
        ret
    }
  }
  
}

