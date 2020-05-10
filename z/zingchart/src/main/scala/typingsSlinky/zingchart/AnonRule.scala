package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRule extends js.Object {
  /**
    * A rule allows you to include logic in order to apply a set of attributes only to certain aspects of your chart that meet the crite
    * ria specified within each "rule": group. You can include any number of "rule": groups nested within a "rules": set. Place the desi
    * red attribute or attributes within each "rule": group to apply those attributes to the areas that fulfill the requirement. The eff
    * ect of rules depends largely on the placement of the "rules": set within your JSON code. In the above example, the styling attribu
    * tes within each rule will be applied to the scale-y guide. "%c == 2" | "%v <= 0" | "%v > 0" | ...
    */
  var rule: js.UndefOr[String] = js.native
}

object AnonRule {
  @scala.inline
  def apply(): AnonRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRule]
  }
  @scala.inline
  implicit class AnonRuleOps[Self <: AnonRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
  }
  
}

