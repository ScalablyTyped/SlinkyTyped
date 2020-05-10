package typingsSlinky.semanticUiNag.SemanticUI.Nag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-nag.SemanticUI.Nag.SelectorSettings.Param */
@js.native
trait SelectorSettings_ extends js.Object {
  var close: js.UndefOr[String] = js.native
}

object SelectorSettings_ {
  @scala.inline
  def apply(): SelectorSettings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectorSettings_]
  }
  @scala.inline
  implicit class SelectorSettings_Ops[Self <: SelectorSettings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
  }
  
}

