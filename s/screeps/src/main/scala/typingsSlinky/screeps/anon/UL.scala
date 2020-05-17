package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UL extends js.Object {
  var UL: typingsSlinky.screeps.screepsStrings.G = js.native
}

object UL {
  @scala.inline
  def apply(UL: typingsSlinky.screeps.screepsStrings.G): UL = {
    val __obj = js.Dynamic.literal(UL = UL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UL]
  }
  @scala.inline
  implicit class ULOps[Self <: UL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUL(value: typingsSlinky.screeps.screepsStrings.G): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

