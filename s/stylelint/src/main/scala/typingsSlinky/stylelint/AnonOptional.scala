package typingsSlinky.stylelint

import typingsSlinky.stylelint.mod.ValidateOptionsAssertion
import typingsSlinky.stylelint.stylelintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptional extends ValidateOptionsAssertion {
  var actual: js.UndefOr[js.Any] = js.native
  var optional: `true` = js.native
  var possible: js.Any = js.native
}

object AnonOptional {
  @scala.inline
  def apply(optional: `true`, possible: js.Any): AnonOptional = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], possible = possible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptional]
  }
  @scala.inline
  implicit class AnonOptionalOps[Self <: AnonOptional] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptional(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPossible(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActual(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actual")(js.undefined)
        ret
    }
  }
  
}

