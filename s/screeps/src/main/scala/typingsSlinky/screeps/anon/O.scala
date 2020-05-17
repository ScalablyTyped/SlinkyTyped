package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.LH
import typingsSlinky.screeps.screepsStrings.LO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait O extends js.Object {
  var H: LH = js.native
  var O: LO = js.native
  var U: typingsSlinky.screeps.screepsStrings.UL = js.native
}

object O {
  @scala.inline
  def apply(H: LH, O: LO, U: typingsSlinky.screeps.screepsStrings.UL): O = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
    __obj.asInstanceOf[O]
  }
  @scala.inline
  implicit class OOps[Self <: O] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: LH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: LO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: typingsSlinky.screeps.screepsStrings.UL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("U")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

