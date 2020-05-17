package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.LH2O
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OH extends js.Object {
  var OH: LH2O = js.native
}

object OH {
  @scala.inline
  def apply(OH: LH2O): OH = {
    val __obj = js.Dynamic.literal(OH = OH.asInstanceOf[js.Any])
    __obj.asInstanceOf[OH]
  }
  @scala.inline
  implicit class OHOps[Self <: OH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOH(value: LH2O): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OH")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

