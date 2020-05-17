package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `19` extends js.Object {
  var OH: typingsSlinky.screeps.screepsStrings.LHO2 = js.native
}

object `19` {
  @scala.inline
  def apply(OH: typingsSlinky.screeps.screepsStrings.LHO2): `19` = {
    val __obj = js.Dynamic.literal(OH = OH.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  @scala.inline
  implicit class `19Ops`[Self <: `19`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOH(value: typingsSlinky.screeps.screepsStrings.LHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OH")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

