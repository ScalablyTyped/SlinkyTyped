package typingsSlinky.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  /**
    * @deprecated
    * Tslint now handles disables itself.
    * This will be empty.
    */
  var disabledIntervals: js.Array[IDisabledInterval] = js.native
  var ruleArguments: js.Array[_] = js.native
  var ruleName: String = js.native
  var ruleSeverity: RuleSeverity = js.native
}

object IOptions {
  @scala.inline
  def apply(
    disabledIntervals: js.Array[IDisabledInterval],
    ruleArguments: js.Array[_],
    ruleName: String,
    ruleSeverity: RuleSeverity
  ): IOptions = {
    val __obj = js.Dynamic.literal(disabledIntervals = disabledIntervals.asInstanceOf[js.Any], ruleArguments = ruleArguments.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSeverity = ruleSeverity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def withRuleArguments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleSeverity(value: RuleSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSeverity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

