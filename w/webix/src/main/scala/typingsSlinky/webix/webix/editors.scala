package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait editors extends js.Object {
  @JSName("$popup")
  var $popup: js.Any = js.native
  var checkbox: String = js.native
  var color: String = js.native
  var combo: String = js.native
  var date: String = js.native
  var `inline-checkbox`: String = js.native
  var `inline-text`: String = js.native
  var multiselect: String = js.native
  var password: String = js.native
  var popup: String = js.native
  var richselect: String = js.native
  var select: String = js.native
  var text: String = js.native
}

object editors {
  @scala.inline
  def apply(
    $popup: js.Any,
    checkbox: String,
    color: String,
    combo: String,
    date: String,
    `inline-checkbox`: String,
    `inline-text`: String,
    multiselect: String,
    password: String,
    popup: String,
    richselect: String,
    select: String,
    text: String
  ): editors = {
    val __obj = js.Dynamic.literal($popup = $popup.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], richselect = richselect.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("inline-checkbox")(`inline-checkbox`.asInstanceOf[js.Any])
    __obj.updateDynamic("inline-text")(`inline-text`.asInstanceOf[js.Any])
    __obj.asInstanceOf[editors]
  }
  @scala.inline
  implicit class editorsOps[Self <: editors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$popup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCombo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInline-checkbox`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline-checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInline-text`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline-text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiselect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRichselect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

