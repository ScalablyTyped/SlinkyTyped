package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends js.Object {
  var button: String = js.native
  var buttonAdd: String = js.native
  var buttonRemove: String = js.native
  var iconAdd: String = js.native
  var iconRemove: String = js.native
  var root: String = js.native
}

object Button {
  @scala.inline
  def apply(
    button: String,
    buttonAdd: String,
    buttonRemove: String,
    iconAdd: String,
    iconRemove: String,
    root: String
  ): Button = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonAdd = buttonAdd.asInstanceOf[js.Any], buttonRemove = buttonRemove.asInstanceOf[js.Any], iconAdd = iconAdd.asInstanceOf[js.Any], iconRemove = iconRemove.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonAdd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconAdd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

