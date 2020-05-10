package typingsSlinky.tslint.objectLiteralShorthandRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var enforceShorthandMethods: Boolean = js.native
  var enforceShorthandProperties: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(enforceShorthandMethods: Boolean, enforceShorthandProperties: Boolean): Options = {
    val __obj = js.Dynamic.literal(enforceShorthandMethods = enforceShorthandMethods.asInstanceOf[js.Any], enforceShorthandProperties = enforceShorthandProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnforceShorthandMethods(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceShorthandMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforceShorthandProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceShorthandProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

