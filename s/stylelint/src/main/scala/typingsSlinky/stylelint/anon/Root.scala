package typingsSlinky.stylelint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Root extends js.Object {
  var root: js.Any = js.native
  var ruleName: String = js.native
  var ruleSettings: js.Any = js.native
}

object Root {
  @scala.inline
  def apply(root: js.Any, ruleName: String, ruleSettings: js.Any): Root = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSettings = ruleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  @scala.inline
  implicit class RootOps[Self <: Root] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

