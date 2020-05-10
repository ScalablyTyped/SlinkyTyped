package typingsSlinky.when.When

import typingsSlinky.when.whenStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectedDescriptor
  extends Descriptor[js.Any]
     with Snapshot[js.Any] {
  var reason: js.Any = js.native
  var state: rejected = js.native
}

object RejectedDescriptor {
  @scala.inline
  def apply(reason: js.Any, state: rejected): RejectedDescriptor = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectedDescriptor]
  }
  @scala.inline
  implicit class RejectedDescriptorOps[Self <: RejectedDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: rejected): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

