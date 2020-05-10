package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.screenBufferHDMod.IsBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlending extends js.Object {
  var blending: IsBlending = js.native
}

object AnonBlending {
  @scala.inline
  def apply(blending: IsBlending): AnonBlending = {
    val __obj = js.Dynamic.literal(blending = blending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlending]
  }
  @scala.inline
  implicit class AnonBlendingOps[Self <: AnonBlending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlending(value: IsBlending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

