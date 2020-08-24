package typingsSlinky.semanticUiProgress.SemanticUI.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-progress.SemanticUI.Progress.RegExpSettings.Param */
@js.native
trait RegExpSettings_ extends js.Object {
  var variable: js.RegExp with js.UndefOr[js.RegExp] = js.native
}

object RegExpSettings_ {
  @scala.inline
  def apply(variable: js.RegExp with js.UndefOr[js.RegExp]): RegExpSettings_ = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpSettings_]
  }
  @scala.inline
  implicit class RegExpSettings_Ops[Self <: RegExpSettings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVariable(value: js.RegExp with js.UndefOr[js.RegExp]): Self = this.set("variable", value.asInstanceOf[js.Any])
  }
  
}

