package typingsSlinky.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShrinkWidth extends js.Object {
  var shrink: js.UndefOr[Width] = js.native
}

object ShrinkWidth {
  @scala.inline
  def apply(): ShrinkWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShrinkWidth]
  }
  @scala.inline
  implicit class ShrinkWidthOps[Self <: ShrinkWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShrink(value: Width): Self = {
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

