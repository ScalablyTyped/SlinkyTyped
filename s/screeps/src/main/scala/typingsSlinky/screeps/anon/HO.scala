package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HO extends js.Object {
  var H: typingsSlinky.screeps.screepsStrings.GH = js.native
  var O: typingsSlinky.screeps.screepsStrings.GO = js.native
}

object HO {
  @scala.inline
  def apply(H: typingsSlinky.screeps.screepsStrings.GH, O: typingsSlinky.screeps.screepsStrings.GO): HO = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[HO]
  }
  @scala.inline
  implicit class HOOps[Self <: HO] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: typingsSlinky.screeps.screepsStrings.GH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: typingsSlinky.screeps.screepsStrings.GO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

