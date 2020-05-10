package typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings.Param */
@js.native
trait RegExpSettings_ extends js.Object {
  var escape: js.UndefOr[js.RegExp] = js.native
}

object RegExpSettings_ {
  @scala.inline
  def apply(): RegExpSettings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegExpSettings_]
  }
  @scala.inline
  implicit class RegExpSettings_Ops[Self <: RegExpSettings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscape(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
  }
  
}

