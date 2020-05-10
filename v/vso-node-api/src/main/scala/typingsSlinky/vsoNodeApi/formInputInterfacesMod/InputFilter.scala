package typingsSlinky.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputFilter extends js.Object {
  /**
    * Groups of input filter expressions. This filter matches a set of inputs if any (one or more) of the groups evaluates to true.
    */
  var conditions: js.Array[InputFilterCondition] = js.native
}

object InputFilter {
  @scala.inline
  def apply(conditions: js.Array[InputFilterCondition]): InputFilter = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFilter]
  }
  @scala.inline
  implicit class InputFilterOps[Self <: InputFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[InputFilterCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

