package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.RuleSeverity
import typingsSlinky.tslint.tslintStrings.default
import typingsSlinky.tslint.tslintStrings.none
import typingsSlinky.tslint.tslintStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSeverity extends js.Object {
  var options: js.UndefOr[js.Any] = js.native
  var severity: js.UndefOr[RuleSeverity | warn | none | default] = js.native
}

object AnonSeverity {
  @scala.inline
  def apply(): AnonSeverity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSeverity]
  }
  @scala.inline
  implicit class AnonSeverityOps[Self <: AnonSeverity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: RuleSeverity | warn | none | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
  }
  
}

