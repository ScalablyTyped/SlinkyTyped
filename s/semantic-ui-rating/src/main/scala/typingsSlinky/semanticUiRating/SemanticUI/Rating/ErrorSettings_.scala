package typingsSlinky.semanticUiRating.SemanticUI.Rating

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-rating.SemanticUI.Rating.ErrorSettings.Param */
@js.native
trait ErrorSettings_ extends js.Object {
  var action: js.UndefOr[String] = js.native
}

object ErrorSettings_ {
  @scala.inline
  def apply(): ErrorSettings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorSettings_]
  }
  @scala.inline
  implicit class ErrorSettings_Ops[Self <: ErrorSettings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
  }
  
}

