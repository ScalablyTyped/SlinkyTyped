package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBox extends js.Object {
  var checkBox: scala.Double = js.native
  var combo: scala.Double = js.native
  var none: scala.Double = js.native
  var passwordBox: scala.Double = js.native
  var radioButtons: scala.Double = js.native
  var textArea: scala.Double = js.native
  var textBox: scala.Double = js.native
}

object CheckBox {
  @scala.inline
  def apply(
    checkBox: scala.Double,
    combo: scala.Double,
    none: scala.Double,
    passwordBox: scala.Double,
    radioButtons: scala.Double,
    textArea: scala.Double,
    textBox: scala.Double
  ): CheckBox = {
    val __obj = js.Dynamic.literal(checkBox = checkBox.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], passwordBox = passwordBox.asInstanceOf[js.Any], radioButtons = radioButtons.asInstanceOf[js.Any], textArea = textArea.asInstanceOf[js.Any], textBox = textBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBox]
  }
  @scala.inline
  implicit class CheckBoxOps[Self <: CheckBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckBox(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCombo(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordBox(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioButtons(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextArea(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextBox(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

