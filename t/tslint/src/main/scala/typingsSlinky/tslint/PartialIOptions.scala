package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IDisabledInterval
import typingsSlinky.tslint.ruleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tslint.tslint/lib/language/rule/rule.IOptions> */
@js.native
trait PartialIOptions extends js.Object {
  var disabledIntervals: js.UndefOr[js.Array[IDisabledInterval]] = js.native
  var ruleArguments: js.UndefOr[js.Array[_]] = js.native
  var ruleName: js.UndefOr[String] = js.native
  var ruleSeverity: js.UndefOr[RuleSeverity] = js.native
}

object PartialIOptions {
  @scala.inline
  def apply(): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOptions]
  }
  @scala.inline
  implicit class PartialIOptionsOps[Self <: PartialIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledIntervals(value: js.Array[IDisabledInterval]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledIntervals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledIntervals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledIntervals")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleArguments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleSeverity(value: RuleSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSeverity")(js.undefined)
        ret
    }
  }
  
}

