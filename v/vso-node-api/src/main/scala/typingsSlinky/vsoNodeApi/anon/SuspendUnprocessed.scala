package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendUnprocessed extends js.Object {
  var none: scala.Double = js.native
  var suspendUnprocessed: scala.Double = js.native
}

object SuspendUnprocessed {
  @scala.inline
  def apply(none: scala.Double, suspendUnprocessed: scala.Double): SuspendUnprocessed = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], suspendUnprocessed = suspendUnprocessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendUnprocessed]
  }
  @scala.inline
  implicit class SuspendUnprocessedOps[Self <: SuspendUnprocessed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspendUnprocessed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendUnprocessed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

