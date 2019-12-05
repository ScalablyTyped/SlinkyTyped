package typingsSlinky.stylelint

import typingsSlinky.stylelint.stylelintMod.ValidateOptionsAssertion
import typingsSlinky.stylelint.stylelintNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActualOptional extends ValidateOptionsAssertion {
  var actual: js.UndefOr[js.Any] = js.undefined
  var optional: `true`
  var possible: js.Any
}

object Anon_ActualOptional {
  @scala.inline
  def apply(optional: `true`, possible: js.Any, actual: js.Any = null): Anon_ActualOptional = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], possible = possible.asInstanceOf[js.Any])
    if (actual != null) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActualOptional]
  }
}

