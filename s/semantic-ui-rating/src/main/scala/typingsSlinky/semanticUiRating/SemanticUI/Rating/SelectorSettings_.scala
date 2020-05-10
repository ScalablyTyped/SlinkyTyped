package typingsSlinky.semanticUiRating.SemanticUI.Rating

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-rating.SemanticUI.Rating.SelectorSettings.Param */
@js.native
trait SelectorSettings_ extends js.Object {
  var icon: js.UndefOr[String] = js.native
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
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
  }
  
}

