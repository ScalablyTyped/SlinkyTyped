package typingsSlinky.wpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelf extends js.Object {
  var self: String = js.native
}

object AnonSelf {
  @scala.inline
  def apply(self: String): AnonSelf = {
    val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelf]
  }
  @scala.inline
  implicit class AnonSelfOps[Self <: AnonSelf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

