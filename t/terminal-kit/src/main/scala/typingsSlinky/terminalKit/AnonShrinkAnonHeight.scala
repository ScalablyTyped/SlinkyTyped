package typingsSlinky.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShrinkAnonHeight extends js.Object {
  var shrink: js.UndefOr[AnonHeight] = js.native
}

object AnonShrinkAnonHeight {
  @scala.inline
  def apply(): AnonShrinkAnonHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonShrinkAnonHeight]
  }
  @scala.inline
  implicit class AnonShrinkAnonHeightOps[Self <: AnonShrinkAnonHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShrink(value: AnonHeight): Self = {
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

