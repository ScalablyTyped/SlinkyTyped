package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSuspendUnprocessed extends js.Object {
  var none: Double = js.native
  var suspendUnprocessed: Double = js.native
}

object AnonSuspendUnprocessed {
  @scala.inline
  def apply(none: Double, suspendUnprocessed: Double): AnonSuspendUnprocessed = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], suspendUnprocessed = suspendUnprocessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuspendUnprocessed]
  }
  @scala.inline
  implicit class AnonSuspendUnprocessedOps[Self <: AnonSuspendUnprocessed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspendUnprocessed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendUnprocessed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

