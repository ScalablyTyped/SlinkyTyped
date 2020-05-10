package typingsSlinky.valerie.Valerie_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRule extends js.Object {
  var defaultOptions: ValidationOptions = js.native
  def test(value: js.Any): ValidationResult = js.native
}

object IRule {
  @scala.inline
  def apply(defaultOptions: ValidationOptions, test: js.Any => ValidationResult): IRule = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[IRule]
  }
  @scala.inline
  implicit class IRuleOps[Self <: IRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOptions(value: ValidationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: js.Any => ValidationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

