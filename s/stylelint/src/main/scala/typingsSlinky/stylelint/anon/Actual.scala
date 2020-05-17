package typingsSlinky.stylelint.anon

import typingsSlinky.stylelint.mod.ValidateOptionsAssertion
import typingsSlinky.stylelint.stylelintBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actual extends ValidateOptionsAssertion {
  var actual: js.Any = js.native
  var optional: js.UndefOr[`false`] = js.native
  var possible: js.UndefOr[js.Any] = js.native
}

object Actual {
  @scala.inline
  def apply(actual: js.Any): Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actual]
  }
  @scala.inline
  implicit class ActualOps[Self <: Actual] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActual(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
    @scala.inline
    def withPossible(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPossible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possible")(js.undefined)
        ret
    }
  }
  
}

