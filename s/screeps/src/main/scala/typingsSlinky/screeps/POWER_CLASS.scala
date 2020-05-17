package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait POWER_CLASS extends js.Object {
  var OPERATOR: operator = js.native
}

object POWER_CLASS {
  @scala.inline
  def apply(OPERATOR: operator): POWER_CLASS = {
    val __obj = js.Dynamic.literal(OPERATOR = OPERATOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[POWER_CLASS]
  }
  @scala.inline
  implicit class POWER_CLASSOps[Self <: POWER_CLASS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOPERATOR(value: operator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPERATOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

