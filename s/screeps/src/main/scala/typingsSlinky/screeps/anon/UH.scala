package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UH extends js.Object {
  var UH: Attack = js.native
  var UH2O: `6` = js.native
  var XUH2O: `7` = js.native
}

object UH {
  @scala.inline
  def apply(UH: Attack, UH2O: `6`, XUH2O: `7`): UH = {
    val __obj = js.Dynamic.literal(UH = UH.asInstanceOf[js.Any], UH2O = UH2O.asInstanceOf[js.Any], XUH2O = XUH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[UH]
  }
  @scala.inline
  implicit class UHOps[Self <: UH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUH(value: Attack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUH2O(value: `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXUH2O(value: `7`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XUH2O")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

