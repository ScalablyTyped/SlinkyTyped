package typingsSlinky.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShrinkAnonWidth extends js.Object {
  var shrink: js.UndefOr[AnonWidth] = js.native
}

object AnonShrinkAnonWidth {
  @scala.inline
  def apply(): AnonShrinkAnonWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonShrinkAnonWidth]
  }
  @scala.inline
  implicit class AnonShrinkAnonWidthOps[Self <: AnonShrinkAnonWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShrink(value: AnonWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(js.undefined)
        ret
    }
  }
  
}

