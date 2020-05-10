package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckBox extends js.Object {
  var checkBox: Double = js.native
  var combo: Double = js.native
  var none: Double = js.native
  var passwordBox: Double = js.native
  var radioButtons: Double = js.native
  var textArea: Double = js.native
  var textBox: Double = js.native
}

object AnonCheckBox {
  @scala.inline
  def apply(
    checkBox: Double,
    combo: Double,
    none: Double,
    passwordBox: Double,
    radioButtons: Double,
    textArea: Double,
    textBox: Double
  ): AnonCheckBox = {
    val __obj = js.Dynamic.literal(checkBox = checkBox.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], passwordBox = passwordBox.asInstanceOf[js.Any], radioButtons = radioButtons.asInstanceOf[js.Any], textArea = textArea.asInstanceOf[js.Any], textBox = textBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckBox]
  }
  @scala.inline
  implicit class AnonCheckBoxOps[Self <: AnonCheckBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckBox(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCombo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordBox(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioButtons(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextBox(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

