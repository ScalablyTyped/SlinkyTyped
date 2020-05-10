package typingsSlinky.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocked extends js.Object {
  var locked: Boolean = js.native
}

object AnonLocked {
  @scala.inline
  def apply(locked: Boolean): AnonLocked = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocked]
  }
  @scala.inline
  implicit class AnonLockedOps[Self <: AnonLocked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

